package Java_OOPS.Polymorphism;
class Mobile
{
	public void operation()
	{
		System.out.println("Mobile can do multiple operations");
	}
	
}

class Apps extends Mobile
{
	@Override
	public void operation()
	{
		System.out.println("Operations like: playing games, payment, play songs,etc ");
	}
}


public class Overriding {

	public static void main(String[] args) {
		
		Mobile m1 = new Mobile();
		m1.operation();
		
		Apps a1 = new Apps();
		a1.operation();

	}

}
