class PoolPuzzleEins {
	public static void main(String[] args) {
		int x = 0;
		
		while (x < 5) {
			System.out.print("da");
			if (x < 1) {
				System.out.print(" ");
			}
			x = x + 1; //1. x = 1
			if (x > 1) {
				System.out.print("s");
				x = x + 2; //2. x = 4
			}
			if (x == 1) {
				System.out.print("sagt");
			}
			if (x > 3 && x < 5) {
				System.out.print("itzend");
			}
			if (x > 5) {
				System.out.print(" kind");
			}
			System.out.println("");
		}
	}
}