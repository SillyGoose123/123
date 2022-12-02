import java.io.IOException;

public class Diff1 {

	public static void Start(){
		try {
			TXTLoader.Load("Difficulty1");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int Quest = 0; 
		for(int i = 10; i > 0; i--){
			printQuest(Quest);
			Quest =+5;
			if(checkinput.Scaninput(Quest) == true) {
				eins_zwei_oder_drei.points++;
			}
			Quest = +1;
		}
		
	
	}
	private static void printQuest(int Questnumb){
		for(int i = 0; i < 5; i++) {
			System.out.println(TXTLoader.TXTList.get(Questnumb));	
			Questnumb++;
			}
	}


}
