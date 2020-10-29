package com.company.practice_3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String s;
     //   Child1 child1 = new Nephew.Child1();
    }
}
class Parent {
    public int x = 7;
}

class Child extends Parent{
    int x = 7; // if this value will be private,
               // it can be accessed from another class
    void foo() {
        System.out.println(x); //will print the Child 'x'
        System.out.println(super.x); //will print the Parent 'x'
    }
}

class Nephew extends Parent{
    void hoo() {
        System.out.println(x);
    }
    //////////////////////////////////////////////////////////////////

    class Parent1 {
        final int a = 7; // we hide the value
       final public void foo(){
            System.out.println("blabla");
        }
    }

    class Child1 extends Parent1{
      //  public void foo(){ //the same method is in Parent1 class
                            // and it is final, soo we can not overwrite it
      //      System.out.println("child method");
     //   }
    }
}
class Parent2{
    public boolean equals(Object o) {
        if (!(o instanceof Parent2)) {
            return false;
        }
        return true;
    }
}

