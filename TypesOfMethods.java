package day14;

class Plane   //parent class
{
	void takeoff()
	{
		System.out.println("Plane is taking off");
	}
	void fly()
	{
		System.out.println("Plane is flying");
	}
	void land()
	{
		System.out.println("Plane is landing");
	}
}


//creating child classes by inheriting the things from parent class

class CargoPlane extends Plane    //child class 1 plane 
{
	void fly()
	{
		System.out.println("Cargo Plane is flying at low heights");
	}
	void carrycargo()
	{
		System.out.println("Cargo plane carries cargo");
	}
}

class PassengerPlane extends Plane   //child class 2 extending the parent class 
{
	void fly()
	{
		System.out.println("Passenger plane is flying at medium heights");
	}
	void carrypassengers()
	{
		System.out.println("Passenger plane carries passengers");
	}
}

class FighterPlane extends Plane   //child class 3 extending from parent class
{
	void fly()
	{
		System.out.println("Fighter plane is flying at great heights");
	}
	void carryweapons()
	{
		System.out.println("Fighter plane is carrying weapons");
	}
}


public class TypesOfMethods {

	public static void main(String[] args) {
		
		CargoPlane cp=new CargoPlane();
		cp.takeoff();   //inherited method
		cp.fly();      //overridden method
		cp.land();     //inherited method
		cp.carrycargo();   //specialized method
		
		PassengerPlane pp=new PassengerPlane();
		pp.takeoff();   
		pp.fly();      
		pp.land();     
		pp.carrypassengers();

		FighterPlane fp=new FighterPlane();
		fp.takeoff();   
		fp.fly();      
		fp.land();     
		fp.carryweapons();
	}

}
