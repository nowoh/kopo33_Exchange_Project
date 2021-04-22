package hw0422_Thu_exchange_project;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Fileout {
	
	
//	BufferedReader fr;
//	
//	Fileout() throws FileNotFoundException {
//		fr = new BufferedReader(new FileReader("C:\\Users\\Howon\\Desktop\\howon\\CR.csv"));
//	}
	
	public void convertWrite(ExchangeType et) throws IOException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date = new Date();
		
		FileWriter fw = new FileWriter("C:\\Users\\Howon\\Desktop\\howon\\CR.csv", true);
		BufferedReader fr = new BufferedReader(new FileReader("C:\\Users\\Howon\\Desktop\\howon\\CR.csv"));
		
		String line;
		if ((line = fr.readLine()) == null) {
			String head = "날짜," + "환전화폐," + "환전할원화," + "환전결과," + "거스름돈";
			fw.write(head + "\n");
		}
		
		fw.write(sdf.format(date) + "," + et.exType + "," + et.won + "," + et.chResult + "," + et.chWon + "\n");
		fw.close();
	}
		
}
