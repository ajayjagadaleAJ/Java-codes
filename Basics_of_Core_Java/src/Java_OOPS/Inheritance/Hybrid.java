package Java_OOPS.Inheritance;
class Bank {
 void bankDetails() {
     System.out.println("Welcome to SBI Bank.");
 }
}

class Branch extends Bank {
 void branchDetails() {
     System.out.println("This is the Pune Branch.");
 }
}

interface Loan {
 void loanDetails();
}


interface Savings {
 void savingsDetails();
}


class Customer extends Branch implements Loan, Savings {
	
 void customerDetails() {
     System.out.println("Customer Name: Ajay");
 }

 @Override
 public void loanDetails() {
     System.out.println("Loan Type: Education Loan");
 }

 @Override
 public void savingsDetails() {
     System.out.println("Savings Account: Active");
 }
}

public class Hybrid {
 public static void main(String[] args) {
     Customer cust = new Customer();
     cust.bankDetails();       
     cust.branchDetails();     
     cust.customerDetails();   
     cust.loanDetails();       
     cust.savingsDetails();   
 }
}


