public class circle extends shapeWithArea implements basicShape,displayable
{

    private long centerX;
    private long centerY;

    private double radius;

    double area;

    public circle(long centerX,long centerY,double radius)
    {
        this.centerX=centerX;
        this.centerY=centerY;
        this.radius=radius;
        area=calcArea();

    }

    public double getRadius() {
        return radius;
    }

    public long getCenterX() {
        return centerX;
    }

    public long getCenterY() {
        return centerY;
    }

    @Override
    public double calcArea() {
        return 3.14*radius*radius;
    }

    @Override
    public void display() {

        System.out.println(area+" "+getCenterX()+" "+getCenterY()+" "+getRadius());

    }
    @Override
    public void displayWithPrecision(int precision)
    {
        System.out.println(area+" "+getCenterX()+" "+getCenterY()+" "+getRadius());
        System.out.println(precision);
    }
}

