package Java_ExceptionHandling;

public class FinallyBlockException {

	public static void main(String[] args) {

		try {
            int result = 10 / 0; 
        } catch (ArithmeticException e) {
            System.out.println("Caught Exception: " + e);
        } finally {
            System.out.println("This block will always execute!");
        }

	}

}
