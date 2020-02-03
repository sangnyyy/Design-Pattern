package me.sml.factory.method;

public class Main {
    public static void main(String[] args){
        ShoesFactory soccerShoesFactory  = new SoccerShoesFactory();
        Shoes nikeShoes = soccerShoesFactory.makeShoesWithLog("nike");
        Shoes adidasShoes = soccerShoesFactory.makeShoesWithLog("adidas");
    }
}
