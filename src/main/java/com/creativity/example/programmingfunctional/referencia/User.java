package com.creativity.example.programmingfunctional.referencia;

public class User {

    private String name;

    public User() {
    }

    public User(String name) {
        this.name = name;
    }

    public static void referenciaMethodStatic() {
        System.out.println("Probando metodo de referencia estatico");
    }

    public void referenciaAMetodoParticular() {
        System.out.println("Probando referencia a metodo de objeto particular");
    }

    public void mostrarNommbre() {
        System.out.println(name);
    }
}