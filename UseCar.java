package oops;

public class UseCar {
	public static void main(String[] args) {
		Engine engine=new Engine();
		engine.brand="ford";
		engine.price=12000;
		engine.enginecc=450;
		
		Car car=new Car();
		car.brand="fordCar";
		car.price=450000;
		car.color="red";
		car.engine=engine;
		System.out.println(car.brand);
		System.out.println(car.engine.brand);
	System.out.println(car.price);
	}

}
