class Vehicle
{
	
	void start()
	{
		System.out.println("vehicle is starting");
	}
	
}


class Car extends Vehicle
{
	
	void fillfuel()
	{
		System.out.println("filling fuel");
	}
	
}


class Bike extends Vehicle
{
	
   void stop()
   {
	   System.out.println("bike stoped");
	
	
}
}


public class InheritanceExample1 
{

	public static void main(String[] args) 
	{
		  Car c = new Car();
		  c.start();
		  c.fillfuel();
		  
		  Bike b = new Bike();
		  b.start();
		  b.stop();
	}
}

