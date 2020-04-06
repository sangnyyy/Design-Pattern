package me.sml.factory;

public class NewyorkCheesePizza extends Pizza {

    private PizzaIngredientFactory pizzaIngredientFactory;

    public NewyorkCheesePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    void prepare() {
        setDough(pizzaIngredientFactory.makeDough());
        setSauce(pizzaIngredientFactory.makeSauce());
    }
}
