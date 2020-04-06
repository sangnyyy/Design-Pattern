package me.sml.factory;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        ChicagoPizzaIngredientFactory chicagoPizzaIngredientFactory = new ChicagoPizzaIngredientFactory();
        if(type.equals("cheese")){
            System.out.println("create chicago style cheese pizza\n");
            return new ChicagoCheesePizza(chicagoPizzaIngredientFactory);
        }else if(type.equals("pepporoni")){
            System.out.println("create chicago style pepporoni pizza\n");
            return new ChicagoPepporoniPizza(chicagoPizzaIngredientFactory);
        }
        return null;
    }
}
