package com.wonu606.commandpattern.output;

import com.wonu606.commandpattern.output.ColorCommand.Color;

public class OutputExample {

    public static void main(String[] args) {
        Command clearCommand = new ClearCommand();
        clearCommand.run();

        Command yellowColorCommand = new ColorCommand(Color.YELLOW);
        yellowColorCommand.run();

        Command printCommand = new PrintCommand("Hello Command pattern!");
        printCommand.run();

        Command greenColorCommand = new ColorCommand(Color.GREEN);
        greenColorCommand.run();

        printCommand.run();

        CommandGroup commandGroup = new CommandGroup();

        commandGroup.add(clearCommand);

        Command cyanColorCommand = new ColorCommand(Color.CYAN);
        commandGroup.add(cyanColorCommand);

        commandGroup.add(printCommand);

        commandGroup.run();
    }
}
