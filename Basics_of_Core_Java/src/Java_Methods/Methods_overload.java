package Java_Methods;

public class Methods_overload {

	static int Add(int x, int y) {
	    return x + y;
	  }
	  
	  static double Add(double x, double y) {
	    return x + y;
	  }
	  
	public static void main(String[] args) {

		int myNum1 = Add(8, 5);
	    double myNum2 = Add(4.3, 6.26);
	    System.out.println("int: " + myNum1);
	    System.out.println("double: " + myNum2);
	}

}
