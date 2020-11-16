package com.mirat.homework.book;

import com.mirat.homework.View;

public class Main {

    public static void main(String[] args) {
        Book book1 = new Book(1, "Harry Potter and the Philosopher's Stone", "J. K. Rowling", "Bloomsbury", 1997, 223, 60, "Soft");
        Book book2 = new Book(2, "Harry Potter and the Chamber of Secrets", "J. K. Rowling", "Bloomsbury", 1998, 251, 50, "Soft");
        Book book3 = new Book(3, "Harry Potter and the Prisoner of Azkaban", "J. K. Rowling", "Bloomsbury", 1999, 317, 70, "Soft");
        Book book4 = new Book(4, "Ruslan i Ludmila", "Alexander Pushkin", "SPB", 1820, 240, 40, "Hard");
        Book book5 = new Book(5, "War and Peace", "Leo Tolstoy", "SPB", 1869, 1225, 30, "Hard");

        Library library = new Library();
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);

        View.print(library.findByAuthor("J. K. Rowling"));
        System.out.println("****************************");

        View.print(library.findByPublishingHouse("SPB"));
        System.out.println("****************************");

        View.print(library.findBookPublishedAfterYear(1869));
    }
}
