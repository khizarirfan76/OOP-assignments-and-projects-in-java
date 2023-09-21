public class snake extends reptile
{
    public void getFamily()
    {
        System.out.println(id);
    }
    @Override
    public void tellAboutYourself()
    {
        System.out.println("im an snake");
    }
    @Override
    public void speak()
    {
        System.out.println( "Shhh..");
    }

}
