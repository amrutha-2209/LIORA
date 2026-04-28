package day9;
import java.util.Scanner;
public class StraicasePattern {

	public static void main(String[] args) {
				Scanner s = new Scanner(System.in);

				System.out.println("Enter number of rows:");
				int n = s.nextInt();

				for (int i = 1; i <= n; i++) {

					for (int j = 1; j <= n - i; j++) {
						System.out.print(" ");
					}
					for (int k = 1; k <= i; k++) {
						System.out.print("*");
					}

					System.out.println();
				}
	}
}
