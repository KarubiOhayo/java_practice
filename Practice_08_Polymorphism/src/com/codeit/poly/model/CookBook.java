package com.codeit.poly.model;

public class CookBook extends Book {
    private boolean coupon;

    public CookBook() {
        super();
    }

    public CookBook(String title, String author, String publisher, boolean coupon) {
        super(title, author, publisher);
        this.coupon = coupon;
    }

    public boolean isCoupon() {
        return coupon;
    }

    public void setCoupon(boolean coupon) {
        this.coupon = coupon;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CookBook{");
        sb.append(super.toString());
        sb.append("coupon=").append(coupon);
        sb.append('}');
        return sb.toString();
    }
}
