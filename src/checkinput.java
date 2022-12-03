import java.util.Scanner;

public class checkinput {
	static Scanner scanner = new Scanner(System.in);
	private static int number;
	
public static boolean Scaninput(int SoulutionLine) {
	String input = scanner.nextLine();
	String soulutionString = TXTLoader.TXTList.get(SoulutionLine);
	int SloutionNumb = Integer.parseInt(soulutionString.trim());
	boolean S = true;
	while (true) {
		while(S) {
			try {
				number = Integer.parseInt(input.trim());
				S = false;
			} catch (java.lang.NumberFormatException e) {
				// TODO: handle exception
				System.out.println("Schreibe eine Zahl zischen 1 und 3.");
				input = scanner.nextLine();
			}
			
		}
		
	
			if(number < 4) {
				if(number == SloutionNumb) {
					System.out.println("Richtig du erhaelst einen Punkt");
					return true;
				} else {
					System.out.println("Falsch du erhaelst keinen Punkt , Richtig waere " + SloutionNumb);
					return false;
				}
				
			} else 
				System.out.println("Number hat einen anderen Wert als 1,2,3 gebe erneut eine zahl ein");
				input = scanner.nextLine();
				S = true;
	}
} 
	


public static boolean JaNein() {
	String input = scanner.nextLine();
	while (true) {
		int number = -1;
		try {
			number = Integer.parseInt(input.trim());
		} catch (Exception e) {
			// ignore
		}
		switch (number) {
		case 1:
			return true;
		case 2:
			return false;
		default:
			System.out.println("Number hat einen anderen Wert als 1 oder 2 gebe erneut eine zahl ein");
			input = scanner.nextLine();
		}
	}
}



public static int ScaninputForStart() {
		String input = scanner.nextLine();
		while (true) {
			int number = -1;
			try {
				number = Integer.parseInt(input.trim());
			} catch (Exception e) {
				// ignore
			}
			switch (number) {
			case 1:
				return 1;
			case 2:
				return 2;
			case 3:
				return 3;
			default:
				System.out.println("Number hat einen anderen Wert als 1, 2 oder 3 gebe erneut eine zahl ein");
				input = scanner.nextLine();
		}
}

}
}
