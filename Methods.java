package day9;

public class Methods {
	
	//with parameters and with return
	int add(int a,int b)
	{
		return a+b;//this part only returns the result where we didn't print the result
		
	}
	
	//with parameter and no return
	void subtract(int a,int b)
	{
		System.out.println("Subtract :"+(a-b));
	}
	
	//without parameter and without return
	void mul()
	{
		int a=5;
		int b=10;
		int result=a*b;
		System.out.println(result);
	}
	
	//without parameter and with return
	int div()
	{
		int n1=100;
		int n2=10;
		return n1/n2;
	}

	public static void main(String[] args) {
		
		Methods m =new Methods();
		System.out.println(m.add(27, 56));
		
		m.subtract(100, 10);
		
		m.mul();
		
		System.out.println(m.div());

	}

}
