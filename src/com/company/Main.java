package com.company;
import com.company.lab1.*;

public class Main {

    public static void main(String[] args) {
        Monitor mon1 = new Monitor("white", 300, 4000, 2000);
        Monitor mon2 = new Monitor("Black", 300, 1920, 1080);

        System.out.println("First\tSecond");
        System.out.println(mon1.getColor() + "\t" + mon2.getColor());
        if(mon1.getResolution() > mon2.getResolution()){
            System.out.println(mon1.getResolution() + " > " + mon2.getResolution());
        } else if (mon1.getResolution() < mon2.getResolution()) {
            System.out.println(mon1.getResolution() + " < " + mon2.getResolution());
        } else {
            System.out.println("  " + mon1.getResolution() + " = " + mon2.getResolution());
        }
    }
}
