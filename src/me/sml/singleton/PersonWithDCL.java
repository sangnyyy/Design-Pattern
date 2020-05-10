package me.sml.singleton;

public class PersonWithDCL {
    private volatile static PersonWithDCL personWithDCL;
    private String name;

    private PersonWithDCL() {
        this.name = "personWithDCL";
    }

    public String getName(){
        return name;
    }

    public static PersonWithDCL getInstance(){
        if(personWithDCL == null){
            synchronized (PersonWithDCL.class){
                if(personWithDCL == null){
                    personWithDCL = new PersonWithDCL();
                }
            }
        }
        return personWithDCL;
    }
}
