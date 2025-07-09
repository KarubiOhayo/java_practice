package com.codeit.practice3.run;

import com.codeit.practice3.model.Employee;

public class Main {
    public static void main(String[] args) {
        Employee e = new Employee();

        e.setEmpNo(100);
        e.setEmpName("홍길동");
        e.setDept("영업부");
        e.setJob("과장");
        e.setAge(25);
        e.setGender('남');
        e.setSalary(2500000);
        e.setBonusPoint(0.05);
        e.setPhone("010-1234-5678");
        e.setAddress("서울시 강남구");

        System.out.println("empNo      : " + e.getEmpNo     ());
        System.out.println("empName    : " + e.getEmpName   ());
        System.out.println("dept       : " + e.getDept      ());
        System.out.println("job        : " + e.getJob       ());
        System.out.println("age        : " + e.getAge       ());
        System.out.println("gender     : " + e.getGender    ());
        System.out.println("salary     : " + e.getSalary    ());
        System.out.println("bonusPoint : " + e.getBonusPoint());
        System.out.println("phone      : " + e.getPhone     ());
        System.out.println("address    : " + e.getAddress   ());

    }
}
