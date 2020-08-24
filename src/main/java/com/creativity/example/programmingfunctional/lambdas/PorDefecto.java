package com.creativity.example.programmingfunctional.lambdas;

@FunctionalInterface
public interface PorDefecto {

    abstract void getName(String name);
    default String getNameForDefault(String name){
        return name + " Default";
    }
}
