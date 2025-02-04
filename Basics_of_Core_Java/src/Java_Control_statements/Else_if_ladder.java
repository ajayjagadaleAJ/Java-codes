package Java_Control_statements;

public class Else_if_ladder {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		
		if((a+b) >30) {
			System.out.println("your addition is positive");
		}
		else if ((a-b)> 10) {
			System.out.println("Your subsraction is negative");
		}
		else if((a*b <=10))
		{
			System.out.println("Your Multiplication is positive");
		}
		else if((a/b >=1))
		{
			System.out.println("your Division  has 0 remainder");
		}
		else
		{
			System.out.println("Insuffient condition");
		}
		

	}

}
