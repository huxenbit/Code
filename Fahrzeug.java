public class Fahrzeug {
	protected String marke;
	protected int ps;
	
	public static void main(String[] args) {
		Auto auto = new Auto("Fiat", 100);
		auto.fahren();
	}
	 public Fahrzeug(String marke, int ps) {
		this.marke = marke;
		this.ps = ps;
	 }
	 
	 public void fahren() {
		System.out.println(marke + " fährt los! Es hat " + ps + " PS!");
	 }

}