package com.bridgelabz.generics;

import java.util.Scanner;

public class Generics {

	public static void main(String[] args) {
		System.out.println("Welcome to Generics");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first Float");
		float a = sc.nextFloat();
		System.out.println("Enter second Float");
		float b = sc.nextFloat();
		System.out.println("Enter third Float");
		float c = sc.nextFloat();
		sc.close();
		getMax(a, b, c);
	}

	public static Float getMax(Float a, Float b, Float c) {
		Float max = a;
		if (b.compareTo(a) > 0 && b.compareTo(c) > 0) {
			max = b;
		} else if (c.compareTo(a) > 0)
			max = c;

		System.out.println("The maximum no. is: " + max);
		return max;
	}
}
