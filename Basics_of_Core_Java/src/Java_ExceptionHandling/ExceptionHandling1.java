package Java_ExceptionHandling;

public class ExceptionHandling1 {

	public static void main(String[] args) {

		String str  = null;
		
		try {
			  int length = str.length();   
	          System.out.println("Length of the string: " + length);  
		}catch(NullPointerException e)
		{
			System.out.println("Error: Null reference encountered.");
		}

	}

}
