package com.epam.mjc.stage0;

public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }


    public String getDescription() {
        String desc = "This animal is mostly " + color + ". It has " + numberOfPaws + " ";
        if (numberOfPaws == 1) desc += "paw ";
        else desc += "paws ";
        desc += "and ";
        if (hasFur) desc += "a fur.";
        else desc += "no fur.";

        return desc;
    }

}
