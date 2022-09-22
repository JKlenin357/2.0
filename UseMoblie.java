package oops;

public class UseMoblie {
	public static void main(String[] args) {
		Battery battery=new Battery();
		battery.setBrand("vivobattery");
		battery.setPrice(1200);
		battery.setCapacity(4000);
		
		Moblie moblie =new Moblie();
		moblie.setBrand("vivo");
		moblie.setPrice(20200);
		moblie.setBattery(battery);
		
		System.out.println(moblie.getBrand());
		System.out.println(moblie.getBattery().getBrand());
		
	}

}
class Moblie{
	private String brand;
	private int price;
	private Battery battery;
	public void setBrand(String brand) {
		this.brand=brand;
		}
	public String getBrand() {
		return brand;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	public int getPrice() {
		return price;
	}
	public void setBattery(Battery battery) {
		this.battery=battery;
		}
	public Battery getBattery() {
		return battery;
	}
}
//custom class
class Battery {
	private String brand;
	private int price;
	private int capacity;
 public void setBrand(String brand) {
	 this.brand =brand;
 }
	 public String getBrand() {
		 return brand;
		 }
	 public void setPrice(int price) {
		 this.price=price;
	 }
	 public int getPrice() {
		 return price;
	 }
	 public void setCapacity(int capacity) {
		 this.capacity=capacity;
		 }
	 public int getCapacity() {
		 return capacity;
	 }
}
		 
		 
	 
	

