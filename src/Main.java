import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();

        Book book1 = new Book("Book 1", 300, "Author 1", "582");
        Book book2 = new Book("Book 2", 852, "Author 2", "1598");
        Book book3 = new Book("Book 3", 159, "Author 3", "1567");
        Book book4 = new Book("Book 4", 753, "Author 4", "1987");
        Book book5 = new Book("Book 5", 852, "Author 5", "1762");
        Book book6 = new Book("Book 6", 951, "Author 6", "1765");
        Book book7 = new Book("Book 7", 258, "Author 7", "1999");
        Book book8 = new Book("Book 8", 567, "Author 8", "2001");
        Book book9 = new Book("Book 9", 9876, "Author 9", "2002");
        Book book10 = new Book("Book 10", 678, "Author 10", "2023");

        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);
        books.add(book6);
        books.add(book7);
        books.add(book8);
        books.add(book9);
        books.add(book10);

        Map<String, String> newMap = new HashMap<>();
        books.stream().forEach(book -> newMap.put(book.getName(), book.getAuthorName()));

        System.out.println(newMap);

        List<Book> sayfaSayisiYuzdenAz = new ArrayList<>();
        books.stream().filter(book -> book.getPageNumber() > 100).forEach(b -> sayfaSayisiYuzdenAz.add(b));

        System.out.println(sayfaSayisiYuzdenAz);
    }
}
