public class battleShip extends ship
{
    protected int missile;
    public void setMissile(int missile)
    {
        this.missile=missile;
    }
    public void getMissile()
    {
        System.out.println(missile);
    }
    public battleShip(String name,String year,int missile)
    {
        super(name,year);
        this.missile=missile;
    }
    @Override
    public void print()
    {
        System.out.println(name);
        System.out.println(missile);
    }
}
