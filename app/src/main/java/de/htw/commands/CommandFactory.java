package de.htw.commands;
import de.htw.commands.Cmd.*;
import de.htw.console.IConsole;
import de.htw.commands.Algorithms.*;
import de.htw.commands.Cmd.*;

import java.util.LinkedList;

public class CommandFactory {

	 IConsole console;

	 //Constructor
	public CommandFactory(IConsole console) {
		super();
		this.console = console;
	}

	//Linked list of all the commands, each representing an algorithm.
	public LinkedList<ICommand> returnCommands() {
		LinkedList<ICommand> cmds = new LinkedList<ICommand>();
		cmds.add(new ExitProgramCmd());
		cmds.add(new SubtractionRecursiveCmd(console));
		cmds.add(new SubtractionIterativeCmd(console));
		cmds.add(new DivisionRestRecursiveCmd(console));
		cmds.add(new DivisionRestIterativeCmd(console));
		cmds.add(new StringMatchingCmd(console));
		cmds.add(new SiebeEratosthenesCmd(console));
		return cmds;
	}
}

