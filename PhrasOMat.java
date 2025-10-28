public class PhrasOMat {
	public static void main(String[] args) {
	
		//Drei Wortgruppen erstellen, aus denen ausgewählt wird
		String[] wortListeEins = {"verlässliche", "webbasierte", "erfolgsorientierte", "zielgerichtete", "übersichtliche"};
		
		String[] wortListeZwei = {"gepowerte", "haftende", "Mehrwert-", "zentrierte", "geclusterte", "proaktive", "Out-of-the-box"};
		
		String[] wortListeDrei = {"Schicht", "Endstufe", "Lösung", "Architektur", "Kernkompetenz", "Strategie", "Kooperation", "Ausrichtung", "Räumlichkeit"};
		
		//ermitteln, wie viele Wörter in der Liste sind
		int einsMenge = wortListeEins.length;
		int zweiMenge = wortListeZwei.length;
		int dreiMenge = wortListeDrei.length;
		
		//Drei Zufallszahlen generieren, um Wörter aus den Listen herauszuziehen
		int rand1 = (int) (Math.random() * einsMenge);
		int rand2 = (int) (Math.random() * zweiMenge);
		int rand3 = (int) (Math.random() * dreiMenge);
		
		//eine Phrase zusammenbauen
		String phrase = wortListeEins[rand1] + " " + wortListeZwei[rand2] + " " + wortListeDrei[rand3];
		
		//eine Phrase ausgeben
		System.out.println("Was wir brauchen, ist eine " + phrase);
	}
}