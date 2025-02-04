package Java_OOPS.Inheritance;

class Vehicle{
	
	public void speed()
	{
		System.out.println("Average speed of vehicles are between 50 to 60");
	}

}
class Honda extends Vehicle
{
	public void run()
	{
		System.out.println("Honda is vehicle company brand");
	}
}

class Bajaj extends Honda
{
	public void drive()
	{
		System.out.println("Bajaj is vehicle company brand");
	}
}
class Tvs extends Bajaj
{
	public void ride()
	{
		System.out.println("TVS is vehicle company brand");
	}
}


public class MultiLevel {

	public static void main(String[] args) {
		
		Tvs v1 = new Tvs();
		v1.speed();
		v1.run();
		v1.ride();
		v1.drive();

	}

}
