package me.sml.builder;

public class Person {
    private String name;
    private int age;
    private boolean marry;

    public Person(String name, int age, boolean marry) {
        this.name = name;
        this.age = age;
        this.marry = marry;
    }

    public static PersonBuilder builder(){
        return new PersonBuilder();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isMarry() {
        return marry;
    }

    public static class PersonBuilder{

        private String name;
        private int age;
        private boolean marry;

        public PersonBuilder name(String name){
            this.name = name;
            return this;
        }

        public PersonBuilder age(int age){
            this.age = age;
            return this;
        }

        public PersonBuilder marry(boolean marry){
            this.marry = marry;
            return this;
        }

        public Person build(){
            return new Person(name, age, marry);
        }

    }
}
