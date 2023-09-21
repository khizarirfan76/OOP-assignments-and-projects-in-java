public class animal
{
    int id;

    public void getId()
    {
        System.out.println(id);
    }
    public void setId(int id)
    {
        this.id=id;
    }
    protected animal()
    {
        setId(0);
        System.out.println("im an animal");
    }
    protected animal(int id)
    {
        setId(id);
        System.out.println("im an animal");

    }

    public void tellAboutYourself()
    {
        System.out.println("im an animal");
    }
    public void speak()
    {
        System.out.println( "I am an Animal, I can't speak...");
    }
}
