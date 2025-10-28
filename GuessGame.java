public class GuessGame {
	Player p1;
	Player p2;
	Player p3;
	
	public void startGame() {
		p1 = new Player();
		p2 = new Player();
		p3 = new Player();
		
		int guessp1 = 0;
		int guessp2 = 0;
		int guessp3 = 0;
		
		boolean p1IsRight = false;
		boolean p2IsRight = false;
		boolean p3IsRight = false;
		
		
		
		while(true) {
			int finalGuess = (int) (Math.random() * 10);
			System.out.println("Die zu erratende Zahl ist: " + finalGuess);
			
			p1.guess();
			p2.guess();
			p3.guess();
			
			guessp1 = p1.number;
			System.out.println("Player 1 hat geraten: " + guessp1);
			guessp2 = p2.number;
			System.out.println("Player 2 hat geraten: " + guessp2);
			guessp3 = p3.number;
			System.out.println("Player 3 hat geraten: " + guessp3);
			
			if (guessp1 == finalGuess) {
				p1IsRight = true;
			}
			if (guessp2 == finalGuess) {
				p2IsRight = true;
			}
			if (guessp3 == finalGuess) {
				p3IsRight = true;
			}
			
			if (p1IsRight || p2IsRight || p3IsRight) {
				System.out.println("Wir haben einen gewinner!");
				System.out.println("Player 1 hat es richtig? " + p1IsRight);
				System.out.println("Player 2 hat es richtig? " + p2IsRight);
				System.out.println("Player 3 hat es richtig? " + p3IsRight);
				System.out.println("Das Spiel ist nun zuende.");
				break;
			} else {
				System.out.println("Die Spieler müssen nochmal raten.");
			}
		}
	}
}