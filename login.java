	public static void main(String[] args) {

		Scanner scanner = new Scanner (System.in);
		System.out.println("What is your name?");
		String name = scanner.nextLine();
		System.out.println("What is your password?");
		int password = scanner.nextInt();
	
		switch(password) {
		case 1214:
			if (name.equals("Michael")){
			System.out.println( name + ", You have been granted access!");
			}
			else {
				 System.out.println(name + ", Access Denied, Wrong Username");
			}
			break;
		 default:
			 System.out.println(name + ", Access Denied, Wrong Password");
			
		}


}
}
