public class rectangle extends shapeWithArea implements displayable,basicShape {
    private long width;
    private long length;

    private double area;


    public rectangle(long width,long length)
    {
        this.length=length;
        this.width=width;
        area = calcArea();
    }
    @Override
    public double calcArea()
    {
        return width*length;
    }
    @Override
    public void display()
    {
        System.out.println(width+" "+length+" "+area);
    }
    @Override
    public void displayWithPrecision(int precision){
        System.out.println(width+" "+length+" "+area);
        System.out.println(precision);

    }

}
