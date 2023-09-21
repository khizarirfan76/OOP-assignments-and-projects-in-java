public class Main
{
    public static void main(String[] args)
    {
        animal animal=new animal(10);
        System.out.println("----------------------");
        reptile reptile=new reptile(21);
        System.out.println("----------------------");
        bird bird=new bird(30);
        System.out.println("----------------------");
        mammal mammal=new mammal(20);
        System.out.println("----------------------");
        snake snake=new snake();
        System.out.println("----------------------");
        parrot parrot=new parrot();
        System.out.println("----------------------");
        horse horse=new horse();
        System.out.println("----------------------");
        animal.tellAboutYourself();
        animal.speak();
        System.out.println("------------------------");
        mammal.speak();
        mammal.tellAboutYourself();
        System.out.println("--------------------------");
        snake.getFamily();
        snake.tellAboutYourself();
        snake.speak();

    }
}