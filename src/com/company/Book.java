package com.company;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by Marcel on 2017-07-19.
 */
public class Book {

    private String title, author, lenderName;
    private int bookID, year;
    private boolean available;


    public Book(String title, String author, int bookID, int year) {
        this.title = title;
        this.author = author;
        this.bookID = bookID;
        this.year = year;


    }

    public Book(String title, String author, int bookID, int year, boolean available) {
        this.title = title;
        this.author = author;

        this.bookID = bookID;
        this.year = year;
        this.available = available;
    }

    public Book(String title, String author, String lenderName, int bookID, int year) {
        this.title = title;
        this.author = author;
        this.lenderName = lenderName;
        this.bookID = bookID;
        this.year = year;

    }

    public Book(String title, String author, String lenderName, int bookID, int year, boolean available) {
        this.title = title;
        this.author = author;
        this.lenderName = lenderName;
        this.bookID = bookID;
        this.year = year;
        this.available = available;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getBookID() {
        return bookID;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getLenderName() {
        return lenderName;
    }

    public void setLenderName(String lenderName) {
        this.lenderName = lenderName;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}





