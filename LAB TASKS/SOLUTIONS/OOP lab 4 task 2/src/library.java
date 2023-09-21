import java.util.*;

public class library {

        HashMap<String, Book> booksMap = new HashMap<>();


        public void addBook(String title, Book e) {
                booksMap.put(title, e);
        }

        public void removeBook(String title) {
                booksMap.remove(title);
        }

        public void displayBooks() {
                for (Map.Entry<String, Book> e : booksMap.entrySet()) {
                        System.out.println(e);
                }
        }

}
