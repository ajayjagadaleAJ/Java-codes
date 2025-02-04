package Java_OOPS.Polymorphism;
class Addition{
	
	public int add(int a, int b)
	{
		return a+b;
	}
	
	public int add(int a, int b,int c)
	{
		return a+b+c;
	}
	
	public double add(double a, double b)
	{
		return a + b;
	}
	
}

public class Overloading {
	
	public static void main(String[] args) {
		
		Addition a1 = new Addition();
		System.out.println("addition of a+b:"+a1.add(10, 30));
		System.out.println("addition of a+b+c:"+a1.add(10, 20, 30));
		System.out.println("addition of a+b:"+a1.add(1010, 1103));

	}

}
