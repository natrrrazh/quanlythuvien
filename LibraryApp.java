package Main;

import javafx.application.Application;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
public class LibraryApp extends Application {
    private Library library;


    public static void main(String[] args) {
        launch(args);
    }
    

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Library Management");
        VBox vbox = new VBox();
        vbox.setSpacing(10);
        TextField titleField = new TextField();
        titleField.setText("Title");
        TextField authorField = new TextField();
        authorField.setText("Author");
        TextField yearField = new TextField();
        yearField.setText("Year");
        TextField genreField = new TextField();
        genreField.setText("Genre");
        TextField statusField = new TextField();
        statusField.setText("Status");
        TextField removeIdField = new TextField();
        removeIdField.setText("Book ID to Remove");

        Button addButton = new Button("Add Book");
        addButton.setOnAction(e -> {
            int id = library.addBook();
            String title = titleField.getText();
            String author = authorField.getText();
          int  year = Integer.getInteger(String.valueOf(Integer.parseInt(yearField.getText())));
            String genre = genreField.getText();
            String status = statusField.getText();
            Book book = new Book(id,title,author,genre,year,status);
            library.addBook(book);
            titleField.clear();
            authorField.clear();
            genreField.clear();
            yearField.clear();
            statusField.clear();
        });
        Button removeButton = new Button("Remove Book");
        removeButton.setOnAction(e -> {
            int bookId = Integer.parseInt(removeIdField.getText());
            library.removeBook(bookId);
        });

        Button displayButton = new Button("Display Book");
        displayButton.setOnAction(e -> library.displayBooks());
        Button sortByYearButton = new Button("Sort Books by Year");
        sortByYearButton.setOnAction(e -> library.sortBooksByYear());

        Button sortByTitleButton = new Button("Sort Books by Title");
        sortByTitleButton.setOnAction(e -> library.sortBooksByTitle());
        vbox.getChildren().addAll(titleField, authorField, genreField, yearField, statusField, addButton, displayButton);
        

        Scene scene = new Scene(vbox, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
        }
    }


