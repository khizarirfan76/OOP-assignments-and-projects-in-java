public class cruiseShip extends ship
{
    protected int maxPassengers;
    public void setMaxPassengers(int maxPassengers)
    {
        this.maxPassengers=maxPassengers;
    }
    public void getMaxPassengers()
    {
        System.out.println(maxPassengers);
    }
    public cruiseShip(String name,String year,int maxPassengers)
    {
        super(name,year);
        this.maxPassengers=maxPassengers;
    }
    @Override
    public void print()
    {
        System.out.println(year);
        System.out.println(name);
        System.out.println(maxPassengers);
    }
}
