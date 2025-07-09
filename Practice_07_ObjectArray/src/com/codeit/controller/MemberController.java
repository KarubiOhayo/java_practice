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
            if(member.getId().endsWith(inputId)) {
                return true;
            }
        }
        return false;
    }

    public void insertMember(String id, String name, String password, String email, char gender, int age) {
        for (int i = 0; i < MAX_SIZE; i++) {
            if(mArray[i] == null) {
                mArray[i] = new Member(id, name, password, email, gender, age);
                size++;
            }
        }
    }

    public Member searchId(String id) {
        for (Member member : mArray) {
            if(member.getId().equals(id)) {
                return member;
            }
        }
        return null;
    }

    public Member[] searchName(String name) {

    }

    public Member[] searchEmail(String email) {

    }

    public Boolean updatePassword(String id, String password) {

    }

    public Boolean updateName(String id, String name) {

    }

    public Boolean updateEmail(String id, String email) {

    }

    public Boolean delete(String id) {

    }

    public void delete() {

    }

    public Member[] printAll() {

    }
}
