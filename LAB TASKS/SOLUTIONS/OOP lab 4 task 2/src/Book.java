import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Book {
    String title;
    String author;
    double price;
    int quantity;

    public Book(String title, String author, int quantity, double price) {
        this.author = author;
        this.price = price;
        this.quantity = quantity;
        this.title = title;
    }

    public Book() {
        author = "null";
        price = 0.0;
        quantity = 0;
        title = "null";
    }

    public void display() {
        System.out.println(getAuthor());
        System.out.println(getTitle());
        System.out.println(getQuantity());
        System.out.println(getPrice());
    }


    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;

    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;

    }
    @Override
    public String toString() {
        return "Title: " + title + "\nAuthor: " + author + "\nQuantity: " + quantity + "\nPrice: " + price;
    }
}


