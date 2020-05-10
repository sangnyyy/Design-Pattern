package me.sml.singleton;

public class PersonWithHolder {

    private String name;

    private PersonWithHolder(){
        this.name = "personWithHolder";
    }

    public String getName() {
        return name;
    }

    private static class PersonHolder{
        private static final PersonWithHolder personWithHolder = new PersonWithHolder();
    }

    public static PersonWithHolder getInstance(){
        return PersonHolder.personWithHolder;
    }
}
