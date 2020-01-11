package com.company;

public class Algoritm {
    public static void algoritm() {
        A superOb = new A();
        B subOb = new B();
        superOb.i = 10;
        superOb.j = 20;
        System.out.println(" Coдepжимoe объекта superOb : ");
        superOb.showij();
        System.out.println();

        subOb.i = 7;
        subOb.j = 8;
        subOb.k = 9;
        System.out.println(" Coдepжимoe объекта subOb : ");
        subOb.showij();
        subOb.showk();
        System.out.println();
        System.out.println("Cyммa i, j и k в объекте subOb:");
        subOb.sum();
    }
}
