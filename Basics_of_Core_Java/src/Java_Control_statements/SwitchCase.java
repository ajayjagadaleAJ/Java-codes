package Java_Control_statements;
import java.util.*;
public class SwitchCase {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice:");
		int choice  = sc.nextInt();
		switch(choice)
		{
		case 1:
			System.out.println("The day is: Monday");
			break;
		case 2:
			System.out.println("The day is: Tuesday");
			break;
		case 3 :
			System.out.println("The day is: Wednsday");
			break;
		case 4 :
			System.out.println("The day is: Thursday");
			break;
		case 5 :
			System.out.println("The day is: Friday");
			break;
		case 6 :
			System.out.println("The day is: Saturday");
			break;
		case 7 :
			System.out.println("The day is: Sunday");
			break;
		}
	

	}

}
