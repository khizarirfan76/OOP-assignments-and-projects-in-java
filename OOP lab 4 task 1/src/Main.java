
import java.util.*;
class Book {
    private String title;
    private String author;
    private double price;
    private int quantity;

    public Book(String title, String author, double price, int quantity) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters and Setters for attributes
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // Display method
    public void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
        System.out.println("Quantity: " + quantity);
        System.out.println();
    }
}


 class Library {
    private Map<String, Book> booksMap = new HashMap<>();;


    public void addBook(Book book) {
        booksMap.put(book.getTitle(), book);
    }

    public void removeBook(String title) {
        booksMap.remove(title);
    }

    public void displayBooks() {
        for (Book book : booksMap.values()) {
            book.display();
        }
    }

    public Set<String> getUniqueAuthors() {
        Set<String> authorsSet = new HashSet<>();
        for (Book book : booksMap.values()) {
            authorsSet.add(book.getAuthor());
        }
        return authorsSet;
    }
}
class LibraryApp {
    public static void main(String[] args) {
        Library library = new Library();

        // Create several instances of the Book class using different titles, authors, prices, and quantities.
        Book book1 = new Book("Java Programming", "John Doe", 29.99, 10);
        Book book2 = new Book("Python Basics", "Jane Smith", 19.99, 5);
        Book book3 = new Book("HTML5 Essentials", "Mike Johnson", 24.99, 8);
        Book book4 = new Book("CSS3 Styling", "Emily White", 14.99, 12);

        // Use the addBook method to add the Book instances to the Library's booksMap.
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);

        // Use the removeBook method to remove a book from the Library's booksMap.
        library.removeBook("Python Basics");

        // Call the displayBooks method to print out the details of all the books in the library.
        System.out.println("Books in the Library:");
        library.displayBooks();

        // Create a HashSet named "authorsSet" to store the unique authors of the books in the library.
        Set<String> authorsSet = library.getUniqueAuthors();

        // Print out the authorsSet to see the unique authors in the library.
        System.out.println("Unique Authors in the Library:");
        for (String author : authorsSet) {
            System.out.println(author);
        }
    }
}
class Main {
    public static void main(String[] args) {
        // Attempt to create an object of the Book class using the empty/default constructor.
        // Note: This will result in an error because we didn't define an empty constructor.

        // Create two instances of the Book class using the empty constructor and set their attributes using the respective setter methods.
        Book book1 = new Book("", "", 0.0, 0);
        book1.setTitle("Java Programming");
        book1.setAuthor("John Doe");
        book1.setPrice(29.99);
        book1.setQuantity(10);

        Book book2 = new Book("", "", 0.0, 0);
        book2.setTitle("Python Basics");
        book2.setAuthor("Jane Smith");
        book2.setPrice(19.99);
        book2.setQuantity(5);

        // Create another two instances of the Book class using the argument constructor and provide the attribute values directly.
        Book book3 = new Book("HTML5 Essentials", "Mike Johnson", 24.99, 8);
        Book book4 = new Book("CSS3 Styling", "Emily White", 14.99, 12);

        // Call the display() method for each Book instance to print out their attribute values.
        book1.display();
        book2.display();
        book3.display();
        book4.display();

        // Instead of calling the display() method separately for each Book instance, use an array to store the Book instances and call the display() method only once for the entire array.
        Book[] booksArray = {book1, book2, book3, book4};
        displayBooksFromArray(booksArray);
    }

    public static void displayBooksFromArray(Book[] books) {
        for (Book book : books) {
            book.display();
        }
    }
}
