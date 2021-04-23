package hw0422_Thu_exchange_project;

import java.io.IOException;

public class final_process {
	static ExchangeType et;
	
	public static void fm() throws IOException {
		et = new ExchangeType();
		ProcessingClass pc = new ProcessingClass();
		InputFromConsoleClass inputConsole = new InputFromConsoleClass();
		Fileout fo = new Fileout();
		
		
		do {
			inputConsole.inputWon(et);
			inputConsole.inputType(et);
			
			if (et.type == CostValueClass.EX_TYPE_USD) {
				et.chResult = pc.exchangeUSD(et.won);
				et.chWon = pc.resultWon();
				
			} else if (et.type == CostValueClass.EX_TYPE_EURO) {
				et.chResult = pc.exchangeEURO(et.won);
				et.chWon = pc.resultWon();
				
			} else if (et.type == CostValueClass.EX_TYPE_JPY) {
				et.chResult = pc.exchangeJPY(et.won);
				et.chWon = pc.resultWon();
				
			} else if (et.type == CostValueClass.EX_TYPE_EXIT) {
				break;
				
			} else {
				System.out.println("ERROR. Please choose right type.");
			}
			fo.convertWrite(et);
			
		} while (et.type != CostValueClass.EX_TYPE_EXIT);
	}
}
