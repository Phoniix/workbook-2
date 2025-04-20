package com.pluralsight;

public class Book {

// Variable Introduction ----------------------------------------------------------------------------------------------
private int bookID;
private String bookISBN;
private String bookTitle;
private boolean bookIsCheckedOut;
private String bookIsCheckedOutTo;

// Constructor // -----------------------------------------------------------------------------------------------------
    public Book(int bookID, String bookISBN, String bookTitle, boolean bookIsCheckedOut, String bookIsCheckedOutTo) {
        this.bookID = bookID;
        this.bookISBN = bookISBN;
        this.bookTitle = bookTitle;
        this.bookIsCheckedOut = bookIsCheckedOut;
        this.bookIsCheckedOutTo = bookIsCheckedOutTo;
    }

    //Getters// -------------------------------------------------------------------------------------------------------
    public int getBookID() {
        return bookID;
    }
    public String getBookISBN() {
        return bookISBN;
    }
    public String getBookTitle() {
        return bookTitle;
    }
    public boolean getIsBookIsCheckedOut() {
        return bookIsCheckedOut;
    }
    public String getBookIsCheckedOutTo() {
        return bookIsCheckedOutTo;
    }

    //Setters// -------------------------------------------------------------------------------------------------------
    public void setBookID(int bookID) {
        this.bookID = bookID;
    }
    public void setBookISBN(String bookISBN) {
        this.bookISBN = bookISBN;
    }
    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }
    public void setBookIsCheckedOut(boolean bookIsCheckedOut) {
        this.bookIsCheckedOut = bookIsCheckedOut;
    }
    public void setBookIsCheckedOutTo(String bookIsCheckedOutTo) {
        this.bookIsCheckedOutTo = bookIsCheckedOutTo;
    }

    //Method 1 // checkOut // -----------------------------------------------------------------------------------------
    public void checkOut (String name) {
        this.setBookIsCheckedOut(true);
        this.setBookIsCheckedOutTo(name);
    }

    //Method 2 // checkIn // ------------------------------------------------------------------------------------------
public void checkIn (String name) {
        this.setBookIsCheckedOut(false);
        this.setBookIsCheckedOutTo("");
}












}
