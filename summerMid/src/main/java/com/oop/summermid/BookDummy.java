package com.oop.summermid;

public class BookDummy {
    private int bookId;
    private String bookTitle;
    private String bookGenre;
    private float bookPrice;
    private int totalBookCount;

    public BookDummy(int bookId, String bookTitle, String bookGenre, float bookPrice, int totalBookCount) {
        this.bookId = bookId;
        this.bookTitle = bookTitle;
        this.bookGenre = bookGenre;
        this.bookPrice = bookPrice;
        this.totalBookCount = totalBookCount;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public int getTotalBookCount() {
        return totalBookCount;
    }

    public void setTotalBookCount(int totalBookCount) {
        this.totalBookCount = totalBookCount;
    }

    public float getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(float bookPrice) {
        this.bookPrice = bookPrice;
    }

    public String getBookGenre() {
        return bookGenre;
    }

    public void setBookGenre(String bookGenre) {
        this.bookGenre = bookGenre;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }
}
