package day4;

public class LoginValidation {

	public static void main(String[] args) {
		String id="admin";
		int password=12345;
		if(id=="admin")
		{
			System.out.println("User ID is Valid");
			if(password==12345)
			{
				System.out.println("Password is Valid \n Login Successfull");
			}
			else
			{
				System.out.println("Password is InValid \n Login Unsuccessfull");
			}
		}
		else
		{
			System.out.println("User ID is Invalid \n Login Unsuccessfull");
		}

	}

}
