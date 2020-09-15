package com.lelib.designpattern.behavior.command.positive;

import com.lelib.designpattern.behavior.command.positive.Command;
import com.lelib.designpattern.behavior.command.positive.Light;

public class SwitchOnCommand implements Command {
    private final Light light;

    public SwitchOnCommand(Light light) {
        this.light = light;
    }

    @Override // Command
    public void execute() {
        light.turnOn();
    }
}
