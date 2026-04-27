package day8;
import java.util.Scanner;
public class Array {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int arr[]=new int[5];
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the age of Student:"+i);
			arr[i]=s.nextInt();
		}
		System.out.println("The ages of the Students are:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}

}

