package com.matthewru.tij.chapter2;

//Exercise 1: (2) Create a class containing an int and a char that are not initialized, and
//print their values to verify that Java performs default initialization.

public class Exercise1 {
	int a;
	char b;

	public static void main(String[] args) {
		Exercise1 excercise1 = new Exercise1();
		print(excercise1);
	}

	private static void print(Exercise1 exercise1) {
		System.out.println(exercise1.a);
		System.out.println(exercise1.b);
	}
}
