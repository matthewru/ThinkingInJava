package tij.chapter2.exercise10;

public class CommandLine {

	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("Please add some arguments!");
			return;
		}
		for(int i = 0; i<args.length; i++) {
			System.out.println(args[i]);
		}
	}
}
