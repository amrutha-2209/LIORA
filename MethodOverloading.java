package day9;

public class MethodOverloading {
	
	//Calculate area of square
	int area(int s1,int s2)
	{
		return s1*s2;
	}
	float area(int s1,float s2)
	{
		return s1*s2;
	}
	double area(double s1, double s2)
	{
		return s1*s2;
	}

	public static void main(String[] args) {
		MethodOverloading m= new MethodOverloading();
		System.out.println(m.area(10, 10));
		System.out.println(m.area(12, 12.5f));
		System.out.println(m.area(12.5, 12.5));
	}

}
