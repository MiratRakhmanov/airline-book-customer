package com.mirat.homework.book;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Book> bookshelf;

    public Library() {
        this.bookshelf = new ArrayList<>();
    }

    public void addBook(Book book) {
        bookshelf.add(book);
    }

    public List<Book> getBookshelf() {
        return bookshelf;
    }

    public List<Book> findByAuthor(String author) {
        List<Book> result = new ArrayList<>();
        for (Book book : bookshelf) {
            if(book.getAuthor().contains(author)) {
                result.add(book);
            }
        }
        return result;
    }

    public List<Book> findByPublishingHouse(String publishingHouse) {
        List<Book> result = new ArrayList<>();
        for (Book book : bookshelf) {
            if(book.getPublishingHouse().equalsIgnoreCase(publishingHouse)) {
                result.add(book);
            }
        }
        return result;
    }

    public List<Book> findBookPublishedAfterYear(int year) {
        List<Book> result = new ArrayList<>();
        for (Book book : bookshelf) {
            if(book.getYear() > year) {
                result.add(book);
            }
        }
        return result;
    }
}
