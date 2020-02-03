package me.sml.factory.method;

public class SoccerShoesFactory extends ShoesFactory {

    @Override
    Shoes makeShoes(String name) {
        switch (name){
            case "nike":
                return new NikeSoccerShoes();
            case "adidas":
                return new AdidasSoccerShoes();
        }
        return null;
    }
}
