package Java_OOPS.Encapsulation;

class Laptop{
	
	
    private String brand;
    private int ram;
    private int storage;
    private double price;

	public Laptop(String brand, int ram, int storage, double price) {
		super();
		this.brand = brand;
		this.ram = ram;
		this.storage = storage;
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public int getStorage() {
		return storage;
	}

	public void setStorage(int storage) {
		this.storage = storage;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void displayDetails() {
        System.out.println("Laptop Brand: " + brand);
        System.out.println("RAM Size: " + ram + "GB");
        System.out.println("Storage: " + storage + "GB");
        System.out.println("Price: Rs. " + price);
    }
	    
}

public class Encapsulation {

	public static void main(String[] args) {
 
		Laptop l1 = new Laptop("HP", 8, 512, 550000);
        l1.displayDetails();
      
      
      
   
      

	}

}
