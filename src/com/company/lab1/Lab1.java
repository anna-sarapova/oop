package com.company.lab1;
import java.util.ArrayList;

public class Lab1 {

          public static void main(String[] args) {

            Monitor mon1 = new Monitor("white", 300, 4000, 2000);
            Monitor mon2 = new Monitor("Black", 300, 1920, 1080);

            System.out.println("First\tSecond");
            System.out.println(mon1.getColor() + "\t" + mon2.getColor());
            if(mon1.getResolution() > mon2.getResolution()){
                System.out.println("  " + mon1.getResolution() + " > " + mon2.getResolution());
            } else if (mon1.getResolution() < mon2.getResolution()) {
                System.out.println("  " + mon1.getResolution() + " < " + mon2.getResolution());
            } else {
                System.out.println("  " + mon1.getResolution() + " = " + mon2.getResolution());
            }

            if(mon1.getWidth() > mon2.getWidth()){
                System.out.println(" " + mon1.getWidth() + " > " + mon2.getWidth());
            } else if (mon1.getWidth() < mon2.getWidth()) {
                System.out.println(" " + mon1.getWidth() + " < " + mon2.getWidth());
            } else {
                System.out.println(" " + mon1.getWidth() + " = " + mon2.getWidth());
            }

            if(mon1.getHeight() > mon2.getHeight()){
                System.out.println(" " + mon1.getHeight() + " > " + mon2.getHeight());
            } else if (mon1.getHeight() < mon2.getHeight()) {
                System.out.println(" " + mon1.getHeight() + " < " + mon2.getHeight());
            } else {
                System.out.println(" " + mon1.getHeight() + " = " + mon2.getHeight());
            }


            ArrayList<Student> listOfStudents = new ArrayList<>();

            listOfStudents.add(new Student("Claude","Monet",55,8));
            listOfStudents.add(new Student("Vincent","VanGogh",20,5));
            listOfStudents.add(new Student("Leonardo","DaVinci",19,10));
            listOfStudents.add(new Student("Mike","Buonarroti",19,8));
            listOfStudents.add(new Student("Raphael","Sanzio",21,9));

            ArrayList<Student> listOfStudents1 = new ArrayList<>();

            listOfStudents1.add(new Student("Stephen","Hawking",19,9));
            listOfStudents1.add(new Student("Isaac","Newton",20,9));
            listOfStudents1.add(new Student("Brook","Taylor",19,9));
            listOfStudents1.add(new Student("Francis","Bacon",19,9));
            listOfStudents1.add(new Student("Niels","Bohr",21,9));

            ArrayList<Student> listOfStudents2 = new ArrayList<>();

            listOfStudents2.add(new Student("Barack","Obama",19,9));
            listOfStudents2.add(new Student("Franklin","Roosevelt",20,10));
            listOfStudents2.add(new Student("Conan","O'Brien",22,8));
            listOfStudents2.add(new Student("Bill","Gates",19,9));
            listOfStudents2.add(new Student("Mark","Zuckerberg",18,10));

            University university = new University("Harvard", 1636, listOfStudents);
            University university1 = new University("Cambridge", 1209, listOfStudents1);
            University university2 = new University("UTM", 1964, listOfStudents2);

            System.out.println("\n\n*******************************************\n");
            System.out.println("The average mark of Harvard University is: " + university.getAverageGrade());
            System.out.println("University has the following students: ");
            university.printListOfStudents();

            System.out.println("\n*******************************************\n");
            System.out.println("The average mark of Cambridge University is: " + university1.getAverageGrade());
            System.out.println("University has the following students: ");
            university1.printListOfStudents();

            System.out.println("\n*******************************************\n");
            System.out.println("The average mark of UTM University is: " + university2.getAverageGrade());
            System.out.println("University has the following students:");
            university2.printListOfStudents();
          }
}
