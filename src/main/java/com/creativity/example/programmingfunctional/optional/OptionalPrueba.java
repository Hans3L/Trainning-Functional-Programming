package com.creativity.example.programmingfunctional.optional;

import java.awt.*;
import java.util.Optional;

public class OptionalPrueba {

    public static void main(String[] args) {
        probarOptional("HANSel");
        orElseOptional("DWORD");
        orElseThrow("Método con excepcion a personalizar");
        isPresent(null);
    }

    public static void probarOptional(String name) {
        System.out.println("El tamaño es " + name.length());
    }

    public static void crearOptional() {
        Optional<String> optional = Optional.empty();
        optional.get();
    }

    public static void orElseOptional(String name) {
        //Optional<String> optionalS = Optional.ofNullable(name);
        Optional<String> optionalS1 = Optional.of(name);

        //String nameOfNullable = optionalS.orElse("null");
        String nameOf = optionalS1.orElse("valor");

        //System.out.println(nameOfNullable);
        System.out.println(nameOf);
    }

    public static void orElseThrow(String nombre) {
        Optional<String> optional = Optional.ofNullable(nombre);
        optional.orElseThrow(NullPointerException::new);
        String nombre1 = optional.get();
        System.out.println(nombre1);
    }

    public static void isPresent(String name) {
        Optional<String> optional = Optional.ofNullable(name);
        System.out.println(optional.isPresent());
    }
}
