import java.io.IOException;

public class Runner {

	public static void Start(String diff){
		try {
			TXTLoader.Load(diff);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int Quest = 0; 
		for(int i = 10; i > 0; i--){
			printQuest(Quest);
			Quest += 6;
			if(checkinput.Scaninput(Quest) == true) {
				eins_zwei_oder_drei.points++;
			}
			Quest += 1;
		}
		
		eins_zwei_oder_drei eins_zwei_oder_drei = new eins_zwei_oder_drei();
		eins_zwei_oder_drei.nextgame();
	}
		
	private static void printQuest(int Questnumb){
		for(int i = 0; i < 6; i++) {
			System.out.println(TXTLoader.TXTList.get(Questnumb));	
			Questnumb++;
			}
	}


}
