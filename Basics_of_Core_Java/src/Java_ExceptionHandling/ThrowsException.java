package Java_ExceptionHandling;

import java.io.IOException;

public class ThrowsException {
	 public static void risk() throws IOException {
	        throw new IOException("This is an IO exception");
	    }
	
	
	public static void main(String[] args) {
		try {
            risk();
        } catch (IOException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }

	}

}
