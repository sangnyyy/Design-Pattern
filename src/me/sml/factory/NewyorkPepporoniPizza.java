package me.sml.factory;

class NewyorkPepporoniPizza extends Pizza {

    private PizzaIngredientFactory pizzaIngredientFactory;

    public NewyorkPepporoniPizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }


    @Override
    void prepare() {
        setDough(pizzaIngredientFactory.makeDough());
        setSauce(pizzaIngredientFactory.makeSauce());
    }
}
