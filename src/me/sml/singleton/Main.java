package me.sml.singleton;

public class Main {
    public static void main(String[] args){
        Person person = Person.getInstance("person1");
        System.out.println(person.getName());

        Person2 person2 = Person2.getInstance();
        System.out.println(person2.getName());

        Person3 person3 = Person3.getInstance();
        System.out.println(person3.getName());
    }
}
