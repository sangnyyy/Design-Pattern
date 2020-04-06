package me.sml.factory;

public class ChicagoCheesePizza extends Pizza {

    private PizzaIngredientFactory pizzaIngredientFactory;

    public ChicagoCheesePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    void prepare() {
        setDough(pizzaIngredientFactory.makeDough());
        setSauce(pizzaIngredientFactory.makeSauce());
    }
}
