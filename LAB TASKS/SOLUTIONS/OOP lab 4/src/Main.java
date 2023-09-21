import java.util.ArrayList;

class integerSet
{
    private ArrayList<Integer> list;
    int size;
    public integerSet(int size)
    {
        list = new ArrayList<Integer>();
        this.size=size;
        for(int i=0;i<size;i++)
        {
            int j=0;
            list.set(i,j);
        }

    }

    public void insertElement(int k)
    {
        list.set(k,1);
    }
    public void deleteElement(int m)
    {
        list.set(m,0);
    }

    public void printSet()
    {
        for(int i=0;i<size;i++)
        {
            if(list.get(i)==1)
                System.out.println(list.get(i));
        }
    }
    public integerSet(integerSet other)
    {
        ArrayList<Integer> list = new ArrayList<>(other.list);
    }

    public void unionOfsets(integerSet set1,integerSet set2)
    {

    }

}
class Main
{
    public static void main(String[] args) {

    }
}