package Main;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Library {
    private int id;
    private String name;
    private List<Book> books;

    public Library(int id, String name) {
        this.id = id;
        this.name = name;
        this.books = new ArrayList<Book>();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(int book) {
        books.remove(book);
    }
    public void sortBooksByYear() {
        books.sort(Comparator.comparingInt(Book::getYear));
    }
    public void sortBooksByTitle() {
        books.sort(Comparator.comparing(Book::getTitle));
    }

    public List<Book> searchBooks(String keyword) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().contains(keyword) || book.getAuthor().contains(keyword)) {
                result.add(book);
            }
        }
        return result;
    }

    public void displayBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    @Override
    public String toString() {
        return "Library{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", totalBooks=" + books.size() +
                '}';
    }


    public int addBook() {
        return 0;
    }
}