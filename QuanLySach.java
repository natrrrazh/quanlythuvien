package Main;

import java.awt.print.Book;
import java.util.List;
public interface QuanLySach {
    void addBook(Book book);
    void removeBook(Book book);
    List<Book> searchBooks(String keyword);
    void displayBooks();
}
