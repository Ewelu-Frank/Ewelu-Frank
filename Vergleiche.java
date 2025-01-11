import java.util.Scanner;
public class Vergleiche {
public static String name1;
public static  String name2;
	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner (System.in); //Scanner to Read 
		System.out.println("Welche Funktion wollen sie auswählen?"); // Options to Choose, that leads to seperate Functions
		System.out.println("Name oder Zahlen"); // The listing of the available Options 
		String question = scanner.nextLine();
		
		
		
		
		
		
		switch (question.trim().toLowerCase())  { // Case Sensitivity
		case "name" : // First Option
			Vergleiche compare = new Vergleiche(); // Calling the class
			Scanner name = new Scanner(System.in);
			System.out.println("Um zwei Name zu vergleichen"); //Questions to the first Option
			System.out.println("Schreiben Sie bitte eine Name");
			name1 = scanner.nextLine();		
			System.out.println("Schreiben Sie bitte eine zweite Name");
			name2 = scanner.nextLine();
			
			
		    System.out.println( compare.compareNames(name1 , name2)); // Calling function
		    break;
		
		case "zahlen": // Second Option
			Vergleiche numbers = new Vergleiche(); //Calling class although unnecessary in this case
			System.out.println("Um drei ganzzahlen zu vergleichen");
			System.out.println("Schreiben Sie  ihre erste Zahl?");
			int n1 = scanner.nextInt();
			System.out.println("Schreiben Sie ihre zweite Zahl?");
			int n2 = scanner.nextInt();
			System.out.println("Schreinben Sie ihre dritte Zahl?");
			int n3 = scanner.nextInt();
			
			System.out.println("Die folgende Zahlen zu vergleichen sind " + numbers.compareNumbers(n1, n2, n3)); // Calling the Compare function 
			System.out.println("Die Durchschnitt der Zahlen : " +numbers.durchschnitt(n1,n2, n3)); // Calling the average function
			System.out.println("Die Produkt der Zahlen :  " + numbers.produkt(n1,n2,n3)); // Calling the Product function
			System.out.println( numbers.groesste(n1,n2, n3)); // Calling the function that identifies the biggest number
			break;
			
		default : // default
			System.out.println("Ihr Auswahl ist unbekannt"); // default statement
			break;
		}
		scanner.close(); // closing scanner in the main method
	}
  
	//Creating the name comparison method to compare names
    static String  compareNames(String name1, String name2) {
    	// To return String
		
		
    	// comparing the names using the length of the letters
	   if (name1.length()> name2.length()) { 
		   return name1 + " hat mehr Buchstaben als " + name2;
	   } else if (name1.length()< name2.length()) {
		   return name2 + " hat mehr Buchstaben als "+ name1;
	   } else { 
		   // When both names have the same length
		   return "Die Beiden Namen haben die gkleiche Länge";
	   }
	   
    }
     // To Compare numbers
    static String compareNumbers (int n1, int n2, int n3) {
    	
    	// returning the numbers
    	return " The selected numbers are (" + n1 + ", " + n2 + ", " + n3  +")";
          }
    
    	//To calculate the sum of the numbers
    	 static int summe(int n1,  int n2 , int n3) {
    		 
    		 return n1 + n2 + n3;
    	 } 
    	 
    	 // To calculate the average of the numbers
    	 static double durchschnitt (int n1, int n2 , int n3) {
    		return (n1 + n2 +  n3 )/3.0;
    	}
    	 
    	 // To calculate the product of the numbers
    	static int produkt (int n1 , int n2, int n3) {
    		return n1 * n2 * n3;
    	}
    	
    	// To return the biggest number 
    	static String groesste (int n1 , int n2 ,int n3) {
    		if (n1 >= n2 && n1 >= n3) {
    			return "Die größte Zahl: "  + n1;
    		}
    	    if (n2 >= n1 && n2 >= n3) {
    			return "Die größte Zahl: "  + n2;
    	    }
    	    if (n3 >= n1 && n3>= n2) {
    			return "Die größte Zahl: "  + n3;
    		}
    	    return null;
    	    }       
    	     
    
    }

    	
    
    	
      
    	  
      
       
	
	

	

		
	

	

