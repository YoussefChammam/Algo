package de.htw.commands.Cmd;
import de.htw.commands.Algorithms.GCDEuclidDivisionRestRec;
import de.htw.commands.ICommand;
import de.htw.console.IConsole;

public class DivisionRestRecursiveCmd implements ICommand {

     IConsole console;

    public DivisionRestRecursiveCmd(IConsole console) {
        super();
        this.console = console;
    }

    @Override
    public void execute() {
        int x = console.readInteger("Enter a number for x: \n");
        int y = console.readInteger("Enter a number for y: \n");
        int result = GCDEuclidDivisionRestRec.gcd(x, y);
        console.write(String.format("The biggest common divider of %d and %d is %d \n", x, y, result));
    }
}
