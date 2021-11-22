package de.htw.commands.Algorithms;

public class GCDEuclidDivisionRestIt{
	public static int gcd(int a, int b) {
		while (b != 0) {
			int h = a % b;
			a = b;
			b = h;
		}
		return a;
	}
}

