package com.creativity.example.programmingfunctional.Stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamPrueba {

    private static List<Person> people;

    private static List<Person> people2;

    public StreamPrueba() {

        people2 = new ArrayList<>();
        people2.add(new Person(10L,  "Ana"));
        people2.add(new Person(20L, "Liz"));
        people2.add(new Person(30L, "Clara"));
        people2.add(new Person(40L, "Sofia"));
        System.out.println(people2.size());
    }

    public static void main(String[] args) {
        setUpPeople();
        Stream stream = Stream.of(people);
        people.stream();
        people.stream().forEach((person) -> System.out.println(person.getName()));
        people.stream().forEach((person) -> System.out.println(new StringBuffer().append(person.getId()).append(" ").append(person.getName()).append(" Apellido")));
        List<String> lista = people.stream().map(person -> person.getName()).collect(Collectors.toList());
        lista.stream().forEach(person -> System.out.println(person));
        System.out.println("<<<<<<<<<<<<----------------Filter------>>>>>>>>>>>>>");
        StreamPrueba sp = new StreamPrueba();
        filtrar();
        ordenar();
        transformar();
        limitar();
        contar();
    }

    private static void setUpPeople() {
        people = new ArrayList<>();
        people.add(new Person(1L, "Hansel"));
        people.add(new Person(2L, "JAH"));
        people.add(new Person(3L, "SHALOM"));
        people.add(new Person(4L, "ISRAEL"));
    }

    static public void filtrar() {
        people2.stream().filter(person -> person.getName().startsWith("S")).forEach(person -> System.out.println(person.getName()));
    }

    static public void contar() {
        long contador = people2.stream().count();
        System.out.println("\n" + contador);
    }

    static public void transformar() {
        people2.stream().map(person -> person.getName().toUpperCase()).forEach(System.out::println);
        people2.stream().map(person -> person.getId() + 1).forEach(System.out::println);
        people2.stream().map(person -> String.valueOf(person.getId())).forEach(System.out::println);
    }

    static public void limitar() {
        people2.stream().limit(2).forEach(person -> System.out.printf(person.getName()+" "));
    }

    static public void ordenar() {
        //Primera forma descendentente | Segunda forma ascendente
                 /*people2
                .stream()
                .sorted(Comparator.comparing(Person::getName,Comparator.reverseOrder()))
                .collect(Collectors.toList()).forEach(person -> System.out.printf(person.getName()+"\n"));*/
                 Comparator<Person> nameComparator = (h1,h2)-> h1.getName().compareTo(h2.getName());
                 people2.stream()
                         .sorted(nameComparator)
                         .collect(Collectors.toList())
                         .forEach(person -> System.out.printf(person.getName() + "\n"));
    }
}
