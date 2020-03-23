package me.sml.singleton;

public class Person2 {

    private String name;

    private Person2(){
        this.name = "person2";
    }

    public String getName() {
        return name;
    }

    private static class PersonHolder{
        private static final Person2 person2 = new Person2();
    }

    public static Person2 getInstance(){
        return PersonHolder.person2;
    }
}
