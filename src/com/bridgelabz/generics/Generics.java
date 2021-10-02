package com.bridgelabz.generics;

import java.util.Scanner;

public class Generics {

	public static void main(String[] args) {
		System.out.println("Welcome to Generics");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first String");
		String a = sc.next();
		System.out.println("Enter second String");
		String b = sc.next();
		System.out.println("Enter third String");
		String c = sc.next();
		sc.close();
		getMax(a, b, c);
	}

	public static String getMax(String a, String b, String c) {
		String max = a;
		if (b.compareTo(a) > 0 && b.compareTo(c) > 0) {
			max = b;
		} else if (c.compareTo(a) > 0)
			max = c;

		System.out.println("The maximum no. is: " + max);
		return max;
	}
}
