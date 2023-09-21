import java.util.*;
class Main
{
    public static void main(String[] args)
    {

        ship[] ship = new ship[4];
        ship[0] = new ship("A", "2000");
        ship[1] = new cruiseShip("B", "2010", 2000);
        ship[2] = new cargoShip("C", "2015", 5000);
        ship[3] = new battleShip("D", "2022", 100);

        for(ship s : ship)
        {
            s.print();
            System.out.println("-----------------------");
        }
    }

}