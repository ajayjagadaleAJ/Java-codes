package Java_OOPS.Inheritance;

class Vehicles{
	
	public void show()
	{
		System.out.println("This is parent class of vehicle");
	}
}

class Car extends Vehicles{
	 public void run()
	 {
		 System.out.println("Cars are part of vehicle class");
	 }
}

class Bike extends Vehicles{
	public void move()
	{
		System.out.println("Bikes are part of vehicle class");
	}
}



public class Herarchical {

	public static void main(String[] args) {
		
		Bike b1 = new Bike();
		b1.move();
		b1.show();
		
		System.out.println();
		
		Car c1 = new Car();
		c1.run();
		c1.show();
		

	}

}
