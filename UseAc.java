package oops;

public class UseAc {
  public static void main(String[] args) {
	  Compressor com=new Compressor();
	  com.setBrand("croma");
	  com.setPrice(1500);
	  Ac a=new Ac();
	  a.setBrand("TATA");
	  a.setPrice(25000);
	  a.setCompressor(com);
	  System.out.println(a.getBrand());
	  System.out.println(a.getCompressor().getBrand());
	  	}

}
class Ac{
	private String brand;
	private int price;
	private Compressor compressor;
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
	public void setCompressor(Compressor compressor) {
		this.compressor=compressor;
		}
	public Compressor getCompressor() {
		return compressor;
	}
}
//custom class
class Compressor {
	private String brand;
	private int price;
	
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
	
}

