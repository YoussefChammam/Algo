package de.htw.console.Implementation;

import de.htw.console.IConsole;
import java.util.Scanner;


public class Console implements IConsole {

	public String readString(String text) {
		Scanner s1 = new Scanner(System.in);
		System.out.print(text);
		String input = s1.nextLine();
		return input.replaceAll("[^a-zA-Z0-9]"," ");
	}

	@Override
	public int readInteger(String text) {
		Scanner s2 = new Scanner(System.in);
		System.out.print(text);
		int result = 0;
		while (true){
			String string = s2.nextLine();
			try {
				result = Integer.parseInt(string);
			}
			catch (Exception e){
				System.out.print(text);
				continue;
			}
			break;
		}
		return result;
	}

	@Override
	public void write(String string) {
		System.out.println(string);
	}
}