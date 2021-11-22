package de.htw.commands.Algorithms;
import de.htw.console.Implementation.Console;

public class StringMatching {


	// Naive algorithm
	public static void wordResearch(String sentence, String word){

		//Creating a new Console so that we can read the word from command line,
		// and trim the sentence / make it all lower case

		Console ourConsole = new Console();
		String text = ourConsole.readString(sentence);
		int M = word.length();
		int N = text.length();
		for (int i = 0 ; i <= N-M ; i++){
			int j;
			for (j = 0 ; j < M ; j++){
				if (text.charAt(i+j) != word.charAt(j)){
					break;
				}
			}
			if (j == M){
				System.out.println("Word found at index " + i);
			}else
				System.out.println("Word not found.");
		}
	}
}