package com.oop.summermid;

import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;

public class MainController
{
    @javafx.fxml.FXML
    private TableColumn<BookDummy, Integer> bookCountCol;
    @javafx.fxml.FXML
    private TableColumn<BookDummy, String> titleCol;
    @javafx.fxml.FXML
    private TableColumn<BookDummy, Integer> idCol;
    @javafx.fxml.FXML
    private TableColumn<BookDummy, String> genreCol;
    @javafx.fxml.FXML
    private TableView<BookDummy> tableView;
    @javafx.fxml.FXML
    private TableColumn<BookDummy, Float> priceCol;

    ArrayList<Book> bookList = new ArrayList<>();
    ArrayList<BookDummy> bookDummyList = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {

        // Table
        idCol.setCellValueFactory(new PropertyValueFactory<>("bookId"));
        bookCountCol.setCellValueFactory(new PropertyValueFactory<>("totalBookCount"));
        titleCol.setCellValueFactory(new PropertyValueFactory<>("bookTitle"));
        genreCol.setCellValueFactory(new PropertyValueFactory<>("bookGenre"));
        priceCol.setCellValueFactory(new PropertyValueFactory<>("bookPrice"));

        bookList.add(new Book(1, "Introduction to Algorithms", "CS", 20.0f));
        bookList.add(new Book(2, "The Pragmatic Programmer", "CS", 10.0f));
        bookList.add(new Book(3, "The C Programming Language", "CS", 10.0f));
        bookList.add(new Book(4, "The Java Programming Language", "CS", 20.0f));

        // Dummy Obj Creation
        for (Book b : bookList) {
            bookDummyList.add(new BookDummy(b.getBookId(), b.getBookTitle(), b.getBookGenre(), b.getBookPrice(), bookList.size()));
        }

        tableView.getItems().addAll(bookDummyList);

    }}