package me.sml.factory;

public class Main {
    public static void main(String[] args){
        PizzaStore newyorkPizzaStore = new NewyorkPizzaStore();
        newyorkPizzaStore.orderPizza("pepporoni");

        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
        chicagoPizzaStore.orderPizza("cheese");

    }
}
