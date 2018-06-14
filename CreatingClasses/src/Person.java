
public class Person {

	private String name;
	private int age;
	private char gender;
	private double weight;
	private String hairColor;
	private String height;
	
	//The job of the constructor is to set the instance variables with initial values
	public Person(String myname, int myage, char mygender, double myweight, String myhairColor, String myheight) {
		name = myname;
		age = myage;
		gender = mygender;
		weight = myweight;
		hairColor = myhairColor;
		height = myheight;
	}
	
	public Person (String myname, int myAge) {
		name = myname;
		age = myage;
		gender = 'M';
		weight = 150;
		hairColor = "Blue";
		height = "5'7";
	}
	
	//method
	public static void main(String[] args) {
		//creating a Person
		Person newPerson = new Person("Michael", 25, 'M', 156, "Brown", "5'7");
		Person secondPerson = new Person("James", 26, 'M', 156, "Blonde", "5'6");
		Person thirdPerson = new Person("Michael", 56);
		
		thirdPerson.setName("Mark");
	
	}
	
	
	public String getName() {
		System.out.println("get Name");
		return name;
	}
	public void setName(String newName) {
		name = newName;
	}
	
	public String gethairColor() {
		//sethairColor
	}
	
	public void sethairColor(String newhairColor) {
		hairColor = newHairColor;
	}

}