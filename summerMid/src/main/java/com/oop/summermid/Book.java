package com.oop.summermid;

public class Book {
    private int bookId;
    private String bookTitle;
    private String bookGenre;
    private float bookPrice;

    public Book(int bookId, String bookTitle, String bookGenre, float bookPrice) {
        this.bookId = bookId;
        this.bookTitle = bookTitle;
        this.bookGenre = bookGenre;
        this.bookPrice = bookPrice;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getBookGenre() {
        return bookGenre;
    }

    public void setBookGenre(String bookGenre) {
        this.bookGenre = bookGenre;
    }

    public float getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(float bookPrice) {
        this.bookPrice = bookPrice;
    }
}
