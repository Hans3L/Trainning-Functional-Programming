package com.creativity.example.programmingfunctional.lambdas;

public class App implements PersonalInformation {


    public static void main(String[] args) {
        App newApp = new App();
        newApp.miNombre("hansel");
    }

    @Override
    public void miNombre(String nombre) {
        System.out.println("Hola soy " + nombre);
    }
}
