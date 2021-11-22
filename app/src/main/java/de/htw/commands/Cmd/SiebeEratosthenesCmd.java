package de.htw.commands.Cmd;

import de.htw.commands.Algorithms.SiebeOfEratosthenes;
import de.htw.commands.ICommand;
import de.htw.console.IConsole;

public class SiebeEratosthenesCmd implements ICommand {
    IConsole console;

    public SiebeEratosthenesCmd(IConsole console) {
        super();
        this.console = console;
    }

    @Override
    public void execute() {
        int x = console.readInteger("Please, enter a number for x:");

        int[] primes = SiebeOfEratosthenes.getPrimeNumber(x);
        for (int prime: primes) {
            console.write("prime " + Integer.toString(prime));
        }
    }
}
