package com.codeit.poly.model;

import com.multi.poly.model.vo.Book;

public class CookBook extends Book {
    boolean coupon;

    public CookBook() {
    }

    public CookBook(String title, String author, String publisher, boolean coupon) {
        super(title, author, publisher);
        this.coupon = coupon;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CookBook{");
        sb.append("coupon=").append(coupon);
        sb.append('}');
        return sb.toString();
    }
}
