package Java_Strings;

public class StringBuffer_meth {

	public static void main(String[] args) {


		StringBuffer s1 = new StringBuffer("welcome");
		
		System.out.println("Append :" + s1.append(" TO Java"));
		
		System.out.println("Insert:" + s1.insert(7,"TO"));
		
		System.out.println("Length of String: "+s1.length());
		
		System.out.println("Delete:" + s1.delete(3,11));
		
		System.out.println ("Delete charAt : " + s1.deleteCharAt(5));
		
		System.out.println("Replace characters:"+s1.replace( 1,2, "Java"));
		
		System.out.println("Capacity of String :"+s1.capacity());
		
		System.out.println("Reverse string :"+s1.reverse());
		
		
		
	}

}
