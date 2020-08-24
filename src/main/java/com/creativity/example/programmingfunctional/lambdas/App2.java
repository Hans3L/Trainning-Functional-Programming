package com.creativity.example.programmingfunctional.lambdas;

public class App2 implements PorDefecto{

    static String name;

    public  static void main(String[] args) {

        PersonalInformation classAnonima = new PersonalInformation() {

            @Override
            public void miNombre(String nombre) {
                System.out.println("Hola soy " + nombre);
            }
        };

        classAnonima.miNombre("JAH");

        PersonalInformation nameLambda = (String name) ->  System.out.println("Hola soy " + name);

        nameLambda.miNombre("JAH lambdas");

        Sumar lambda2 = (int b, int a) -> a + b;

        System.out.println(lambda2.suma(8,10));


        Sumar lambda3 = (a,b) -> {
            a = a + b;
            a = a * 5;
            System.out.println("Resultado es el siguiente ");
            return a;
        };

        System.out.println(lambda3.suma(2,10));

        App2 instanceDefault = new App2();

        System.out.println(instanceDefault.getNameForDefault("SHALOM"));
    }

    @Override
    public void getName(String name) {

    }
}
