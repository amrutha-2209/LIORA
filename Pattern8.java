package day6;

public class Pattern8 {

	public static void main(String[] args) {
		int n = 3;
        for (int i = 1; i <= n; i++) {

            for (int k = 1; k <= n - i; k++)
                System.out.print(" ");

            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j == 1 || j == 2 * i - 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {

            for (int k = 1; k <= n - i; k++)
                System.out.print(" ");

            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j == 1 || j == 2 * i - 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            System.out.println();
        }

	}

}
