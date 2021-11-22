package de.htw.commands.Cmd;

import de.htw.commands.Algorithms.GCDEuclidSubtractionRec;
import de.htw.commands.ICommand;
import de.htw.console.IConsole;

public class SubtractionRecursiveCmd implements ICommand {
     IConsole console;

    public SubtractionRecursiveCmd(IConsole console) {
        super();
        this.console = console;
    }

    @Override
    public void execute() {
        int x = console.readInteger("Enter a number for x: \n");
        int y = console.readInteger("Enter a number for y: \n");
        int result = GCDEuclidSubtractionRec.gcd(x, y);
        console.write(String.format("The biggest common divider of %d and %d is %d \n", x, y, result));
    }

}
