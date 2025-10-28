public class ifTest {
	public static void main(String[] args) {
		int x = 2;
		String y = "81";
		int yInt = Integer.parseInt(y);
		
		if (x == 3) {
			System.out.println("Die Zahl ist " + x);
		} else {
			System.out.println("Die Zahl ist NICHT 3.");
		}
		
		System.out.print("Aber y ist " + yInt + "!");
	}
}