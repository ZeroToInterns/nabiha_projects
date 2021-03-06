public class ElectricCar {
	//instance variables
	private String make;
	private int maxRange;
	private int currentRange;
	
	//constructor
	public ElectricCar(String theMake, int theMaxRange) {
		make = theMake;
		maxRange = theMaxRange;
		currentRange = 0;
	}
//methods
	
	// charges the ElectricCar to its maximum range
	public void charge() {
		currentRange = maxRange;
		
	}
	// drives the car the specified distance, this reduces the current range
	public void drive(int miles) {
		currentRange = currentRange - miles;
		
	}
	// gets the make of the ElectricCar
	public String getMake() {
		System.out.println("Make is: " + make);
		return make;
		
	}
	// gets the number of miles the car can go on the current range
	public int getCurrentRange() {
		System.out.println("Current range is: " + currentRange);
		return currentRange;
		
	}
	// gets the maximum number of miles the car can go when fully charged
	public int getMaxRange() {
		System.out.println("Max range is: " + maxRange);
		return maxRange;
	}

}
