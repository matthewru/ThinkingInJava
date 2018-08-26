package tij.chapter2.exercise4;

public class DataOnly {
	int times;
	double number;
	boolean canPrint;

	public DataOnly(int times, double number) {
		this.times = times;
		this.number = number;
		this.canPrint = (this.times > 0) && (this.number > 0);
	}

	public void printNumber() {

		for (int i = 0; i < times; i++) {
			System.out.println(this.number);
		}
	}
	
	public static void main(String[] args) {
		DataOnly dataOnly = new DataOnly(100000, 14.7);
		dataOnly.printNumber();
	}
}
