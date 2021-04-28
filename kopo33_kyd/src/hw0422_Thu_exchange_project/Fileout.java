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

	public void convertWrite(ExchangeType et) throws IOException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date = new Date();
		
		FileWriter fw = new FileWriter(CostValueClass.SAVE_ROUTE, true);
		BufferedReader fr = new BufferedReader(new FileReader(CostValueClass.SAVE_ROUTE));
		
		String line;
		if ((line = fr.readLine()) == null) {
			String head = "날짜," + "환전화폐," + "환전할원화," + "환전결과," + "거스름돈";
			fw.write(head + "\n");
		}
		
		fw.write(sdf.format(date) + "," + et.exType + "," + et.won + "," + et.chResult + "," + et.chWon + "\n");
		fw.close();
	}
		
}
