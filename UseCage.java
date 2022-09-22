package oops;

public class UseCage {
	public static void main(String[] args) {
		Bird bird=new Bird();
		bird.name="parrot";
		bird.price=12000;
		bird.birdSize=5;
		Cage cage=new Cage();
		cage.brand="chine";
		cage.price=5000;
		cage.metal="iron";
		cage.bird=bird;
		System.out.println(cage.brand);
		System.out.println(cage.bird.name);
		
		
	}

}
//bean class
class Cage{
	String brand;
	int price;
	String metal;
	Bird bird;
	
}
//custome class
class Bird{
	String name;
	int price;
	int birdSize;
}

