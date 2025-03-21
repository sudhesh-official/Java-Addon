package oops.concepts;

public class Car extends Vehicle {

	enum FuelType {
		Disel, Petrol, Gas
	};

	private int WheelCount, NoOfGears;
	private FuelType ftype;

	public Car() {
		WheelCount = 4;
		NoOfGears = 5;
	}

	public Car(String make, String color, String owner, float price, 
			int wheelCount, int noOfGears, FuelType ftype) {
		super(make, color, owner, price);
		WheelCount = wheelCount;
		NoOfGears = noOfGears;
		ftype = ftype;

	}

	@Override
	public void display() {
		super.display();
		System.out.println("No Of Gears: " + NoOfGears);
		System.out.println("Wheel Count: " + WheelCount);
	}

}
