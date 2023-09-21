public class reptile  extends animal
{
    protected reptile()
    {
        setId(1);
        System.out.println("im a reptile");

    }
    protected reptile(int id)
    {
        super(id);
        System.out.println("im a reptile");
    }
    @Override
    public void tellAboutYourself()
    {
        System.out.println("im an reptile");
    }
    @Override
    public void speak()
    {
        System.out.println( "Family of Reptiles...");
    }
}
