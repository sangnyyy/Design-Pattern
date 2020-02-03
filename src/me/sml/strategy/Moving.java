package me.sml.strategy;

public class Moving {
    private Movable movable;

    public String move(){
        return movable.move();
    }

    public void setMovable(Movable movable) {
        this.movable = movable;
    }
}
