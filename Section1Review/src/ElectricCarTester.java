
public class ElectricCarTester {
	//creating an electric car
	public static void main(String[] args) {
		ElectricCar newElectricCar = new ElectricCar("Tesla", 500);		
		newElectricCar.getMake();
		newElectricCar.getMaxRange();
		newElectricCar.charge();
		newElectricCar.getCurrentRange();
		newElectricCar.drive(500);
		newElectricCar.getCurrentRange();
		newElectricCar.charge();
		newElectricCar.drive(250);
		newElectricCar.getCurrentRange();
	}
}
