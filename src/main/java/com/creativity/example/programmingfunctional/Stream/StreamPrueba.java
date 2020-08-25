package com.creativity.example.programmingfunctional.Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamPrueba {

    private static List<Person> people;

    public static void main(String[] args){
        setUpPeople();
        Stream stream = Stream.of(people);
        people.stream();
        people.stream().forEach((person) -> System.out.println(person.getName()));
        people.stream().forEach((person) -> System.out.println(new StringBuffer().append(person.getId()).append(" ").append(person.getName()).append(" Apellido")));
        List<String> lista = people.stream().map(person -> person.getName()).collect(Collectors.toList());
        lista.stream().forEach(person -> System.out.println(person));
    }

    private static void setUpPeople(){
        people = new ArrayList<>();
        people.add(new Person(1L,"Hansel"));
        people.add(new Person(2L,"JAH"));
        people.add(new Person(3L,"SHALOM"));
        people.add(new Person(4L,"ISRAEL"));
    }
}
