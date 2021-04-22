package hw0422_Thu_exchange_project;

public class ProcessingClass {
	double exchangeResult;		//외화 환전 결과
	double changeWon;			//거스름돈 소수점 포함
	int changeWonResult;		//거스름돈 소수점 제외
	
	PrintClass PrintClass = new PrintClass();
	
	public int exchangeUSD(double won) {								//원화 -> 달러 변경
		int usd;  
		int usd100, usd50, usd20, usd10, usd5, usd2, usd1; 				//달러단위
		int usdCurrent;													//지폐로 교환 후 남은 달러 금액
		
		exchangeResult = won / CostValueClass.EX_RATE_USD;				//원화를 달러로 변환
		usd = (int)exchangeResult;
		usdCurrent = usd;
		changeWon = (won - (usd * CostValueClass.EX_RATE_USD)) /10; 
																		//변환 후 나머지 원화 (1원단위 버림처리)
		changeWonResult = (int)changeWon *10;	
		
		//달러 지폐별로 몇 개씩 나와야 하는가
		usd100 = usdCurrent /100;	//100달러 화폐 개수
		usdCurrent -= 100 * usd100;
		usd50 = usdCurrent/50;		//50달러 화폐 개수
		usdCurrent -= 50 * usd50;
		usd20 = usdCurrent/20;		//20달러 화폐 개수
		usdCurrent -= 20 * usd20;
		usd10 = usdCurrent/10;		//10달러 화폐 개수
		usdCurrent -= 10 * usd10;
		usd5 = usdCurrent/5;		//5달러 화폐 개수
		usdCurrent -= 5 * usd5;
		usd2 = usdCurrent/2;		//2달러 화폐 개수
		usdCurrent -= 2 * usd2;
		usd1 = usdCurrent/1;		//1달러 화폐 개수
		PrintClass.printUsd(usd, usd100, usd50, usd20, usd10, usd5, usd2, usd1);
		return usd;
	}
	
	
	
	public int exchangeEURO(double won) {								//원화 -> 유로 변경
		int euro; 
		int euro500, euro200, euro100, euro50, euro20, euro10, euro5;	//유로단위 
		int euroCurrent;												//지폐로 교환 후 남은 유로 금액
		
		exchangeResult = won / CostValueClass.EX_RATE_EURO;			//원화를 유로로 변환
		euro = (int)exchangeResult/5*5;									//최소 유로 지폐 단위는 5유로 (5유로 미만 버림)
		euroCurrent = euro;
		changeWon = (won - (euro * CostValueClass.EX_RATE_EURO)) /10;	
																		//변환 후 나머지 원화 (1원단위 버림처리)
		changeWonResult = (int)changeWon *10;
		
		//유로 지폐별로 몇 개씩 나와야 하는가
		euro500 = euroCurrent / 500;	//500유로 개수
		euroCurrent -= 500 * euro500;	
		euro200 = euroCurrent / 200;	//200유로 개수
		euroCurrent -= 200 * euro200;
		euro100 = euroCurrent / 100;	//100유로 개수
		euroCurrent -= 100 * euro100;
		euro50 = euroCurrent / 50;		//50유로 개수
		euroCurrent -= 50 * euro50;
		euro20 = euroCurrent / 20;		//20유로 개수
		euroCurrent -= 20 * euro20;
		euro10 = euroCurrent / 10;		//10유로 개수
		euroCurrent -= 10 * euro10;
		euro5 = euroCurrent / 5;		//5유로 개수
		
		PrintClass.printEuro(euro, euro500, euro200, euro100, euro50, euro20, euro10, euro5);
		return euro;
	}
	
	
	
	public int exchangeJPY(double won) {						//원화 -> 엔화 변경
		int jpy;
		int jpy10000, jpy5000, jpy2000, jpy1000;				//엔화 지폐 단위
		int jpyCurrent;											//지폐로 교환 후 남은 엔화 금액
		
		exchangeResult = won / CostValueClass.EX_RATE_JPY;		//원화를 엔화로 변환
		jpy = (int)exchangeResult/1000*1000;					//최소 엔화 지폐 단위는 1000엔 (1000엔 미만 버림)
		jpyCurrent = jpy;						
		changeWon = (won - (jpy * CostValueClass.EX_RATE_JPY)) /10;	
																//변환 후 나머지 원화 (1원단위 버림처리)
		changeWonResult = (int)changeWon *10;
		
		//엔화 지폐별로 몇 개씩 나와야 하는가
		jpy10000 = jpyCurrent / 10000;		//10000엔 개수
		jpyCurrent -= 10000 * jpy10000;
		jpy5000 = jpyCurrent / 5000;		//5000엔 개수
		jpyCurrent -= 5000 * jpy5000;
		jpy2000 = jpyCurrent / 2000;		//2000엔 개수
		jpyCurrent -= 2000 * jpy2000;
		jpy1000 = jpyCurrent / 1000;		//1000엔 개수
		
		PrintClass.printJpy(jpy, jpy10000, jpy5000, jpy2000, jpy1000);
		return jpy;
	}
	
	
	
	public int resultWon() { 									//원화 거스름돈 계산
		int won5000, won1000, won500, won100, won50, won10; 	//원화 단위
		int wonCurrent;											//지폐 및 동전으로 교환 후 남은 원화 금액
		
		//원화 통화별로 몇 개씩 나와야 하는가
		wonCurrent = changeWonResult;
		won5000 = wonCurrent/5000;		//5000원 개수
		wonCurrent -= 5000 * won5000;
		won1000 = wonCurrent/1000;		//1000원 개수
		wonCurrent -= 1000* won1000;		
		won500 = wonCurrent/500;		//500원 개수
		wonCurrent -= 500 * won500;		
		won100 = wonCurrent/100;		//100원 개수
		wonCurrent -= 100 * won100;		
		won50 = wonCurrent/50;			//50원 개수
		wonCurrent -= 50 * won50;	
		won10 = wonCurrent/10;			//10원 개수
		PrintClass.printWon(changeWonResult, won5000, won1000, won500, won100, won50, won10);
		return changeWonResult;
	}
}
