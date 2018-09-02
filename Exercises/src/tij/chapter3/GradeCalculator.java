package tij.chapter3;

public class GradeCalculator {
	public GradeCalculator() {

	}

	public static void calc(Grade g) {
		if (g.numberGrade >= 90) {
			g.letterGrade = "A";
		} else if (g.numberGrade >= 80 && g.numberGrade < 90) {
			g.letterGrade = "B";
		} else if (g.numberGrade >= 70 && g.numberGrade < 80) {
			g.letterGrade = "C";
		} else if (g.numberGrade >= 60 && g.numberGrade < 70) {
			g.letterGrade = "D";
		} else if (g.numberGrade < 60) {
			g.letterGrade = "F";
		}
	}
	
	public static void main(String[] args) {
		Grade grade = new Grade(93.5f);
		System.out.println("Now my letter grade is: " + grade.letterGrade);
		GradeCalculator.calc(grade);
		System.out.println("Now after Grade Calculator my letter grade is: " + grade.letterGrade);
	}
}

class Grade {
	float numberGrade;
	String letterGrade;

	public Grade(float numberGrade) {
		this.numberGrade = numberGrade;
	}
}
