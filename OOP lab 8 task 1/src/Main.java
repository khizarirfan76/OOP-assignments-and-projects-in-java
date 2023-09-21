import java.util.*;

class Main
{
    public static void main(String[] args)
    {
        circle c1=new circle(1,2,3);

        rectangle r1= new rectangle(1,2);

        c1.display();
        c1.displayWithPrecision(5);

        r1.display();
        r1.displayWithPrecision(2);

    }
}