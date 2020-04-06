package me.sml.factory;

import me.sml.factory.ingredient.Dough;
import me.sml.factory.ingredient.Sauce;

public abstract class Pizza {
    private Dough dough;
    private Sauce sauce;
    abstract void prepare();

    public Dough getDough() {
        return dough;
    }

    public void setDough(Dough dough) {
        this.dough = dough;
    }

    public Sauce getSauce() {
        return sauce;
    }

    public void setSauce(Sauce sauce) {
        this.sauce = sauce;
    }
}
