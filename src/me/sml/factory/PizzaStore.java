package me.sml.factory;

public abstract class PizzaStore {

    public Pizza orderPizza(String type){
        System.out.println("피자를 주문받습니다.");
        System.out.println(type + "피자를 주문하셨습니다.");
        return createPizza(type);
    }

    /*
    * 팩토리 메서드
    * 서브클래스에게 객체의 생성을 위임한다.
    * 여기서 생성할 객체는 Pizza
    * */
    protected abstract Pizza createPizza(String type);
}
