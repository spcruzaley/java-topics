package com.spcruzaley.jdk17.sealedclasses;

public sealed class HumanClass permits LaSirenita, Men, Women {
    private String name;
    private int edad;

    public HumanClass(String name, int edad) {
        this.name = name;
        this.edad = edad;
    }

    public String getName() {
        return name;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public String toString() {
        return "HumanClass{" +
                "name='" + name + '\'' +
                ", edad=" + edad +
                '}';
    }
}
