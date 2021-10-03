package com.bridgelabz.generics;

public class Generics {
	public static <T extends Comparable<T>> T maximum(T value1, T value2, T value3) {
		T max = value1;
		if (value2.compareTo(max) > 0)
			max = value2;
		if (value3.compareTo(max) > 0)
			max = value3;
		return max;
	}

	public static void main(String args[]) {
		System.out.printf("Maximum of %d, %d and %d is %d\n\n", 18, 20, 15, maximum(18, 20, 15));  //printf("%d"\n); //tells to print integer n.
		
		System.out.printf("Maximum of %.1f, %.1f and %.1f is %.1f\n\n", 1.1, 2.2, 3.3, maximum(1.1, 2.2, 3.3));
		
		System.out.printf("Maximum of %s, %s and %s is %s\n", "XYZ", "ABCD", "PQRST",
				maximum("XYZ", "ABCD", "PQRST" ));
	}
}
