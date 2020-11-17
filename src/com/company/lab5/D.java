package com.company.lab5;

public class D extends C{
    protected static X x = new X("Sherlok Holmes");

    protected D(String name, X x){
        super(name, x);
        System.out.println("Ohayo D");
        System.out.println(D.x.getName007());
    }
}
