package com.codeit.poly.model;

import com.multi.poly.model.vo.Book;

public class AniBook extends Book {
    int accessAge;

    public AniBook() {
    }

    public AniBook(String title, String author, String publisher, int accessAge) {
        super(title, author, publisher);
        this.accessAge = accessAge;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AniBook{");
        sb.append("accessAge=").append(accessAge);
        sb.append('}');
        return sb.toString();
    }
}
