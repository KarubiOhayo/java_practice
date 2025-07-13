package com.codeit.controller;

import com.codeit.model.Member;

public class MemberController {
    public static final int MAX_SIZE = 10;    // 배열의 최대 크기
    public static int size = 0;
    private Member[] mArray = new Member[MAX_SIZE]; // 배열

    public MemberController() {
        mArray[0] = new Member("test1", "1234", "홍길동", "aaa@aaa.aaa", 'M', 33);
        mArray[1] = new Member("test2", "4321", "김길동", "bbb@bbb.bbb", 'M', 34);
        mArray[2] = new Member("test3", "1234", "최길동", "ccc@ccc.ccc", 'M', 28);
        mArray[3] = new Member("test4", "4321", "박길동", "ddd@ddd.ddd", 'M', 35);
        mArray[4] = new Member("test5", "1234", "이길순", "eee@eee.eee", 'F', 17);
        mArray[5] = new Member("test6", "1234", "박길순", "fff@fff.fff", 'F', 20);
        mArray[6] = new Member("test7", "1234", "임길동", "ggg@ggg.ggg", 'M', 26);
        mArray[7] = new Member("test8", "4321", "송길동", "hhh@hhh.hhh", 'M', 41);
        mArray[8] = new Member("test9", "1234", "정길순", "iii@iii.iii", 'F', 28);
        mArray[9] = new Member("test10", "4321", "양길동", "jjj@jjj.jjj", 'M', 23);
        size = 10;
    }

    public int existMemberNum() {
        return size;
    }

//	private int searchIdForIndex(String id) {
//
//	}

    public boolean checkId(String inputId) {
        for (Member member : mArray) {
            if (member.getId().equals(inputId)) {
                return true;
            }
        }
        return false;
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
        Member[] m = new Member[size];
        int mIndex = 0;
        for (int i = 0; i < m.length; i++) {
            if (mArray[i].getName().contains(name)) {
                m[mIndex] = mArray[i];
                mIndex++;
            }
        }
        return m;
    }

    public Member[] searchEmail(String email) {
        Member[] m = new Member[size];
        int mIndex = 0;
        for (int i = 0; i < m.length; i++) {
            if (mArray[i].getEmail().contains(email)) {
                m[mIndex] = mArray[i];
                mIndex++;
            }
        }
        return m;
    }


    public void insertMember(Member m) {
        for (int i = 0; i < mArray.length; i++) {
            if (mArray[i] == null) {
                mArray[i] = m;
                size++;
                return;
            }
        }
    }

    public boolean updatePassword(String id, String password) {
        for (int i = 0; i < size; i++) {
            if (mArray[i].getId().equals(id)) {
                mArray[i].setPassword(password);
                return true;
            }
        }
        return false;
    }

    public boolean updateName(String id, String name) {
        for (int i = 0; i < size; i++) {
            if (mArray[i].getId().equals(id)) {
                mArray[i].setName(name);
                return true;
            }
        }
        return false;
    }

    public boolean updateEmail(String id, String email) {
        for (int i = 0; i < size; i++) {
            if (mArray[i].getId().equals(id)) {
                mArray[i].setEmail(email);
                return true;
            }
        }
        return false;
    }

    public boolean delete(String id) {
        for (int i = 0; i < size; i++) {
            if (mArray[i].getId().equals(id)) {
                size--;
                if (i < MAX_SIZE) {
                    for (int j = i; j < MAX_SIZE - 1; j++) {
                        mArray[j] = mArray[j + 1];
                        if (j == size - 1) {
                            mArray[j + 1] = null;
                            break;
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    public void delete() {
        mArray = new Member[MAX_SIZE];
        size = 0;
    }

    public Member[] printAll() {
        return mArray;
    }
}





