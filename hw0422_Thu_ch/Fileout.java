package hw0422_Thu_ch;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Fileout {
	private FileWriter fw;
	boolean isFileExist;
	
	public Fileout() {
		try {
			File file = new File("C:\\Users\\Howon\\Desktop\\howon\\CR.csv");
			if(file.exists() == false) {
				isFileExist = false;
			} else {
				isFileExist = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void fileClose() throws IOException {
		fw.close();
	}
	
	public void headWrite() throws IOException {
		if (isFileExist == false) {
			fw = new FileWriter("C:\\Users\\Howon\\Desktop\\howon\\CR.csv");
			String head = "날짜," + "환전화폐," + "환전할원화," + "환전결과," + "거스름돈";
			fw.write(head + "\n");
		}
	}
	
	public void convertWrite() throws IOException {
		//fw = new FileWriter("C:\\Users\\Howon\\Desktop\\howon\\CR.csv", true);
		String inputData = CostValueClass.data.toString() + "\n";
		fw.write(inputData);
		CostValueClass.data.setLength(0);
		
	}
		
}
