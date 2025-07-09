package com.codeit.practice2.run;

import com.codeit.practice2.model.Book;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book("안녕이라 그랬어", "김애란", "문학동네");
        Book book3 = new Book("첫 여름, 완주", "김금희", "무제", 15300, 0.1);

        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
    }
}
