public class eins_zwei_oder_drei {
	public static int points = 0;
	
	public static void main(String[] args) {
    System.out.println("Hallo und Herzlich Wilkommen zu Eins, Zwei oder Drei.");
    Play();
	}
		public static void Play(){
			System.out.println("Waehle deinen Schwierigkeitsgrad");
			System.out.println("1 = Leicht");
			System.out.println("2 = Mittel");
			System.out.println("3 = Schwer");
			
			switch (checkinput.ScaninputForStart()) {
			case 1:
				System.out.println("Du Waehlst Leicht");
            Runner.Start("Difficulty1");
            break;
			case 2:
				System.out.println("Du Waehlst Mittel");	
				Runner.Start("Difficulty2");
				break;
			case 3:
				System.out.println("Du Waehlst Schwer");
				Runner.Start("Difficulty3");
				break;
		}
				
	}
		
		
	public static void nextgame(){
		System.out.println("--------------------------");
		System.out.println("Willst du erneut Spielen?");
		System.out.println("1 = Ja");
		System.out.println("2 = Nein");
		if(checkinput.JaNein() == true) {
			System.out.println("Es freut mich das ernuet spielen wollen");
			Play();
		} else {
			System.out.println("Ich hoffe du hattest spass auf Wiedersehen");
			System.exit(0);
		}
		
	}

}
