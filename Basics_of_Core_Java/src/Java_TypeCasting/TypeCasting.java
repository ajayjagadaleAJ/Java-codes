package Java_TypeCasting;

public class TypeCasting {

	public static void main(String[] args) {


//		Widening Casting (automatically) - converting a smaller type to a larger type size
//		byte -> short -> char -> int -> long -> float -> double
//
//		Narrowing Casting (manually) - converting a larger type to a smaller size type
//		double -> float -> long -> int -> char -> short -> byte

		
		//Widening casting
		 int i = 9;
		 double d = i; 

		 System.out.println(i);
		 System.out.println(d);
		 
		 //Narrowing Casting
		  double d1 = 19.78d;
		  int myInt = (int) d1; 

		  System.out.println(d1);
		  System.out.println(myInt);

	}

}
