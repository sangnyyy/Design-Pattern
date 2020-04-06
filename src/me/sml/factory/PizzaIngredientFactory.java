package me.sml.factory;

import me.sml.factory.ingredient.Dough;
import me.sml.factory.ingredient.Sauce;

public interface PizzaIngredientFactory {
    Dough makeDough();
    Sauce makeSauce();
}
