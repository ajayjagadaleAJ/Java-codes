package Java_Obj_Class;

public class Constructors {

	
	Constructors()
	{
		System.out.println("This is default constuctor");
	}
	Constructors(int id ,String name)
	{
		System.out.println("This is parameterized constructor:id:="+ id +" name:" + name);
	}
	
	public static void main(String[] args) {

		Constructors con = new Constructors();
		
		Constructors con1 = new Constructors(101,"Aniket");
		

	}

}
