
public class SodaCan {
	//instance variables
	public static final double IN_TO_OZ = 0.554112554;
	private double radius;
	private double height;
	private double contents;
	
	//constructor 1: no-argument default constructor
	public SodaCan() {
		radius = 1.2109;
		height = 4.704;
		contents = Math.PI * radius * radius * height * IN_TO_OZ;
	}
	
	//constructor 2: accepts radius and height as arguments
	public SodaCan(double myRadius, double myHeight) {
		radius = myRadius;
		height = myHeight;
		contents = Math.PI * radius * radius * height * IN_TO_OZ;
		
	}

//accessor methods
	
	//gets the radius of SodaCan
	public double getRadius() {
		return radius;
		
	}
	
	//gets the height of SodaCan
	public double getHeight() {
		return height;
		
	}
	
	
//mutator method
	
	//simulates drinking from SodaCan by subtracting fluid_ounces from the contents
	public void drink(double fluidOunces) {
		contents = contents - fluidOunces;
	}
//accessor method
	
	//gets the fluid ounces of soda remaining in SodaCan
	public double getContents() {
		return contents;
		
	}
}
