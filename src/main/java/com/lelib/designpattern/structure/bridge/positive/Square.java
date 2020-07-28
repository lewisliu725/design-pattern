package com.lelib.designpattern.structure.bridge.positive;

import com.lelib.designpattern.structure.bridge.positive.color.Color;

public class Square extends AbstractShape {
    protected Square(Color color) {
        super(color);
    }

    @Override
    protected void drawShape() {
        System.out.println("The shape is Square.");
    }
}