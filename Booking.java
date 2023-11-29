package BusBooking;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
public class Booking 
{
    String name;
    int busno;
    Date date;

    public Booking()
    {
        Scanner sc=new Scanner(System.in);
        System.out.printf("Enter the Your Name :");
        name=sc.next();

        System.out.printf("Enter the Bus Number :");
        busno=sc.nextInt();

        System.out.printf("Enter the Date you wish to travel dd-mm-yyyy in this Format :");
        String notformateddate=sc.next(); 

        /****Convert string to date formate ****/

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        try 
        {
            Date date = dateFormat.parse(notformateddate);
            this.date=date;
        } 
        catch (ParseException e) 
        {        
            e.printStackTrace();
        }
        sc.close();
    }
    public boolean isavailability(ArrayList<Bus> buses,ArrayList<Booking> booking)
    {
        System.out.printf("Checking the availability for your given details\n");
        int availability=0,count=0;
        for(Bus bus:buses)
        {
            if(bus.getBusNo()==busno)
            {
                availability=bus.getcapcaity();
            }
        }
        for(Booking book:booking)
        {
            if(book.busno==busno && book.date.equals(date))
            {
                count++;
            }
        }
        return count<availability?true:false;
    }
}

