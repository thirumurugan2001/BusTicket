import java.util.Scanner;
import java.text.ParseException;
import java.util.ArrayList;
import BusBooking.Booking;
import BusBooking.Bus;
// import java.util.NoSuchElementException;
public class BusBooking 
{
    public static void main(String[] args) throws ParseException 
    {
        
        /***** ArrayList For  Booking and Bus Class to store the Booking and bus Details *****/

        /** For store Bus dateils as ann object **/

        ArrayList <Bus> buses=new ArrayList<Bus>();
        buses.add(new Bus(1,true,2));
        buses.add(new Bus(2,true,5));
        buses.add(new Bus(3,true,5));
        buses.add(new Bus(4,true,5));
        buses.add(new Bus(5,true,5));
        buses.add(new Bus(6,true,5));
        buses.add(new Bus(7,true,5));
        buses.add(new Bus(8,true,5));
        buses.add(new Bus(9,true,5));
        buses.add(new Bus(10,true,5));

        /******* For store the Booking detials *******/

        ArrayList<Booking> bookings=new ArrayList<Booking>();

        /************* Logic for user's wish for booking and for details **************/
        Scanner sc=new Scanner(System.in);
        int n=0,userOption=0;
        while (true)
        {
            System.out.printf("For booking, press 1. For details, press 2. Otherwise, press 0 : ");
            if (sc.hasNextInt()) 
            {
                userOption = sc.nextInt();
            } 
            else 
            {
                System.out.println("Invalid input. Please enter a valid integer.");
                sc.next(); 
                continue;
            }
            if(userOption==1)
            {
                System.out.println("Your bus booking has begun. Please provide the details for your booking.");
                Booking booking=new Booking();
                boolean result=booking.isavailability(buses,bookings);
                if(result== true )
                {
                    System.out.println("Booking ...... ");

                    bookings.add(booking);

                    System.out.println("Booking Confirmed !");
                }
                else
                {
                    System.out.println("Sorry, the seats are full. Please try another bus or date.");
                }
            }
            else if(userOption==2)
            {
                System.out.printf("These are the relevant details : \n");
                for(Bus value:buses)
                {
                    value.displaydetails();
                }
            }
            else if(userOption==0)
            {
                System.out.println("Thanks ! Have a Good Day !");
            }
            else 
            {
                System.out.println("Invalid Input Please enter the Valid in Input");
            }

            /* loop break the logic  */

            System.out.println("Would you like to book again? ");
            System.out.printf("For booking, press 1, Otherwise, press 0 : ");
            if (sc.hasNextInt()) 
            {
                n = sc.nextInt();
                if (n == 1) 
                {
                    continue;
                } 
                else if (n == 0) 
                {
                    System.out.println("Thanks! Have a Good Day!");
                    break;
                } 
                else 
                {
                    System.out.println("Invalid input. Exiting the program.");
                    break;
                }
            } 
            else 
            {
                System.out.println("Invalid input. Exiting the program.");
                break;
            }
        }
    }
        
}


