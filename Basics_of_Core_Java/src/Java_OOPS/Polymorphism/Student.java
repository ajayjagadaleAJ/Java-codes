package Java_OOPS.Polymorphism;
class Person{
	public void getdata()
	{
		System.out.println("Person can plays multiple roles");
	}
	
}
class Employee extends Person
{
	public void getdata()
	{
		System.out.println("Person can be Employee");
	}
}
class Teacher extends Employee
{
	public void getdata()
	{
		System.out.println("Person can be Teacher");
	}
	
}
public class Student {

	public static void main(String[] args) {
		
		Person p1 = new Person();
		p1.getdata();

		Employee e1 = new Employee();
		e1.getdata();
		
		Teacher t1 = new Teacher();
		t1.getdata();
	}

}
