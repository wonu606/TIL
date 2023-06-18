package com.wonu606.commandpattern.output;

import java.util.ArrayList;
import java.util.List;

public class CommandGroup implements Command {

    private List<Command> commands = new ArrayList<>();

    public void add(Command command) {
        commands.add(command);
    }

    @Override
    public void run() {
        int countCommands = commands.size();
        for (int i = 0; i < countCommands; i++) {
            Command command = commands.get(i);
            command.run();
        }
    }
}
