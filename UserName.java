import java.util.Scanner; //Scanner import
public class UserName {
	
	public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in); //Scanner call
	System.out.println("What is your name?");
	String name = scanner.nextLine();
	char [] charName = name.toCharArray(); //Creating an array for the String
	
	
	 String userName = setUserName(charName); // calling the method
	
	
	 System.out.println("Username: " + userName); //Output

     scanner.close(); // closing Scanner
	}

	// Creating a method to convert the space to '-'
	public static String setUserName(char[] charName) { 
		
		//Calling the String builder to modify the String
		StringBuilder userName = new StringBuilder (); 
		
		// using for loop to find the character 
		for (char c : charName) {
			if(c ==' ') {
				userName.append('_'); // calling the append method
		} else {
			userName.append(c); // changes nothing
		}
			
		}
		return userName.toString(); // converting the character to String
		}
	
	
	
}