package me.sml.singleton;

public class Main {
    public static void main(String[] args){
        Person person = Person.getInstance();
        System.out.println(person.getName());

        PersonWithHolder personWithHolder = PersonWithHolder.getInstance();
        System.out.println(personWithHolder.getName());

        PersonWithDCL personWithDCL = PersonWithDCL.getInstance();
        System.out.println(personWithDCL.getName());
    }
}
