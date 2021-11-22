package de.htw.commands.Cmd;
import de.htw.commands.Algorithms.GCDEuclidDivisionRestIt;
import de.htw.commands.ICommand;
import de.htw.console.IConsole;

public class DivisionRestIterativeCmd implements ICommand {
     IConsole console;

    public DivisionRestIterativeCmd(IConsole console) {
        super();
        this.console = console;
    }

    @Override
    public void execute() {
        int x = console.readInteger("Enter a number for x: \n");
        int y = console.readInteger("Enter a number for y: \n");
        int result = GCDEuclidDivisionRestIt.gcd(x, y);

        console.write(String.format("The biggest common divider of %d and %d is %d \n", x, y, result));
    }
}
