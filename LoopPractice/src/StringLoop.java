
public class StringLoop {
	
	//print first 100
	//print method so void method
	//print the numbers 1 to 100
	
	
	//prints the numbers 2 - 100 (only evens)
	
	
	//print the numbers 1-100 (only odds)
	
	public void printHundred(){
		
		for(int i=1; i<=100; i++) {
			System.out.println("The number is : " + i);
		}
	}
		
	public void printEvens() {
		for(int i=0; i<=100; i += 2) {
			System.out.println("The even number is : " + i);
		}
		
	}
	
	public void printOdds() {
		for(int i=1; i<100; i += 2) {
			System.out.println("The odd number is : " + i);
		}
	}
	
	//print0 method loops through a string and prints "Found O!" when it hits an O
//	
//	public void printO(String word) {
//		for(String letter : word) {
//			if(letter == "O" || letter.equals("o")) { // can also do letter.equalsIgnoreCase("O")
//				System.out.println("Found O!");
//			}
//		}
//	}
//	should have parameter for string. what will happen in outer and inner for loop
//	
//	Hello World - string
//	H
//	ee
//	lll
//	llll
//	ooooo
//	
//	WWWWWWW
//	oooooooo
//	rrrrrrrrr
//	continue
	// first loop outer loop loops through the word itself. (substring). inner for loop will print that letter in the pattern.
	//use variable from outer loop in inner loop
	
	public void printPattern(String word) {
		//i and j are local variables
		for (int i = 0; i < word.length(); i++) {
			for (int j = 0; j < i +1; j++) {
				System.out.print(word.substring(i, i+1));
				
			}
			System.out.println("");
			
		}
		
	}
	
	
	
	

}
