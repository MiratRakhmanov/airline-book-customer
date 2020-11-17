package com.mirat.homework.book;

import java.util.Objects;

public class Book {

    private final int id;
    private int year;
    private int pages;
    private int price;
    private String name;
    private String author;
    private String publishingHouse;
    private String typeOfBinding;

    public Book(int id, String name, String author, String publishingHouse, int year, int pages, int price, String typeOfBinding) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publishingHouse = publishingHouse;
        this.year = year;
        this.pages = pages;
        this.price = price;
        this.typeOfBinding = typeOfBinding;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getTypeOfBinding() {
        return typeOfBinding;
    }

    public void setTypeOfBinding(String typeOfBinding) {
        this.typeOfBinding = typeOfBinding;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return id == book.id &&
                year == book.year &&
                pages == book.pages &&
                price == book.price &&
                Objects.equals(name, book.name) &&
                Objects.equals(author, book.author) &&
                Objects.equals(publishingHouse, book.publishingHouse) &&
                Objects.equals(typeOfBinding, book.typeOfBinding);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, author, publishingHouse, year, pages, price, typeOfBinding);
    }

    @Override
    public String toString() {
        return String.format("%-3s%-2s%-7s%-41s%-7s%-18s%-18s%-11s%-5s%-5s%-6s%-5s%-6s%-3s%-16s%-5s", "Id: ", id, "| Name: ", name, "| Author: ", author, "| Publishing House: ", publishingHouse, "| Year: ", year, "| Pages: ", pages, "| Price: ", price, "| Type Of Binding: ", typeOfBinding);
    }
}
