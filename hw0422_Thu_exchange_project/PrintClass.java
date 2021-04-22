package hw0422_Thu_exchange_project;

public class PrintClass {
	
	public void printUsd(int usd, int usd100, int usd50, 
			int usd20, int usd10, int usd5,
			int usd2, int usd1) {
		System.out.println("달러로 환전 결과");
		System.out.println("달러 지급 : " + usd +" 달러");
		System.out.print("100달러 : " + usd100 +"장\t");
		System.out.print("50달러 : " + usd50 +"장\t");
		System.out.println("20달러 : " + usd20 +"장");
		System.out.print("10달러 : " + usd10 +"장\t");
		System.out.print("5달러 : " + usd5 +"장\t");
		System.out.print("2달러 : " + usd2 +"장\t");
		System.out.println("1달러 : " + usd1 +"장\n");
		
	}
	
	public void printEuro(int euro, int euro500, int euro200, 
			int euro100, int euro50, int euro20, 
			int euro10, int euro5) {
		System.out.println("유로로 환전 결과");
		System.out.println("유로 지급 : " + euro +" 유로");
		System.out.print("500유로 : " + euro500 + "장\t");
		System.out.print("200유로 : " + euro200 + "장\t");
		System.out.println("100유로 : " + euro100 + "장");
		System.out.print("50유로 : " + euro50 + "장\t");
		System.out.print("20유로 : " + euro20 + "장\t");
		System.out.print("10유로 : " + euro10 + "장\t");
		System.out.println("5유로 : " + euro5 + "장\n");
		
	}
	
	public void printJpy(int jpy, int jpy10000, int jpy5000, 
			int jpy2000, int jpy1000) {
		System.out.println("엔화로 환전 결과");
		System.out.println("엔화 지급 : " + jpy +" 엔");
		System.out.print("10000엔 : " + jpy10000 + "장\t");
		System.out.print("5000엔 : " + jpy5000 + "장\t");
		System.out.print("2000엔 : " + jpy2000 + "장\n");
		System.out.print("1000엔 : " + jpy1000 + "장\n");
	}
	
	public void printWon(int changeWonResult, int won5000, 
			int won1000, int won500, int won100, 
			int won50, int won10) {
		System.out.println("원화 거스름돈 지급 : " +changeWonResult+"원");
		System.out.print("5000원 : " + won5000 + "장\t");
		System.out.print("1000원 : " + won1000 +"장\t");
		System.out.print("500원 : " + won500 +"장\t");
		System.out.println("100원 : " + won100 +"개\t");
		System.out.print("50원 : " + won50 +"개\t");
		System.out.println("10원 : " + won10 +"개\n");
	}
}
