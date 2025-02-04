package Java_OOPS.Inheritance;

class Animal {
	
	 void sound()
	{
		System.out.println("Animal can make sound ");
	}
}

class Dog extends Animal{
	
	void run()
	{
		System.out.println("Dog can run ");
	}
}

public class SingleLevel {

	public static void main(String[] args) {
		
		Dog d1 = new Dog();
		d1.sound();
		d1.run();



	}




}

