public class cargoShip extends ship
{
    protected int maxCapacity;
    public void setMaxCapacity(int maxCapacity)
    {
        this.maxCapacity=maxCapacity;
    }
    public void getMaxCapacity()
    {
        System.out.println(maxCapacity);
    }
    public cargoShip(String name,String year,int maxCapacity)
    {
        super(name,year);
        this.maxCapacity=maxCapacity;
    }
    @Override
    public void print()
    {
        System.out.println(name);
        System.out.println(maxCapacity);
    }
}
