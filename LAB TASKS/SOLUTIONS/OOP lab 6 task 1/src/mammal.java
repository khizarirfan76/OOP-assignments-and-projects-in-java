public class mammal extends animal
{
    protected mammal()
    {
        setId(2);
        System.out.println("im a mammal");
    }
    protected mammal(int id)
    {
        super(id);
        System.out.println("im a mammal");

    }
    @Override
    public void tellAboutYourself()
    {
        System.out.println("im an mammal");
    }
    @Override
    public void speak()
    {
        System.out.println( "Family of Mammals...");
    }
}
