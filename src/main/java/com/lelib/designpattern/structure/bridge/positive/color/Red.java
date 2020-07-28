package com.lelib.designpattern.structure.bridge.positive.color;

public class Red implements Color {
    @Override
    public void drawColor() {
        System.out.println("The color Red");
    }
}