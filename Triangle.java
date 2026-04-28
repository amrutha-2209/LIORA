package day9;
import java.util.Scanner;
public class Triangle {

	public static void main(String[] args) {
				Scanner s = new Scanner(System.in); 
				// Taking three side inputs
				System.out.println("Enter first side:");
				int a = s.nextInt();
				System.out.println("Enter second side:");
				int b = s.nextInt();
				System.out.println("Enter third side:");
				int c = s.nextInt();
				if ((a + b > c) && (a + c > b) && (b + c > a)) { 	// Check if triangle is valid
					System.out.println("Valid Triangle");
					if (a == b && b == c) {
						System.out.println("Equilateral Triangle");
					}
					else if (a == b || b == c || a == c) {
						System.out.println("Isosceles Triangle");
					}
					else {
						System.out.println("Scalene Triangle");
					}
					int x = a, y = b, z = c; // Find longest side for right triangle check
					if (a >= b && a >= c) {
						z = a;
						x = b;
						y = c;
					}
					else if (b >= a && b >= c) {
						z = b;
						x = a;
						y = c;
					}
					else {
						z = c;
						x = a;
						y = b;
					}
					if ((x * x) + (y * y) == (z * z)) { // Check Pythagoras theorem
						System.out.println("Right Triangle");
					}
					else {
						System.out.println("Not a Right Triangle");
					}
				}
				else {
					System.out.println("Invalid Triangle");
				}
	}
}
