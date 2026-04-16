package day3;

public class ExampleForOperators {

	public static void main(String[] args) {
		
		System.out.println("-----Arithmetic Operators------");
		
		int num1=30;
		int num2=40;
		System.out.println("Addition:" + (num1 + num2));
		System.out.println("Subtraction:" +(num1 - 12));
		System.out.println("Multiplication:" +(num2 * 3));
		System.out.println("Division:" +(num2 / 10));
		System.out.println("Modulas:" +(num2 % 3));
		
		System.out.println("------Assignment Operators------");
		int x=10;
		x+=5;//x = x+5
		System.out.println("Value of x:"+x);
		x-=3;//x = x-3
		System.out.println("Value of x:"+x);
		x*=3;//x = x-3
		System.out.println("Value of x:"+x);
		x/=3;//x = x-3
		System.out.println("Value of x:"+x);
		x%=3;//x = x-3
		System.out.println("Value of x:"+x);
		
		
		System.out.println("------Comparison Operators------");
		int a=10;
		int b=20;
		System.out.println(a<b);
		System.out.println(a<=5);
		System.out.println(b>a);
		System.out.println(b>=50);
		System.out.println(a==b);
		System.out.println(a!=b);
		
		
		System.out.println("------Logical Operators------");
		int p=1;
		int q=2;
		boolean res=p<q && p==1;//AND Operator
		System.out.println(res);
		
		System.out.println(p<=4 || q==10);//OR Operator
		
		System.out.println(!true);//NOT Operator
		System.out.println(!false);//NOT Operator
		
		
		System.out.println("------Unary Operator------");
		int n=20;
		int m=n++ + n-- + ++n + n++ + n-- + ++n - --n;
		System.out.println(n);
		System.out.println(m);
		
		
		System.out.println("------Ternary Operator------");
		int n1=200;
		int n2=300;
		int max = n1>n2?n1:n2;
		System.out.println("Maximum of:" + n1 + " & " + n2 + " is " + max);
	}
	

}
