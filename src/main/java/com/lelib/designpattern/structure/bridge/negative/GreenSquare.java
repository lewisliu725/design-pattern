package com.lelib.designpattern.structure.bridge.negative;

public class GreenSquare implements Shape {
    @Override
    public void draw() {
        System.out.println("The shape is Square.");
        System.out.println("The color is Green.");
    }
}

