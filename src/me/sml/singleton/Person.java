package me.sml.singleton;

public class Person {
    private static Person person;
    private String name;

    public String getName() {
        return name;
    }

    private Person(){
        this.name = "person";
    }

    public static Person getInstance(){
        if(person != null){
            return person;
        }
        person = new Person();
        return person;
    }
}
