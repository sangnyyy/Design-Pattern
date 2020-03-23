package me.sml.singleton;

public class Main {
    public static void main(String[] args){
        Person person = Person.getInstance("hello");
        Person person2 = Person.getInstance("hello2");
        System.out.println(person.getName());
        System.out.println(person2.getName());
        System.out.println(person.equals(person2));

        Person2 p = Person2.getInstance();
        System.out.println(p.getName());
    }
}
