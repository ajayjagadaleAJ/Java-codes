package Java_ExceptionHandling;

public class ExceptionHandling {

	public static void main(String[] args) {


		int a =10;
		int b = 0;
		
		try {
			int c = a/b;
		}catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		System.out.println("Code executed Successfully");

	}

}
