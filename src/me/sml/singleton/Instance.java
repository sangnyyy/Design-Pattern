package me.sml.singleton;

public class Instance {
    private static Instance ourInstance = new Instance();

    public static Instance getInstance() {
        return ourInstance;
    }

    private Instance() {
    }
}
