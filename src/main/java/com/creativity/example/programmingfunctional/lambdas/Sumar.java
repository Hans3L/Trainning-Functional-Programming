package com.creativity.example.programmingfunctional.lambdas;

@FunctionalInterface
public interface Sumar {

    abstract int suma(int a, int b);

    // void result(Long id); //TODO Una interface funcional solo puede tener un método abstracto
}
