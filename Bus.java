package BusBooking;

public class Bus 
{
    private int BusNo;
    private boolean ac;
    private int capcaity;
    
    public Bus(int busno,boolean ac,int capcaity)
    {
        this.BusNo=busno;
        this.ac=ac;
        this.capcaity=capcaity;
    }
    /******get and set for bus classs ******/
    public int getcapcaity()
    {
        return capcaity;
    }
    public void setcapcaity(int n)
    {
        capcaity=n;
    }
    public int getBusNo() 
    {
        return BusNo;
    }
    public boolean getac()
    {
        return ac;
    }
    public void displaydetails()
    {
        System.out.println("Bus No : "+ BusNo + " AC : "+ ac + " Capcatiy : "+capcaity);
    }
}
