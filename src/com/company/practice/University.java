package com.company.practice;
import com.company.practice_2.Student;

import java.util.Arrays;

public class University {
    private Student student;
    private Student[] studentList;

    public University(Student student){
        this.student = student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public void setStudentList(Student[] studentList) {
        this.studentList = studentList;
    }

   /* public void printStudents() {
        for (Student student : studentList)
        System.out.println(student);
    }
    */

    @Override
    public String toString() {
        return "University{" +
                "student=" + student +
                "\nstudentList=" + Arrays.toString(studentList) +
                '}';
    }
}
