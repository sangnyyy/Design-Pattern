package me.sml.factory;

public class NewyorkPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        PizzaIngredientFactory pizzaIngredientFactory = new NYPizzaIngredientFactory();
        if(type.equals("cheese")){
            System.out.println("create newyork style cheese pizza\n");
            return new NewyorkCheesePizza(pizzaIngredientFactory);
        }else if(type.equals("pepporoni")){
            System.out.println("create newtyork style pepporoni pizza\n");
            return new NewyorkPepporoniPizza(pizzaIngredientFactory);
        }
        return null;
    }
}
