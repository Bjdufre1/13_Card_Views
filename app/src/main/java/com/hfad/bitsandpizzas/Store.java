package com.hfad.bitsandpizzas;

/**
 * Created by davidg on 04/05/2017.
 */

public class Store {
    private String name;
    private int imageResourceId;
    private String desc;

    public static final Store[] stores = {
            new Store("Cambridge", R.drawable.rest1, "First store ever made, and the nicest experience you will ever have"),
            new Store("Sebastopol", R.drawable.rest2, "Second store and very new and modern, some of the best chefs in the world")
    };

    private Store(String name, int imageResourceId, String desc) {
        this.name = name;
        this.imageResourceId = imageResourceId;
        this.desc = desc;
    }
    public String getName() {
        return name;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public String getDesc(){ return desc; }
}
