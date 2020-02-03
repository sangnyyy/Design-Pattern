package me.sml.builder;

public class Main {

    public static void main(String[] args){
        Person person = Person.builder().age(10).marry(true).name("name").build();
        System.out.println(person.getAge());
        System.out.println(person.getName());
        System.out.println(person.isMarry());
    }
}
