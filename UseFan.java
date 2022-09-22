package oops;

public class UseFan {
	public static void main(String[] args) {
		Coil coil=new Coil("TATA",1500,150,"Three");
		Fan fan=new Fan("USHA",3500,coil);
		fan.setBrand("venus");
		System.out.println(fan.getBrand());
		System.out.println(fan.getCoil().getPrice());
		
		
	}

}
class Fan{
	private String brand;
	private int price;
	private Coil coil;
	public void setBrand(String b) {
		brand=b;
	}
	public String getBrand() {
		return brand;
	}
	public void setprice(int p) {
		price=p;
	}
	public int getPrice() {
		return price;
	}
	public void setCoil(Coil coil) {
		this.coil=coil;
	}
	public Coil getCoil() {
		return coil;
	}
	public Fan(String b,int price,Coil coil){
		brand=b;
		this.price=price;
		this.coil=coil;
	}
		
	
	public String toString() {
		return brand+" "+price+" "+coil;
	}
	
	
}
class Coil{
	private String brand;
	private int price;
	private int capacity;
	private String phaseType;
	public void setBrand(String b) {
		brand=b;
	}
	public String getBrand() {
		return brand;
	}
	public void setprice(int p) {
		price=p;
	}
	public int getPrice() {
		return price;
	}
	public void setCapacity(int c) {
		capacity=c;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setphasetype(String pt) {
		phaseType=pt;
	}
	public String getPhaseType() {
		return phaseType;
	}
	public Coil(String b,int price,int capacity,String pt){
		brand=b;
		this.price=price;
		this.capacity=capacity;
		phaseType=pt;
	}
	public String toString() {
		return brand+" "+price+" "+capacity+" "+phaseType;
	}
	
	}
