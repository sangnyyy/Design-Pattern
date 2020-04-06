package me.sml.factory;

import me.sml.factory.ingredient.ChicagoDough;
import me.sml.factory.ingredient.ChicagoSauce;
import me.sml.factory.ingredient.Dough;
import me.sml.factory.ingredient.Sauce;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough makeDough() {
        return new ChicagoDough();
    }

    @Override
    public Sauce makeSauce() {
        return new ChicagoSauce();
    }
}
