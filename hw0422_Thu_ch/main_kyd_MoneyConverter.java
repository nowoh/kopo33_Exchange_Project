package hw0422_Thu_ch;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class main_kyd_MoneyConverter {


	public static void main(String[] args) throws IOException {	//static main method�� �� class�� �ҼӵǾ� ���� ����
		Scanner scan = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date = new Date();
		int type; 		//��ȭ ����
		double won;

		ProcessingClass pc = new ProcessingClass();
		InputFromConsoleClass inputConsole = new InputFromConsoleClass();
		Fileout fo = new Fileout();
		ExchangeType extype;
		
		fo.headWrite();
		
		do {
			extype = new ExchangeType();
			won = inputConsole.inputWon();
			type = inputConsole.inputType();
			
			CostValueClass.data.append(sdf.format(date) + ",");
			
			if (type == CostValueClass.EX_TYPE_USD) {
				CostValueClass.data.append("USD," + won + ",");
				pc.exchangeUSD(won);
				pc.resultWon();
				fo.convertWrite();
			} else if (type == CostValueClass.EX_TYPE_EURO) {
				CostValueClass.data.append("EURO," + won + ",");
				pc.exchangeEURO(won);
				pc.resultWon();
				fo.convertWrite();
			} else if (type == CostValueClass.EX_TYPE_JPY) {
				CostValueClass.data.append("JPY," + won + ",");
				pc.exchangeJPY(won);
				pc.resultWon();
				fo.convertWrite();
			} else if (type == CostValueClass.EX_TYPE_EXIT) {
			} else {
				System.out.println("ERROR. Please choose right type.");
			}
			
		} while (type != CostValueClass.EX_TYPE_EXIT);
		scan.close();
		fo.fileClose();
	}
}