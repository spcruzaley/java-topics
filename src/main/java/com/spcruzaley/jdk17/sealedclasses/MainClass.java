package com.spcruzaley.jdk17.sealedclasses;

public class MainClass {

    public static void main(String[] args) {
        HumanClass men = new Men("Salvador", 38);
        System.out.println(men);
    }
}

final class LaSirenita extends HumanClass {
    public LaSirenita(String name, int edad) {
        super(name, edad);
    }
}