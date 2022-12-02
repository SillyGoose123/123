import java.util.Scanner;

public class checkinput {
	static Scanner scanner = new Scanner(System.in);
public static boolean Scaninput(int SoulutionLine) {
	String input = scanner.nextLine();
	String soulutionString = TXTLoader.TXTList.get(SoulutionLine);
	int SloutionNumb = Integer.parseInt(soulutionString.trim());
	boolean S = true;
	while(S  == true) {
		int number = Integer.parseInt(input.trim());
		if(number < 4) {
			if(number == SloutionNumb) {
				System.out.println("Richtig du erhälst einen Punkt");
				return true;
			} else {
				System.out.println("Falsch du erhälst keinen Punkt , Richtig wäre " + SloutionNumb);
				return false;
			}
			
		} else 
			System.out.println("Number hat einen anderen Wert als 1,2,3 gebe erneut eine zahl ein");
			input = scanner.nextLine();
			
	}
	return false;
}
	


public static boolean JaNein() {
	String input = scanner.nextLine();
	System.out.println("1 = Ja");
	System.out.println("2 = Nein");
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
