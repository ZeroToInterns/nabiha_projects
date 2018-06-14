
public class Student {
	
	private String name;
	private double GPA;
	
	public Student(String myName, double myGPA) {
		
		name = myName;
		GPA = myGPA;
		
	}

	//method
	public static void main(String[] args) {
		//creating a Student
		Student newStudent = new Student("Michael", 4.0);
		newStudent.getName();
		newStudent.setName("Mike");
		newStudent.getName();
		System.out.println(newStudent.getGPA());
		newStudent.changeGPA(3.9);
		System.out.println(newStudent.getGPA());

	}
	
	public String getName() {
		System.out.println("Name is: " + name);
		return name;
	}
	public void setName(String newName) {
		name = newName;
	}
	
	public double getGPA() {
		System.out.println("GPA is: "+ GPA);
		return GPA;
	}
	
	public void changeGPA(double changeGPA) {
		GPA = changeGPA;
	}
}
