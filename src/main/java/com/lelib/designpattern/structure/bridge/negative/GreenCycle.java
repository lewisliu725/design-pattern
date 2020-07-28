package com.lelib.designpattern.structure.bridge.negative;

public class GreenCycle implements Shape {
    @Override
    public void draw() {
        System.out.println("The shape is Cycle.");
        System.out.println("The color is Green.");
    }
}

