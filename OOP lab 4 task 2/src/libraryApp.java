import java.util.*;

class libraryApp
{
    public static void main(String[] args) {

        Book b1=new Book();

        b1.setAuthor("sui Ishida");
        b1.setPrice(1200);
        b1.setTitle("tokyo ghoul");
        b1.setQuantity(345);

        Book b2= new Book();

        b2.setAuthor("army");
        b2.setPrice(1200);
        b2.setTitle("hakoomat-e-pakistan");
        b2.setQuantity(345);

        ArrayList<Book> bookList= new ArrayList<>();
        bookList.add(b1);
        bookList.add(b2);


        library l1 = new library();

        l1.addBook("tokyo Ghoul Volume 1",b1);

        library l2=new library();
        l2.addBook("my downfall", b2);

        ArrayList<library> libraryList= new ArrayList<>();

        libraryList.add(l1);
        libraryList.add(l2);


        HashSet<String> authorSet=new HashSet<>();

        Iterator<Book> e= bookList.iterator();

        while(e.hasNext())
        {
            authorSet.add(e.next().getAuthor());
        }

        System.out.println(authorSet);
    }
}