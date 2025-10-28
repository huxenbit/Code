class Auto extends Fahrzeug {
	private int ps;

	public static void main(String[] args) {
		//
	}
	
	public Auto(String marke, int ps) {
		super(marke, ps); //entspricht Fahrzeug(marke, ps);
		this.ps = ps;
	}
}