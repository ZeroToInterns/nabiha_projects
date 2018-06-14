//WHILE LOOP
public class Thermometer {
	
	//write a method called raise temperature
	//instance variable called temperature . type is double
	//given a double, if its below 90, write a while loop to increase temperature to 90 and then stop
	
	private double temperature;
	
	public void raiseTemp(double currentTemp) {
		while(currentTemp < 90) {
			currentTemp++;
		}
		temperature = currentTemp;
		
	}
	
	public static void main(String[] args) {
		Thermometer therm = new Thermometer();
		therm.raiseTemp(65);
	}
	
	public double getTemp() {
		System.out.println("Temp is " + temperature);
		return temperature; 
	}
}
