package day16;

import java.util.Scanner;

interface Calculator
{
	void add();
	void sub();
}

class MyCalculator1 implements Calculator
{
	public void add()
	{
		int a = 20;
		int b = 10;
		int c = a+b;
		System.out.println(c);
	}
	public void sub()
	{
		int a = 20;
		int b = 10;
		int c = a-b;
		System.out.println(c);
	}
}

class MyCalculator2 implements Calculator
{
	public void add()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the first number:");
		int a = s.nextInt();
		System.out.println("Enter the second number:");
		int b = s.nextInt();
		int c= a+b;
		System.out.println(c);
	}
	public void sub()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number:");
		int a = sc.nextInt();
		System.out.println("Enter the second number:");
		int b = sc.nextInt();
		int c= a-b;
		System.out.println(c);
	}
}
public class Interface {

	public static void main(String[] args) {
		MyCalculator1 c1=new MyCalculator1();
		MyCalculator2 c2=new MyCalculator2();
		
		c1.add();
		c1.sub();
		c2.add();
		c2.sub();

	}

}
