package com.hfad.bitsandpizzas;

/**
 * Created by davidg on 04/05/2017.
 */

public class Pasta {
    private String name;
    private int imageResourceId;
    private String desc;

    public static final Pasta[] pastas = {
            new Pasta("Alfredo", R.drawable.pasta1, "This is our twist on a basic alfredo, the taste is out of this world"),
            new Pasta("Spaghetti", R.drawable.pasta2, "Spaghetti is made using love and tomatoes")
    };

    private Pasta(String name, int imageResourceId, String desc) {
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
