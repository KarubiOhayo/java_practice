package com.codeit.poly.model;

public class Member {
    private String name;
    private int age;
    private char gender;
    private int couponCount;

    public Member() {
    }

    public Member(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Member{");
        sb.append("name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append(", gender=").append(gender);
        sb.append(", couponCount=").append(couponCount);
        sb.append('}');
        return sb.toString();
    }
}
