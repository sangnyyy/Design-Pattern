package me.sml.factory.method;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        if(type.equals("cheese")){
            System.out.println("create chicago style cheese pizza\n");
            return new NewyorkCheesePizza();
        }else if(type.equals("pepporoni")){
            System.out.println("create chicago style pepporoni pizza\n");
            return new NewyorkPepporoniPizza();
        }
        return null;
    }
}
