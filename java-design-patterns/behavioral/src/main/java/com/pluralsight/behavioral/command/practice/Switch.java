package com.pluralsight.behavioral.command.practice;

// invoker
public class Switch {
    public void storeAndExecute(Command command) {
        command.execute(); // calls the execute method on the command (invokes)
    }
}
