package hw0422_Thu_exchange_project;

import java.util.Scanner;

public class InputFromConsoleClass {
	Scanner scan = null;
	InputFromConsoleClass() {				//생성자
		scan = new Scanner(System.in);
	}
	protected void fianlize() {				//소멸자
		scan.close();
	}
	
	public void inputWon(ExchangeType et) {
		System.out.print("받은 원화 입력 : ");
		et.won = scan.nextDouble();
	}
	public void inputType(ExchangeType et) {
		System.out.println("환전할 종류 선택(0 : Close, 1 : USD, 2 : EUR, 3 : JPY)?");
		et.type = scan.nextInt();
		
		if (et.type == CostValueClass.EX_TYPE_USD) {
			et.exType = "USD";
			
		} else if (et.type == CostValueClass.EX_TYPE_EURO) {
			et.exType = "EURO";
			
		} else if (et.type == CostValueClass.EX_TYPE_JPY) {
			et.exType = "JPY";
		}
	}
}	
