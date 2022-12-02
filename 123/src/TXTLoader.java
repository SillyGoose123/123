import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class TXTLoader {
	
public static ArrayList<String> TXTList = new ArrayList<>();

	public static void Load(String txt) throws IOException{
		FileReader fr = new FileReader("txt/"+ txt + ".txt");
		BufferedReader br = new BufferedReader(fr);
		String line = br.readLine();
		while(line != null) {
	        TXTList.add(line);
	        line = br.readLine();
		}
		br.close();
	}
} 
