import java.util.Scanner;

public class InputApplication {
	
	//main method
	public static void main(String args[]) {
		
		//scanner object
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter your favorite dessert: ");
		//use nextLine method to get the word
		String dessert = in.nextLine();
		//ask user to enter their fav dessert - might be more than one word
		System.out.println("Your favorite dessert is: " + dessert);
		
		//print the last letter of the input
		System.out.println("The last letter of your favorite dessert is: " + dessert.charAt(dessert.length() -1));
		
		//ask user to enter a double
		System.out.print("Enter a double: ");
		//use nextDouble method to get a double
		double decimal = in.nextDouble();
		System.out.println("The double you entered is: " + decimal);
		
		//ask user to enter an integer
		System.out.print("Enter an integer: ");
		//use nextInt method to get an integer
		int integer = in.nextInt();	
		System.out.println("The integer you entered is: " + integer);
		
		//calculate the product of double * integer
		double productDouble = decimal * integer;
		//print product on new line
		System.out.println("The product of your inputs in decimal form is: " + productDouble);
		
		int productInt = (int) decimal * integer;
		//print integer portion of product on new line (think cast)
		System.out.println("The product of your inputs in integer form is: " + productInt);
	}

}
