public class ship
{
    protected String name;
    protected String year;
    protected void getName()
    {
        System.out.println(name);
    }
    protected void setName(String name)
    {
        this.name=name;
    }
    protected void getYear()
    {
        System.out.println(year);
    }
    protected void setYear(String year)
    {
        this.year=year;
    }
    public ship()
    {
        setName("xyz");
        setYear("0000");
    }
    public ship(String name,String year)
    {
        setYear(year);
        setName(name);
    }
    public void print()
    {
        System.out.println(year);
        System.out.println(name);
    }

}
