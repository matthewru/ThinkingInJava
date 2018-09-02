package tij.chapter2.exercise11;

public class AllTheColorsOfTheRainbow {
	int anIntegerRepresentingColors;
	
	void changeTheHueOfTheColor(int newHue) {
		this.anIntegerRepresentingColors = newHue;
	}
	
	public static void main(String[] args) {
		AllTheColorsOfTheRainbow allthecolorsoftherainbow = new AllTheColorsOfTheRainbow();
		System.out.println("The Current Color is: " + allthecolorsoftherainbow.anIntegerRepresentingColors);
		allthecolorsoftherainbow.changeTheHueOfTheColor(1);
		System.out.println("Now the Color is: " + allthecolorsoftherainbow.anIntegerRepresentingColors);
		
	}
}
