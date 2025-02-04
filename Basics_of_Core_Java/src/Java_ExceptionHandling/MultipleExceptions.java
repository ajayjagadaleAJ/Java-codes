package Java_ExceptionHandling;

public class MultipleExceptions {

	public static void main(String[] args) {

		
	try {
		String str = "abcdef";
		System.out.println("String index:" +str.charAt(10));
		
		int a =10;
		System.out.println(a/0);
		
	}
	catch(IndexOutOfBoundsException e)
	{
		System.out.println(e);
	}
	catch(ArithmeticException e)
	{
		System.out.println(e);
	}
	

  }
	
}
