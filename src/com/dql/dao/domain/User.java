package com.dql.dao.domain;

/**
 * 用户类
 */
public class User {
    private String number = "";
    private String firstName = "";
    private String nameTwo = "";
    private String date = "";
    private String sex = "";
    private String address = "";
    private String numberLast = "";

    public User(String number, String firstName, String nameTwo, String date, String sex, String address, String numberLast) {
        this.number = number;
        this.firstName = firstName;
        this.nameTwo = nameTwo;
        this.date = date;
        this.sex = sex;
        this.address = address;
        this.numberLast = numberLast;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getNameTwo() {
        return nameTwo;
    }

    public void setNameTwo(String nameTwo) {
        this.nameTwo = nameTwo;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNumberLast() {
        return numberLast;
    }

    public void setNumberLast(String numberLast) {
        this.numberLast = numberLast;
    }
}
