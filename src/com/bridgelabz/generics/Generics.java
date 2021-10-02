package com.bridgelabz.generics;

import java.util.Scanner;

public class Generics {

	public static void main(String[] args) {
		System.out.println("Welcome to Generics");
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter first integer");
		int a=sc.nextInt();
		System.out.println("Enter second integer");
		int b=sc.nextInt();
		System.out.println("Enter third integer");
		int c=sc.nextInt();
		sc.close();
		getMax(a, b, c);
	}

	public static Integer getMax(Integer a, Integer b, Integer c) {
		int max = a;
		if (b.compareTo(a) > 0 && b.compareTo(c) > 0) {
			max = b;
		} else if (c.compareTo(a) > 0)
			max = c;

		System.out.println("The maximum no. is: "+ max );
		return max;
	}
}
