package me.sml.factory.method;

public abstract class ShoesFactory {
    abstract Shoes makeShoes(String name);
    public void getIndustryType(){
        System.out.println("Shoes");
    }
}
