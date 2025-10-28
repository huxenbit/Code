class DogTestDrive {
	public static void main (String[] args) {
		Dog d = new Dog();  					//Erstelle neues Dog-Objekt mit dem Namen "d"
		DogTestDrive dT = new DogTestDrive(); 	//Erstelle ein TestDrive-Objekt mit dem namen "dT"
		d.size = 40;  							//setze size von d auf 40
		d.breed = "Chihuahua";  				//setze breed von d auf "Chihuahua"
		d.name = "Enzo";  						//setze name von d auf "Enzo"
		d.bark();  								//führe die Methode bark() von "d" aus
		String info =  dT.hinweis(d); 			//erstelle einen String mit dem Wiedergabewert aus hinweis(d)
		System.out.println(info);  				//printe den String
	}
	
	public String hinweis(Dog d) {
		return "Der Hund ist ein " + d.breed + " und heißt " + d.name + 
		"! Außerdem ist er " + d.size + "cm groß!";
	}
}