package com.company.lab1;

public class Student {
     String name;
     String surname;
     int age;
     double mark;

    public Student(String name, String surname, int age, int mark){
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.mark = mark;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    public double getMark() {
        return mark;
    }
}