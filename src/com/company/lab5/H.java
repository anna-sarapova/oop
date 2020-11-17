package com.company.lab5;

public class H extends G {
    private static X x = new X("Keksik");

    protected H(String name, X x){
        super(name, x);
        System.out.println("Ohayo H");
        System.out.println(H.x.getName007());
    }
}
