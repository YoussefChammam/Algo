package de.htw.commands.Algorithms;


public class GCDEuclidSubtractionRec {
	public static int gcd(int a , int b){
		if (b == 0)
			return a;
		else if (a == 0)
			return b;
		else if (a > b)
			return gcd(a-b , b);
		else
			return gcd(a , b-a);
	}
}
