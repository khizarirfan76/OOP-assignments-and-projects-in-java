public class bird extends animal
{
    protected bird()
    {
        setId(2);
        System.out.println("im a bird");
    }
    protected bird(int id)
    {
        super(id);
        System.out.println("im a bird");

    }
    @Override
    public void tellAboutYourself()
    {
        System.out.println("im an bird");
    }
    @Override
    public void speak()
    {
        System.out.println( "Family of Birds...");
    }
}
