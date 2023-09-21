import java.util.Scanner;
class Number
{
    private int number;
    private int rollOver;

    public int increment()
    {
        this.number=(number+1) %rollOver;
        return number;
    }
    public String getTwoDigits()
    {
        if(number<10)
            return "0"+number;
        else {
            return ""+number;
        }
    }

    public void setNumber(int number)
    {
        this.number=number;
    }
    public void setRollOver(int rollOver)
    {
        this.rollOver=rollOver;
    }

}
class Clock
{
   Number hours=new Number();
   Number mins=new Number();
   Number secs=new Number();

   public void clockTick()
   {
        if(secs.increment()==0)
        {
            if(mins.increment()==0)
            {
                hours.increment();
            }

        }

   }
    public Clock(int hours,int mins,int secs) {
        this.hours.setRollOver(24);
        this.mins.setRollOver(60);
        this.secs.setRollOver(60);
        this.hours.setNumber(hours);
        this.mins.setNumber(mins);
        this.secs.setNumber(secs);
    }
    public String getTime()
    {
        return hours.getTwoDigits()+":"+mins.getTwoDigits()+":"+ secs.getTwoDigits();

    }
}
class Main
{
    public static void main(String[] args) throws InterruptedException
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter hours");
        int hours=scan.nextInt();
        System.out.printf("enter minutes");
        int mins=scan.nextInt();
        System.out.printf("enter seconds");
        int secs=scan.nextInt();

        Clock clock = new Clock(hours,mins,secs);

    for (int i=0;i<10;i++)
    {
        System.out.println(clock.getTime());
        clock.clockTick();
        Thread.sleep(1000);
    }


    }
}