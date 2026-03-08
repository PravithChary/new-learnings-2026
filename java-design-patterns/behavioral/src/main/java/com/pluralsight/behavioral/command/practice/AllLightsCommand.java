package com.pluralsight.behavioral.command.practice;

import java.util.List;

public class AllLightsCommand implements Command{
    private List<Light> lights;

    public AllLightsCommand(List<Light> lights) {
        this.lights = lights;
    }

    // Turn off all the lights when leaving home
    @Override
    public void execute() {
        for(Light light : lights) {
            if(light.isOn()) {
                light.toggle();
            }
        }
    }
}
