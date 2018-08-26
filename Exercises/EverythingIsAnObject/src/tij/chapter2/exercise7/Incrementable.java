package tij.chapter2.exercise7;

public class Incrementable {

	static int times;

	public Incrementable() {

	}

	public void printNumber(double number) {
		System.out.println(number);
		Incrementable.times++;
	}

	public static int getPrintTimes() {
		return Incrementable.times;
	}

	public static void main(String[] args) {
		Incrementable incrementable1 = new Incrementable();
		incrementable1.printNumber(9181.6);
		incrementable1.printNumber(91.6);
		incrementable1.printNumber(956681.6);
		
		Incrementable incrementable2 = new Incrementable();
		incrementable2.printNumber(9181.6);
		incrementable2.printNumber(91.6);
		
		incrementable1.printNumber(918.6);
		incrementable1.printNumber(900087.6);
		
		incrementable2.printNumber(956681.6);
		incrementable2.printNumber(918.6);
		incrementable2.printNumber(900087.6);

		System.out.println("I have printed " + Incrementable.getPrintTimes() + " times");
	}
}
