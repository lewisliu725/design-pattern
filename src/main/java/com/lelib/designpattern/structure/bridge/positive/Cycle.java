package com.lelib.designpattern.structure.bridge.positive;

import com.lelib.designpattern.structure.bridge.positive.color.Color;

public class Cycle extends AbstractShape {
    protected Cycle(Color color) {
        super(color);
    }

    @Override
    protected void drawShape() {
        System.out.println("The shape is Cycle.");
    }
}
