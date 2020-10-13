package com.company.practice_2;
import com.company.practice.University;

public class Main {
    public static void main(String[] args){
        Student student1 = new Student("Mika", 20);
        Student student2 = new Student("Alionka",21);
        University university = new University(student1);
        university.setStudent(student2);
        university.setStudentList(new Student[] {student1, student2});
        System.out.println(university);




    }
}
