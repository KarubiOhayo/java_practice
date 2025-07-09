package com.codeit.controller;

import com.codeit.model.Member;

public class MemberController {
    Member[] mArray = new Member[MAX_SIZE];
    public static int MAX_SIZE = 10;
    public static int size; //추후 접근제어자 설정

    public int existMemberNum() {
        return size;
    }

    public Boolean checkId(String inputId) {
        for (Member member : mArray) {
            if (member.getId().endsWith(inputId)) {
                return true;
            }
        }
        return false;
    }

    public void insertMember(String id, String name, String password, String email, char gender, int age) {
        for (int i = 0; i < MAX_SIZE; i++) {
            if (mArray[i] == null) {
                mArray[i] = new Member(id, name, password, email, gender, age);
                size++;
            }
        }
    }

    public Member searchId(String id) {
        for (Member member : mArray) {
            if (member.getId().equals(id)) {
                return member;
            }
        }
        return null;
    }

    public Member[] searchName(String name) {
        for (Member member : mArray) {
            if (member.getName().equals(name)) {
                return mArray;
            }
        }
        return null;
    }

    public Member[] searchEmail(String email) {
        for (Member member : mArray) {
            if (member.getEmail().equals(email)) {
                return mArray;
            }
        }
        return null;
    }

    public Boolean updatePassword(String id, String password) {
        if(searchId(id) == null){
            return false;
        }
        searchId(id).setPassword(password);
        return true;
    }

    public Boolean updateName(String id, String name) {
        if(searchId(id) == null){
            return false;
        }
        searchId(id).setName(name);
        return true;
    }

    public Boolean updateEmail(String id, String email) {
        if(searchId(id) == null){
            return false;
        }
        searchId(id).setEmail(email);
        return true;
    }

    public Boolean delete(String id) {

    }

    public void delete() {

    }

    public Member[] printAll() {

    }
}
