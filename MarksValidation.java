package day3;

public class MarksValidation {

	public static void main(String[] args) {
		int marks=80;
		if(marks>=81 && marks<=100)
		{
			System.out.println("Distinction");
		}
		else if(marks>=60 && marks<=80) {
			System.out.println("First class");
		}
		else if(marks>=35 && marks<=59) {
			System.out.println("Second class");
		}
		else if(marks<0 && marks<=34) {
			System.out.println("Fail");
		}
		else {
			System.out.println("INVALID");
		}

	}

}
