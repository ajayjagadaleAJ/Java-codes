package Java_OOPS.Abstraction;

abstract class Bank {
    abstract void loanInterest();  

    void bankDetails() { 
        System.out.println("Welcome to ABC Bank.");
    }
}


class SBI extends Bank {
    @Override
    void loanInterest() {
        System.out.println("SBI Loan Interest is: 7%");
    }
}


class HDFC extends Bank {
    @Override
    void loanInterest() {
        System.out.println("HDFC Loan Interest: 8%");
    }
}



public class Abstraction {

	public static void main(String[] args) {

   HDFC h = new HDFC();
   h.loanInterest();
   
   SBI s = new SBI();
   s.loanInterest();
		

	}

}
