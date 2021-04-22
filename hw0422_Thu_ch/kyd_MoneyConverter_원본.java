package hw0422_Thu_ch;

import java.util.Scanner;

public class kyd_MoneyConverter_원본 {	//변경전
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double won;
		double exchangeResult; //외화결과
		double EX_RATE = 1127.6; //환율
		int usd; //달러
	    double changeWon; //거스름돈 소수점 포함
		int changeWonResult = 0; //거스름돈 소수점 제외
		int usd100, usd50, usd20, usd10, usd5, usd2, usd1; //달러단위
		int usdCurrent; //
		int won5000, won1000, won500, won100, won50, won10; //원화 단위
		int wonCurrent;
		int type; //외화 선택
		int euro; 
		int euro500, euro200, euro100, euro50, euro20, euro10, euro5; //유로단위 
		int euroCurrent;
		int jpy;
		int jpy10000, jpy5000, jpy2000, jpy1000, jpy500, jpy100, jpy50, jpy10, jpy5, jpy1;
		int jpyCurrent;
		double EX_RATE_EURO = 1327.65;
		double EX_RATE_JPY = 10.20;
		
		
		
		System.out.print("받은 원화 입력 : ");
		won = scan.nextDouble();
		System.out.println("환전할 종류 선택(1 : USD, 2 : EUR, 3 : JPY)?");
		type = scan.nextInt();
		
		if (type == 1) {
			exchangeResult = won / EX_RATE;
			usd = (int)exchangeResult;
			usdCurrent = usd;
			changeWon = (won - (usd * EX_RATE)) / 10;
			changeWonResult = (int)changeWon * 10;
			System.out.println("달러로 환전 결과");
			System.out.println("달러 지급 : " + usd +" 달러");
			//달러별로 몇개씩 나와야하는가
			usd100 = usdCurrent /100;
			usdCurrent -= 100 * usd100;
			System.out.print("100달러 : " + usd100 +"장\t");
			usd50 = usdCurrent/50;
			usdCurrent -= 50 * usd50;
			System.out.print("50달러 : " + usd50 +"장\t");
			usd20 = usdCurrent/20;
			usdCurrent -= 20 * usd20;
			System.out.println("20달러 : " + usd20 +"장");
			usd10 = usdCurrent/10;
			usdCurrent -= 10 * usd10;
			System.out.print("10달러 : " + usd10 +"장\t");
			usd5 = usdCurrent/5;
			usdCurrent -= 5 * usd5;
			System.out.print("5달러 : " + usd5 +"장\t");
			usd2 = usdCurrent/2;
			usdCurrent -= 2 * usd2;
			System.out.print("2달러 : " + usd2 +"장\t");
			usd1 = usdCurrent/1;
			usdCurrent -= 1 * usd1;
			System.out.println("1달러 : " + usd1 +"장");
			
			
			
			
			
		} else if (type == 2) {
			exchangeResult = won / EX_RATE_EURO;
			euro = (int)exchangeResult/5*5;		//최소 유로 지폐 단위는 5유로
			euroCurrent = euro;
			changeWon = (won - (euro * EX_RATE_EURO)) / 10;
			changeWonResult = (int)changeWon * 10;
			System.out.println("유로로 환전 결과");
			System.out.println("유로 지급 : " + euro +" 유로");
			//유로화폐로 몇개씩 나와야하는가
			euro500 = euroCurrent / 500;
			euroCurrent -= 500 * euro500;
			System.out.print("500유로 : " + euro500 + "장\t");
			euro200 = euroCurrent / 200;
			euroCurrent -= 200 * euro200;
			System.out.print("200유로 : " + euro200 + "장\t");
			euro100 = euroCurrent / 100;
			euroCurrent -= 100 * euro100;
			System.out.println("100유로 : " + euro100 + "장");
			euro50 = euroCurrent / 50;
			euroCurrent -= 50 * euro50;
			System.out.print("50유로 : " + euro50 + "장\t");
			euro20 = euroCurrent / 20;
			euroCurrent -= 20 * euro20;
			System.out.print("20유로 : " + euro20 + "장\t");
			euro10 = euroCurrent / 10;
			euroCurrent -= 10 * euro10;
			System.out.print("10유로 : " + euro10 + "장\t");
			euro5 = euroCurrent / 5;
			euroCurrent -= 5 * euro5;
			System.out.println("5유로 : " + euro5 + "장");
			
		} else if (type == 3) {
			exchangeResult = won / EX_RATE_JPY;
			jpy = (int)exchangeResult/1000*1000;	//최소 엔화 지폐 단위는 1000엔
			jpyCurrent = jpy;
			changeWon = (won - (jpy * EX_RATE_JPY)) / 10;
			changeWonResult = (int)changeWon * 10;
			System.out.println("엔화로 환전 결과");
			System.out.println("엔화 지급 : " + jpy +" 엔");
			//엔화화폐로 몇개씩 나와야하는가
			jpy10000 = jpyCurrent / 10000;
			jpyCurrent -= 10000 * jpy10000;
			System.out.print("10000엔 : " + jpy10000 + "장\t");
			jpy5000 = jpyCurrent / 5000;
			jpyCurrent -= 5000 * jpy5000;
			System.out.print("5000엔 : " + jpy5000 + "장\t");
			jpy2000 = jpyCurrent / 2000;
			jpyCurrent -= 2000 * jpy2000;
			System.out.print("2000엔 : " + jpy2000 + "장\n");
			jpy1000 = jpyCurrent / 1000;
			jpyCurrent -= 1000 * jpy1000;
			System.out.print("1000엔 : " + jpy1000 + "장\n");
//			jpy500 = jpyCurrent / 500;
//			jpyCurrent -= 500 * jpy500;
//			System.out.print("500엔 : " + jpy500 + "개\t");
//			jpy100 = jpyCurrent / 100;
//			jpyCurrent -= 100 * jpy100;
//			System.out.print("100엔 : " + jpy100 + "개\n");
//			jpy50 = jpyCurrent / 50;
//			jpyCurrent -= 50 * jpy50;
//			System.out.print("50엔 : " + jpy50 + "개\t");
//			jpy10 = jpyCurrent / 10;
//			jpyCurrent -= 10 * jpy10;
//			System.out.print("10엔 : " + jpy10 + "개\t");
//			jpy5 = jpyCurrent / 5;
//			jpyCurrent -= 5 * jpy5;
//			System.out.print("5엔 : " + jpy5 + "개\n");
//			jpy1 = jpyCurrent / 1;
//			jpyCurrent -= 1 * jpy1;
//			System.out.print("1엔 : " + jpy1 + "개\n");
		
			
		} else {
			System.out.println("ERROR. Please choose right type.");
		}	
		//원화 거스름돈 계산
		System.out.println("원화 거스름돈 지급 : " +changeWonResult+"원");
		wonCurrent = changeWonResult;
		won5000 = wonCurrent/5000;
		wonCurrent -= 5000 * won5000;
		System.out.print("5000원 : " + won5000 + "장\t");
		won1000 = wonCurrent/1000;
		wonCurrent -= 1000* won1000;
		System.out.print("1000원 : " + won1000 +"장\t");
		won500 = wonCurrent/500;
		wonCurrent -= 500 * won500;
		System.out.print("500원 : " + won500 +"장\t");
		won100 = wonCurrent/100;
		wonCurrent -= 100 * won100;
		System.out.println("100원 : " + won100 +"개\t");
		won50 = wonCurrent/50;
		wonCurrent -= 50 * won50;
		System.out.print("50원 : " + won50 +"개\t");
		won10 = wonCurrent/10;
		wonCurrent -= 10 * won10;
		System.out.println("10원 : " + won10 +"개\t");
		scan.close();
	}
}