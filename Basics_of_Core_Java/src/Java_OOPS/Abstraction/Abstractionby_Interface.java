package Java_OOPS.Abstraction;

interface Banks
{
	void InterestRate();
}

class Axis implements Banks
{

	@Override
	public void InterestRate() {

		  System.out.println("SBI Loan Interest: 7%");
		
	}
	
}

class BOI implements Banks {

	@Override
	public void InterestRate() {

		System.out.println("BOI Loan Interest: 8%");
		
	}
    
}


public class Abstractionby_Interface {

	public static void main(String[] args) {


		Axis  a1 = new Axis();
		a1.InterestRate();
		
		BOI  b1 = new BOI();
		b1.InterestRate();
		

	}

}
