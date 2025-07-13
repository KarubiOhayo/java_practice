package com.codeit.model;

public class Member {
    private String id;
    private String password;
    private String name;
    private String email;
    private char gender;
    private int age;

    public Member() {
    }

    public Member(String id, String password, String name, String email, char gender, int age) {
        this.id = id;
        this.password = password;
        this.name = name;
        this.email = email;
        this.gender = gender;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Member{");
        sb.append("id='").append(id).append('\'');
        sb.append(", password='").append(password).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append(", gender=").append(gender);
        sb.append(", age=").append(age);
        sb.append('}');
        return sb.toString();
    }
}
