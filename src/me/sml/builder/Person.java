package me.sml.builder;

class Person {
    private String name;
    private int age;
    private boolean marry;

    private Person(String name, int age, boolean marry) {
        this.name = name;
        this.age = age;
        this.marry = marry;
    }

    static PersonBuilder builder() {
        return new PersonBuilder();
    }

    String getName() {
        return name;
    }

    int getAge() {
        return age;
    }

    boolean isMarry() {
        return marry;
    }

    static class PersonBuilder {

        private String name;
        private int age;
        private boolean marry;

        PersonBuilder name(String name) {
            this.name = name;
            return this;
        }

        PersonBuilder age(int age) {
            this.age = age;
            return this;
        }

        PersonBuilder marry(boolean marry) {
            this.marry = marry;
            return this;
        }

        Person build() {
            return new Person(name, age, marry);
        }

    }
}
