package com.codeit.practice2.model;

public class Book {
    private String title;
    private String author;
    private String publisher;
    private int price;
    private double discountRate;

    public Book() {
    }

    public Book(String title, String author, String publisher) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
    }

    public Book(String title, String author, String publisher, int price, double discountRate) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.price = price;
        this.discountRate = discountRate;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Book{");
        sb.append("title='").append(title).append('\'');
        sb.append(", author='").append(author).append('\'');
        sb.append(", publisher='").append(publisher).append('\'');
        sb.append(", price=").append(price);
        sb.append(", discountRate=").append(discountRate);
        sb.append('}');
        return sb.toString();
    }
}
