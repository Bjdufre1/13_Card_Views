package com.hfad.bitsandpizzas;

/**
 * Created by davidg on 04/05/2017.
 */

public class Pizza {
    private String name;
    private int imageResourceId;
    private String desc;

    public static final Pizza[] pizzas = {
            new Pizza("Diavolo", R.drawable.diavolo, "This pizza is our most popular pizza, have had no complaints about it"),
            new Pizza("Funghi", R.drawable.funghi, "This pizza sounds like a mushroom for good reason, there are a lot of mushrooms")
    };

    private Pizza(String name, int imageResourceId, String desc) {
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
