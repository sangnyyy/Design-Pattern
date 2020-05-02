package me.sml.singleton;

public class Person3 {
    private volatile static Person3 person3;
    private String name;

    private Person3() {
        this.name = "person3";
    }

    public String getName(){
        return name;
    }

    public static Person3 getInstance(){
        if(person3 == null){
            synchronized (Person3.class){
                if(person3 == null){
                    person3 = new Person3();
                }
            }
        }
        return person3;
    }
}
