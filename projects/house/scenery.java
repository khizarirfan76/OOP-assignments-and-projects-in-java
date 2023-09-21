class scenery
{   
 public static void main(String[] args)
    {
        Person human=new Person();
        human.makeVisible();
        human.moveHorizontal(-200);

        Square square=new Square();
        square.moveVertical(60);
        square.changeColor("black");
        square.makeVisible();

        Triangle triangle=new Triangle();
        triangle.makeVisible();
        triangle.changeColor("red");
        triangle.moveVertical(-16);
        triangle.moveHorizontal(130);

        Circle circle=new Circle();
        circle.makeVisible();
        circle.moveHorizontal(-85);
        circle.moveVertical(-50);
        circle.changeColor("yellow");
}

}