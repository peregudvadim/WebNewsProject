package edu.homework.web.controller.concrete;

import java.util.HashMap;
import java.util.Map;

import edu.homework.web.controller.concrete.impl.*;

public class CommandProvider {

    private Map<CommandName, Command> commands = new HashMap<CommandName, Command>();

    public CommandProvider() {
        commands.put(CommandName.DO_AUTH, new DoAuth());
        commands.put(CommandName.DO_REGISTRATION, new DoRegistration());
        commands.put(CommandName.GO_TO_REGISTRATION_PAGE, new GoToRegistrationPage());
        commands.put(CommandName.GO_TO_INDEX_PAGE, new GoToIndexPage());
        commands.put(CommandName.GO_TO_MAIN_PAGE, new GoToMainPage());
        commands.put(CommandName.NO_SUCH_COMMAND, new NoSuchCommand());



    }

    public Command takeCommand(String userCommand) {
        CommandName commandName;
        Command command;

        try {
            commandName = CommandName.valueOf(userCommand.toUpperCase());
            command = commands.get(commandName);


        } catch (IllegalArgumentException | NullPointerException e) {
            command = commands.get(CommandName.NO_SUCH_COMMAND);

        }

        return command;
    }


}
