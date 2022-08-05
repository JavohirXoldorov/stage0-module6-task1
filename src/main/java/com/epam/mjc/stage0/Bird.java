package com.epam.mjc.stage0;

public class Bird extends Animal {

    public Bird() {
        super("blue", 2, false);
    }

    @Override
    public String getDescription() {
        return "This animal is mostly blue. It has " + getColor() + " paws and no fur. Moreover, it has " + getNumberOfPaws() + " wings and can fly.";
    }
}
