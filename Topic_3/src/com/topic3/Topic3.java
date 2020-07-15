package com.topic3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Topic3 {

	
	public static <E> void printArray(E[] inputArray) {
		// Display array elements
		for (E element : inputArray) {
			System.out.printf("%s ", element);
		}
		System.out.println();
	}

	public static void main(String[] args) {

		/* ....Normal Array..... */

		// Create arrays of Integer, Double and Character

		Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };

		printArray(charArray); // pass a Character array
		String[] arr = new String[2];
		arr[0] = "Dominic";
		arr[1] = "Kgoete";
		System.out.println(arr[0] + " " + arr[1] + "\n");

		/* ....ArrayList...... */
		// creating an object of ArrayList class
		ArrayList<String> arrL = new ArrayList<String>();
		arrL.add("1996, Java"); // Autoboxing
		arrL.add("1991, Python");
		arrL.add("1995, JavaScript");
		arrL.add("2010, Swift");
		arrL.add("1983, C++");
		arrL.add("2001, C#");
		arrL.add("1994, PHP");
		arrL.add("1979, SQL");

		System.out.println("Programing languages with the year made: ");
		for (String langs : arrL) {
			System.out.println(langs);
		}

		Collections.sort(arrL);
		System.out.println("\n" + "Sorted in chronological order: ");
		for (String langs2 : arrL) {
			System.out.println(langs2);
		}

		// int data type
		int intVar = 42;
		// wrapping around Integer object
		Integer intobj = new Integer(intVar);

		
		
		GenericClass<String> genString = new GenericClass<String>();
		genString.add(new String("Java is interestng"));
		
		System.out.println("Meaning of Life: " + intobj + " but again " + genString.getT() + "\uD83D\uDE00");

	}
}
