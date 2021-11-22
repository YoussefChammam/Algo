package de.htw.commands.Algorithms;

public class GCDEuclidDivisionRestRec{

	public static int gcd(int a, int b){
		if (b == 0){
			return a;
		}else{
			return gcd(b, a % b);
		}
	}
}