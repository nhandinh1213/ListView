package com.example.models;

public class Book {
    int BookImg;
    String BookID;
    String BookName;
    String BookPubC;
    String BookRePub;
    String BookPrice;

    public Book(int bookImg, String bookID, String bookName, String bookPubC, String bookRePub, String bookPrice) {
        BookImg = bookImg;
        BookID = bookID;
        BookName = bookName;
        BookPubC = bookPubC;
        BookRePub = bookRePub;
        BookPrice = bookPrice;
    }

    public int getBookImg() {
        return BookImg;
    }

    public void setBookImg(int bookImg) {
        BookImg = bookImg;
    }

    public String getBookID() {
        return BookID;
    }

    public void setBookID(String bookID) {
        BookID = bookID;
    }

    public String getBookName() {
        return BookName;
    }

    public void setBookName(String bookName) {
        BookName = bookName;
    }

    public String getBookPubC() {
        return BookPubC;
    }

    public void setBookPubC(String bookPubC) {
        BookPubC = bookPubC;
    }

    public String getBookRePub() {
        return BookRePub;
    }

    public void setBookRePub(String bookRePub) {
        BookRePub = bookRePub;
    }

    public String getBookPrice() {
        return BookPrice;
    }

    public void setBookPrice(String bookPrice) {
        BookPrice = bookPrice;
    }
}
