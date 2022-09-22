package oops;

public class UseCamera {
	public static void main(String[] args) {
		Lense lense=new Lense("bold",500,true);
		Camera camera=new Camera("nikon",20000,lense);
		System.out.println(camera);
	}

}
class Camera{
	 String brand;
	 int price;
	 Lense lense;
	 public Camera(String b,int p,Lense lense) {
		 brand=b;
		 price=p;
		this.lense=lense;
	 }
	 public String toString() {
		 return brand+" "+price+" "+lense;
	 }
}
class Lense{
	String brand;
	int price;
	boolean isConcave;
	public Lense(String b,int p,boolean c) {
		 brand=b;
		 price=p;
		 isConcave=c;
	}
	public String toString() {
		 return brand+" "+price+" "+isConcave;
	}
	
}
