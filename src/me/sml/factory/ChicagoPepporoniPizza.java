package me.sml.factory;

public class ChicagoPepporoniPizza extends Pizza {

    private PizzaIngredientFactory pizzaIngredientFactory;

    public ChicagoPepporoniPizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    void prepare() {
        setDough(pizzaIngredientFactory.makeDough());
        setSauce(pizzaIngredientFactory.makeSauce());
    }
}
