package com.epam.mjc.stage0;

public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFour;

    public Animal(String color, int numberOfPaws, boolean hasFour) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFour = hasFour;
    }

    public String getDescription() {
        String desc = "This animal is mostly " + color + ". It has " + numberOfPaws + " ";
        if (numberOfPaws == 1) desc += "paw ";
        else desc += "paws ";
        desc += "and ";
        if (hasFour) desc += "a fur.";
        else desc += "no fur.";

        return desc;
    }

    public String getColor() {
        return color;
    }

    public int getNumberOfPaws() {
        return numberOfPaws;
    }

    public boolean isHasFour() {
        return hasFour;
    }
}
