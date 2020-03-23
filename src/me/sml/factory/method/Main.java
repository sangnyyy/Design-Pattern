package me.sml.factory.method;

public class Main {
    public static void main(String[] args){
        PizzaStore newyorkPizzaStore = new NewyorkPizzaStore();
        newyorkPizzaStore.orderPizza("pepporoni");

        ChicagoPizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
        chicagoPizzaStore.orderPizza("cheese");

    }
}
