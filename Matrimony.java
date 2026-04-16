package day4;

public class Matrimony {

	public static void main(String[] args) {
		String gender="Female";
		int age= 15;
		
		if(gender=="Male" || gender=="Female")
		{
			System.out.println("The gender is:"+ gender);
			if(age>=18)
			{
				System.out.println("Yes, you can marry!");
			}
			else
			{
				System.out.println("Sorry, you cannot marry, please wait some more years...");
			}
		}
		else
		{
			System.out.println("The given gender is Invalid");
			
		}
	}
}


