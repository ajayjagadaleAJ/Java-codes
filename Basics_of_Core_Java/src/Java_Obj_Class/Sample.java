package Java_Obj_Class;

public class Sample {

	public void fullThrottle() {
	    System.out.println("The car is going as fast as it can!");
	  }
	
	 public void speed(int maxSpeed) {
		    System.out.println("Max speed is: " + maxSpeed);
	 }
	public static void main(String[] args) {
		
		Sample s1 = new Sample();
		s1.fullThrottle();
		s1.speed(150);



	}

}
