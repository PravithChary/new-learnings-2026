package com.pluralsight.behavioral.command.practice;

import java.util.List;

// client
public class CommandDemo {
    public static void main(String[] args) {
//        Light light = new Light();
//        Switch lightSwitch = new Switch();

//        Command onCommand = new OnCommand(light);
//        lightSwitch.storeAndExecute(onCommand);

//        Command toggleCommand = new ToggleCommand(light);
//        lightSwitch.storeAndExecute(toggleCommand);
//        lightSwitch.storeAndExecute(toggleCommand);
//        lightSwitch.storeAndExecute(toggleCommand);

        Light bedRoomLight = new Light();
        Light kitchenLight = new Light();
        Switch lightSwitch = new Switch();

        Command toggleCommand = new ToggleCommand(bedRoomLight);
        lightSwitch.storeAndExecute(toggleCommand);

        List<Light> lights = List.of(kitchenLight, bedRoomLight);
        Command allLightsCommand = new AllLightsCommand(lights);
        lightSwitch.storeAndExecute(allLightsCommand);
    }
}
