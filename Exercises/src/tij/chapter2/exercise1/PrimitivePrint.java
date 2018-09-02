package tij.chapter2.exercise1;

/*
Exercise 1: (2) Create a class containing an int and a char that are not initialized, and
print their values to verify that Java performs default initialization.
 */

public class PrimitivePrint {
	int a;
	char b;

	public static void main(String[] args) {
		PrimitivePrint primitivePrint = new PrimitivePrint();
		print(primitivePrint);
	}

	private static void print(PrimitivePrint primitivePrint) {
		System.out.println(primitivePrint.a);
		System.out.println(primitivePrint.b);
	}
}
