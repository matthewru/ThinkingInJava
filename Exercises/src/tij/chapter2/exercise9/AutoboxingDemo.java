package tij.chapter2.exercise9;

public class AutoboxingDemo {

	public static void main(String[] args) {
		boolean b = true;
		char c = 'y';
		byte by = 67;
		short s = 123;
		int i = 456;
		long l = 789;
		float f = 10.1112f;
		double d = 13.1415;
		
		Boolean objBoolean = b;
		Character objChar = c;
		Byte objByte = by;
		Short objShort = s;
		Integer objInt = i;
		Long objLong = l;
		Float objFloat = f;
		Double objDouble = d;
		
		System.out.println(objBoolean);
		System.out.println(objChar);
		System.out.println(objByte);
		System.out.println(objShort);
		System.out.println(objInt);
		System.out.println(objLong);
		System.out.println(objFloat);
		System.out.println(objDouble);

	}
	
}
