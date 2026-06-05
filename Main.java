package day19;
import java.util.Scanner;

public class Main {

    // Function to check if a number is prime
    public static boolean isPrime(int n) {
    	//Checking if the entered number is greater than 1.
        if (n <= 1) {
            return false;
        }
        //Checking whether the entered number is prime or not
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    // Function to display primes in a range
    public static void primesInRange(int start, int end) {
        System.out.print("Prime numbers between " + start + " and " + end + " are: ");

        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    // Function to display prime factors
    public static void primeFactorization(int n) {
        System.out.print("Prime factors of " + n + " are: ");

        int divisor = 2;

        while (n > 1) {
            while (n % divisor == 0) {
                System.out.print(divisor + " ");
                n = n / divisor;
            }
            divisor++;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // isPrime()
        System.out.print("Enter a number to check prime: ");
        int num = sc.nextInt();

        if (isPrime(num)) {
            System.out.println(num + " is Prime");
        } else {
            System.out.println(num + " is Not Prime");
        }

        // primesInRange()
        System.out.print("\nEnter start of range: ");
        int start = sc.nextInt();

        System.out.print("Enter end of range: ");
        int end = sc.nextInt();

        primesInRange(start, end);

        // primeFactorization()
        System.out.print("\nEnter a number for prime factorization: ");
        int factorNum = sc.nextInt();

        primeFactorization(factorNum);

        sc.close();
    }
}