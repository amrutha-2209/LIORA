package day11;

import java.util.Scanner;

class Bank
{
	private double amount; //Instance Variable

	public Bank(double amount) //Constructor to initialize amount
	{
		this.amount = amount;
	}

	public void withdraw(double withdrawalAmount) //Method to withdrawal money
	{
		String message = (withdrawalAmount <= amount) //Ternary operator to check balance
				? "Withdrawal successful" 
				: "Insufficient balance";

		System.out.println(message);

		if (withdrawalAmount <= amount)
		{
			amount = amount - withdrawalAmount;
		}
	}

	public void deposit(double depositAmount) //Method to deposit money
	{
		amount = amount + depositAmount;
	}

	public double getAmount() //getter method to get final balance
	{
		return amount;
	}
}
//Main class
public class Constructor {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in); //Scanner object for the user input

		System.out.println("Enter initial amount:");
		double initialAmount = s.nextDouble(); //take initial amount as an input

		Bank b1 = new Bank(initialAmount); //Creating bank object using constructor

		System.out.println("Enter withdrawal amount:");
		double withdrawAmt = s.nextDouble(); //Taking withdrawal amount

		b1.withdraw(withdrawAmt); //Calling the withdrawal amount

		System.out.println("Enter deposit amount:");
		double depositAmt = s.nextDouble(); //Taking deposit input

		b1.deposit(depositAmt); //Calling deposit money

		//Display the final balance
		System.out.println("After deposit, available balance: " + b1.getAmount());

	}

}
