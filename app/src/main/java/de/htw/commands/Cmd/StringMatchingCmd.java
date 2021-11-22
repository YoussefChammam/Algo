package de.htw.commands.Cmd;
import de.htw.commands.Algorithms.StringMatching;
import de.htw.commands.ICommand;
import de.htw.console.IConsole;

public class StringMatchingCmd implements ICommand {

    IConsole console;

    public StringMatchingCmd(IConsole console) {
        super();
        this.console = console;
    }

    @Override
    public void execute() {
        String text = console.readString("Please, enter text for search:");
        String search = console.readString("Please, enter a word for search:");

        StringMatching.wordResearch(text , search);
    }

}
