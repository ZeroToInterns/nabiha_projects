
public class Tester {
	
	private static void determineGender(char gender)
	{
		if(gender == 'M')
			System.out.print("Its a Male");
		}
		else if(gender == 'F')
		{
			System.out.print("Its a female");
		
		}
		else {
			System.out.print("Error: Invalid");
		}
	public static void chooseRoom(String newAnimal, boolean isSick, char gender) {
		if(isSick) {
			System.out.println("We cannot accept this animal");
		}
		//not sick
		else {
			//check if its a dog
			if(newAnimal.equals("Dog") || (newAnimal.equals("dog")))
			{
				determineGender(gender);
	
			}
			//check if its a cat	
			else if(newAnimal.equals("Cat") || (newAnimal.equals("cat"))){
				System.out.println("Its a Cat");
			}
				if(animalGender == 'M') 
				{
					System.out.println("Cat is Male");
				}
				else if (animalGender == 'F') 
				{
					
				}
					System.out.println("Cat is Female");
				}
			else if(newAnimal.equals("Zebra") || (newAnimal.equals("zebra")))
			{
				System.out.println("Its a Zebra");
			}
			//i dont care 
			else { 
				System.out.println("We don't accept this animal");
			}
		
	}
	
	//main method
	public static void main(String[] args) {
		
		
		chooseRoom("Dog", true, 'M');
		
		chooseRoom("dog", false, 'F');
		
		chooseRoom("Cat", false, 'M');
		
		chooseRoom("Other Animal", true);
		
	
	}
	
}
	// 1. name of animal 2. boolean true/false true=sick 3. male or female - chars 
