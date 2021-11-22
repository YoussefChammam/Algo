package de.htw.commands.Algorithms;

public class SiebeOfEratosthenes {

	private static int[] arrayWithoutZeroes(int[] list, int arraySize) {
		int counter = 0;
		int[] endList = new int[arraySize];
		for (int j : list) {
			if (j != 0) {
				endList[counter] = j;
				counter++;
			}
		}
		return endList;
	}
	public static int[] getPrimeNumber(int number) {
		int[] list = new int[number - 1];
		int zeroCounter = 0;
		for (int i = 0; i < number - 1; i++) {
			list[i] = i + 2;
		}
		for (int i = 0; i < list.length; i++) {
			for (int j = 0; j < list.length; j++) {
				if (list[i] == 0 || list[j] == 0) {
					continue;
				}
				if ((list[j] % list[i] == 0) && (list[j] != list[i])) {
					list[j] = 0;
					zeroCounter++;
				}
			}
		}
		return arrayWithoutZeroes(list, list.length - zeroCounter);
	}
}

