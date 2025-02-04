package Java_Strings;

public class String_methods {

	public static void main(String[] args) {


		String str = "Ajay";
		String str1 = "ajay";
		
		System.out.println("Length of String :"+str.length());
		
		System.out.println("String to Lowercase :"+str.toLowerCase());
		
		System.out.println("String to uppercase :"+str.toUpperCase());
		
		System.out.println("String to concat :"+str.concat(" Jagadale"));
		
		System.out.println("String is equalscase:"+str.equals(str1));
		
		System.out.println("String is equalsIgnoreCase:"+str.equalsIgnoreCase(str1));
		
		System.out.println("Character at particular index :"+str.charAt(1));
		
		System.out.println("Index of character in String:"+str.indexOf('y'));
		
		System.out.println("replaced with original string :"+ str.replace("Ajay", "AJAY"));

	}

}
