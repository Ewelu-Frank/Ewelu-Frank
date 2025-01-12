import java.util.Scanner;
public class Scooter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner scanner = new Scanner (System.in); // Calling Scanner
	System.out.println("Welcher Anbieter passt am besten zu ihnen?"); //Selection of available vendors and their Costs
	System.out.println("Anbieter 1: 1€ Unlockgebühr, 0.50€/500m");
	System.out.println("Anbieter 2: 0€ Unlockgebühr, 0.75€/500m");
	System.out.println("Anbieter 3: 5€ Unlockgebühr, 0.00€/500m");
	System.out.println("Anbieter 4: 1€ Unlockgebühr, 0.11€/100m");
	System.out.println("Anbieter 5: Komfortfunktion (kostengünstige Preis)"); //The algorithm to find the cheapest Cost.
	System.out.print("Ihre Wahl (1-5): "); //User selects the number according to the vendor of their choice
    
			
	int anbieter = scanner.nextInt(); // introducing the vendor variable for the switch function
	
	System.out.println("Distanz in Metern eingeben"); // Input in meters
	double metern = scanner.nextDouble();
	double km = (metern/1000); //Conversion of meters to km
	System.out.print(String.format("%.1f", km) + " Kilometer sollen gefahren werden."); //Use of format
	System.out.print(" Der Scooter wurde entriegelt. ");
	double price;
	
	
	//Input of the switch function
	switch (anbieter) {
	case 1 :
		price = ((0.50/500) * metern) + 1; // Calculating the costs, with the inclusion of the unlocking fee
		System.out.println(" Sie bezahlen " + String.format("%.2f", price) + "€.");
		System.out.println("Vielen Dank, dass Sie sich fuer Anbieter " + anbieter + " entschieden haben!");
		break;
	case 2 :
		price = (0.75/ 500) * metern;
		System.out.println(" Sie bezahlen " + String.format("%.2f", price) + "€.");
		System.out.println("Vielen Dank, dass Sie sich fuer Anbieter " + anbieter + " entschieden haben!");
		break;
	case 3 :
		price = ((0.00/500)* metern) + 5;
		System.out.println(" Sie bezahlen " + String.format("%.2f", price) + "€.");
		System.out.println("Vielen Dank, dass Sie sich fuer Anbieter " + anbieter + " entschieden haben!");
		break;
	case 4 :
		price = ((0.11/100) * metern) + 1;
		System.out.println(" Sie bezahlen " + String.format("%.2f", price) + "€.");
		System.out.println("Vielen Dank, dass Sie sich fuer Anbieter " + anbieter + " entschieden haben!");
		break;
	case 5:
		// Repeating the calculation of every vendor with a different variable
		double price1 = ((0.50/500) * metern) + 1;
		double price2 = (0.75/ 500) * metern;
		double price3 = ((0.00/500)* metern) + 5;
		double price4 = ((0.11/100) * metern) + 1;
		price = Math.min(Math.min(price1, price2), Math.min(price3, price4)); // Finding the minimum cost of every vendor

		//Comparing the calculated minimum cost that belongs  to the vendor
        if (price == price1) {
        
        	System.out.println("Anbieter 1 ist die kostengünstige");
        }
        else if (price == price2) {
        	System.out.println("Anbieter 2 ist die kostengünstige");
        }
        else if (price == price3) {
        	System.out.println("Anbieter 3 ist die kostengünstige");
        }
        else if (price == price4) {
        	System.out.println("Anbieter 4 ist die kostengünstige");
        }
        break;
        
        //default statement
	    default :
		System.out.print("Ungültige Auswahl");
		break;
		
	}
	
     //Closing scanner
	scanner.close();

	}

}
