package Main;

public class Book {
    private int id;
    private String title;
    private String author;
    private String genre;
    private int year;
    private String status;

    public Book(int id, String title, String author, String genre, int year, String status) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.year = year;
        this.status = status;
    }

    public Book() {

    }

    public int getId() {
        return id;
    }


    public String getTitle() {
        return title;
    }


    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    public int getYear() {
        return year;
    }

    public String getStatus() {
        return status;
    }

      @Override
    public String toString() {
        return "Book [id=" + id + ", title=" + title + ", author=" + author + ", genre=" + genre + ", year=" + year + ", status=" + status + "]";
    }
}
