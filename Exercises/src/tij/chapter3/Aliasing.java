package tij.chapter3;

public class Aliasing {
	float a;
	float b;
	float c;

	public Aliasing(float a, float b, float c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public static void main(String[] args) {
		Aliasing original = new Aliasing(1.0f, 2.0f, 3.0f);
		Aliasing alias = original;

		System.out.println("alias should have the same values a: " + alias.a);
		System.out.println("alias should have the same values b: " + alias.b);
		System.out.println("alias should have the same values c: " + alias.c);

		System.out.println("Now changing original ... ");

		original.a = 4.0f;

		System.out.println("Alias should automatically change too: " + alias.a);
	}
}
