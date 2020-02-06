package me.sml.singleton;

public class Person {
    private static Person person;
    private String name;

    public String getName() {

        return name;
    }

    private Person(String name){
        this.name = name;
    }

    public static Person getInstance(String name){
        if(person != null){
            return person;
        }
        person = new Person(name);
        return person;
    }
}
