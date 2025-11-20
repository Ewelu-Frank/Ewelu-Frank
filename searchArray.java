public static void main(String[] args) {
		String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
		Scanner scanner = new Scanner(System.in);
		System.out.println("Choose a Name ");
		String carName = scanner.nextLine();
		boolean isCarFound = false; // with default
		
		for (int i = 0; i < cars.length; i++) {
			if (cars[i].equals(carName)) {
				isCarFound = true;
				break; // end loop , once found
			
			} 
		}
			if(isCarFound) {
			System.out.println("Car Found: "+ carName); // rewards search
			}
			else {
				System.out.println("Car not Found"); // returns a negative result
			}
			}
		}
		
