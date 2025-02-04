package Java_ExceptionHandling;

public class CustomExceptions {
  
	 public void ageCheck(int age)
	 {
		 if(age < 18)
		 {
			 throw new IllegalArgumentException("Age must be 18 or above");
		 }
		 System.out.println("Access granted");
	 }
	 
	
	public static void main(String[] args) {
		CustomExceptions ce = new CustomExceptions();
		ce.ageCheck(16);
	}

}
