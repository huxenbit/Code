class MovieTD {
	
	public static void main(String[] args) {
		Movie one = new Movie();
		one.title = "Interterrar";
		one.genre = "Sci-Fi/Fantasy";
		one.rating = 8;
		Movie two = new Movie();
		two.title = "Becoming Good";
		two.genre = "Western";
		two.rating = 5;
		two.playIt();
		Movie three = new Movie();
		three.title = "Peasant of Squares";
		three.genre = "Comedy";
		three.rating = 10;
	}
}