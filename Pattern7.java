package day6;

public class Pattern7 {

	public static void main(String[] args) {
		for(int i=1;i<=4;i++)
		{
			for(int k=1;k<=4-i;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=7;j++)
			{
				if(i==1||i==3||i==5||j==1||j==7)
					{
					System.out.print("*");
					}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		

	}

}
}
