package com.pluralsight.behavioral.command.practice;

// concrete command
public class OnCommand implements Command{
    private Light light;

    public OnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() { // this is the method that gets called by the invoker
        light.on();
    }
}
