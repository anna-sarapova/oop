package com.company.lab1;
import java.util.ArrayList;

public class University {
     String universityName;
     int FoundationYear;
     ArrayList<Student> listOfStudents = new ArrayList<>();

    public University(String universityName, int FoundationYear, ArrayList<Student> listOfStudents){
        this.universityName = universityName;
        this.FoundationYear = FoundationYear;
        this.listOfStudents = listOfStudents;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setFoundationYear(int foundationYear) {
        FoundationYear = foundationYear;
    }

    public int getFoundationYear() {
        return FoundationYear;
    }

    public void addStudent (Student student ){
        listOfStudents.add(student);
    }

    public void printListOfStudents(){
        for(Student i: listOfStudents){
            System.out.println(i.getName());
        }
    }

   public float getAverageGrade () {
       float averageStudentGrade = 0;
       for (Student i : listOfStudents) {
           averageStudentGrade += i.getMark();
       }
       return averageStudentGrade/listOfStudents.size();
   }
}
