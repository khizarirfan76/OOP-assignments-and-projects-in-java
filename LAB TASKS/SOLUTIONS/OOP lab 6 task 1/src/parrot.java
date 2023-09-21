public class parrot extends bird
{
    public void getFamily()
    {
        System.out.println(id);
    }
    @Override
    public void tellAboutYourself()
    {
        System.out.println("im an parrot");
    }
    @Override
    public void speak()
    {
        System.out.println( "Trrrr...");
    }
}
