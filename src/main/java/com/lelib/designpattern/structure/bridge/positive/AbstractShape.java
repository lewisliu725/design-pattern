package com.lelib.designpattern.structure.bridge.positive;

import com.lelib.designpattern.structure.bridge.positive.color.Color;

public abstract class AbstractShape implements Shape {
    private Color color;

    protected AbstractShape(Color color) {
        this.color = color;
    }

    @Override
    public void draw() {
        this.drawShape();
        this.color.drawColor();
    }

    protected abstract void drawShape();
}
