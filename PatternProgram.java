package day5;

public class PatternProgram {

	public static void main(String[] args) {
		 int n = 3;

	        for (int i = 1; i <= n; i++) {

	            for (int j = i; j < n; j++) {
	                System.out.print(" ");
	            }

	            for (int k = 1; k <= (2 * i - 1); k++) {
	                System.out.print("*");
	            }

	            System.out.println();
	        }


	        System.out.print("\n");
		int a = 5;

        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= a; j++) {

                if (i == 1 || i == a || j == 1 || j == a) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }

            }
            System.out.println();
        }
	}

}
