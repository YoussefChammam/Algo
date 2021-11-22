package de.htw.commands.Cmd;
import de.htw.commands.ICommand;

public class ExitProgramCmd implements ICommand {

	@Override
	public void execute() {
		System.out.println("program exited successfully. \n");
		System.exit(0);
	}
}

