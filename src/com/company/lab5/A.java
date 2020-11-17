package com.company.lab5;

public class A {

    protected String name;
    protected static X x = new X("Lara Croft");

    protected A(String name, X meow){
        this.name = name;
        System.out.println("Ohayo A");
        System.out.println(A.x.getName007());
    }
}
