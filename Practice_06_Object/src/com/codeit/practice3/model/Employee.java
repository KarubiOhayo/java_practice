package com.codeit.practice3.model;

public class Employee {
    private int     empNo;
    private String  empName;
    private String  dept;
    private String  job;
    private int     age;
    private char    gender;
    private int     salary;
    private double  bonusPoint;
    private String  phone;
    private String  address;

    public Employee() {
    }

    public Employee(int empNo, String empName) {
        this.empNo = empNo;
        this.empName = empName;
    }

    public Employee(int empNo, String empName, String dept, String job, int age, char gender, int salary, double bonusPoint, String phone, String address) {
        this.empNo      = empNo;
        this.empName    = empName;
        this.dept       = dept;
        this.job        = job;
        this.age        = age;
        this.gender     = gender;
        this.salary     = salary;
        this.bonusPoint = bonusPoint;
        this.phone      = phone;
        this.address    = address;
    }

    public int getEmpNo() {
        return empNo;
    }

    public String getEmpName() {
        return empName;
    }

    public String getDept() {
        return dept;
    }

    public String getJob() {
        return job;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public int getSalary() {
        return salary;
    }

    public double getBonusPoint() {
        return bonusPoint;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setBonusPoint(double bonusPoint) {
        this.bonusPoint = bonusPoint;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Employee{");
        sb.append("empNo=").append(empNo);
        sb.append(", empName='").append(empName).append('\'');
        sb.append(", dept='").append(dept).append('\'');
        sb.append(", job='").append(job).append('\'');
        sb.append(", age=").append(age);
        sb.append(", gender=").append(gender);
        sb.append(", salary=").append(salary);
        sb.append(", bonusPoint=").append(bonusPoint);
        sb.append(", phone='").append(phone).append('\'');
        sb.append(", address='").append(address).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
