package com.creativity.example.programmingfunctional.referencia;

import java.util.ArrayList;
import java.util.List;

public class ReferenciaMethods {

    public static void main(String[] args) {

        // clase anonima

        Trabajo trabajo = new Trabajo() {

            @Override
            public void accion() {
                User.referenciaMethodStatic();
            }
        };
        trabajo.accion();

        // llamando al metodo estatico por lambda

        Trabajo trabajoLambda = () -> {
            System.out.println("El siguiente es una referencia de método por Lambda");
            User.referenciaMethodStatic();
        };
        trabajoLambda.accion();

        /* Referencia a      Class::new     String::new    ()-> new String
         * static method
         */

        Trabajo trabajoMR = User::referenciaMethodStatic;
        trabajoMR.accion();

        /* Referencia a un          instancia::metodoInstancia  s:toString  ()->"string".toString
         * método de instancia
         * de un objeto particular
         */

        User user = new User("Hansel");
        Trabajo trabajo2Lambda = () -> {
            user.referenciaAMetodoParticular();
        };
        Trabajo trabajo2MI = user::referenciaAMetodoParticular;
        trabajo2MI.accion();

        /*
         * Referencia a un método         Class::metodoInstancia  String::toString     s -> s.toString()
         * de instancia de un objeto
         * arbitrario de un tipo
         * particular
         */
        TrabajoString trabajoStringLambda = (String texto) -> {
            return texto.toUpperCase();
        };
        System.out.println(trabajoStringLambda.accion("hello, whats time is't"));
        TrabajoString trabajoStringRMOA = String::toUpperCase;
        System.out.println(trabajoStringRMOA.accion("hello see later"));

        List<User> listUser = new ArrayList<>();
        listUser.add(new User("Hansel"));
        listUser.add(new User("JAH"));
        listUser.add(new User("SHALOM"));
        listUser.add(new User("JERUSALEN"));

        listUser.forEach((User nombre) -> nombre.mostrarNommbre()); //        = ()-> {};
        listUser.forEach(User::mostrarNommbre);
        /*
         * Referencia a un      Class::new               String::new       ()-> new String
         * Contructor
         */

        IUser iUser = new IUser() {
            @Override
            public User crear(String name) {
                return new User(name);
            }
        };

        IUser iUserLambda = (String name) -> {
            return new User(name);
        };

        IUser iUserMRC = User::new;
    }
}
