class safeArray
{
    private int length;
    private int[] data;

    public safeArray()
    {
        length=100;
        data=new int[length];
    }
    public safeArray(int length)
    {
        data=new int[length];
    }

    public void setIndex(int index,int value)
    {
        if(index<0 || index>length)
        {
            System.out.println("error");
        }
        else
        {
            data[index] = value;
        }
    }
    public int getIndex(int index)
    {
        if (index < 0 || index > 100)
        {
            System.out.println("error");
            System.out.println("\n");
            return 0;
        }
        else
        {
            System.out.printf("%d", data[index]);
            System.out.println("\n");
            return 0;
        }
    }

    public void maxValue()
    {
        int max = data[0];
        for (int i = 1; i < length; i++)
        {
            if (data[i] > max)
            {
                max = data[i];
            }
        }
        System.out.printf("the max value is %d",max);
        System.out.println("\n");
    }
    public void minValue()
    {
        int min = data[0];
        for (int i = 1; i < length; i++) {
            if(data[i]!=0) {
                if (data[i] < min)
                {
                    min = data[i];
                }
            }
        }
        System.out.printf("the min value is %d",min);
        System.out.println("\n");
    }

    public void sum()
    {
        int sum=0;
        for (int i=0 ;i<length;i++)
        {
            sum=sum+data[i];
        }
        System.out.printf("the sum is %d",sum);
    }

}
class Main
{
    public static void main(String[] args)
    {
        safeArray obj=new safeArray();

        obj.setIndex(6,100);
        obj.setIndex(0,20);
        obj.setIndex(202,67);
        obj.getIndex(6);
        obj.maxValue();
        obj.minValue();
        obj.sum();


    }
}