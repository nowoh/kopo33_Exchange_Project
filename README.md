 # Exchange_Project
 - ## Writer : 이호원 (kopo33)
 - ## Start date : 2021년 4월 22일
---
 - ### main_kyd_MoneyConverter.java
`final_process class를 실행시켜주는 main class`
 - ### final_process.java
`ExchangeType, ProcessingClass, InputFromConsoleClass, Fileout 클래스를 불러와서 최종적으로 모든 과정을 처리해주고 파일을 생성 또는 덧붙여 쓰는 클래스`

 - ### InputFromConsoleClass.java

	scanner로 환전할 원화 금액과 환전할 외화 종류를 입력받을 수 있게하는 클래스

 - ### ProcessingClass.java

	입력받은 원화 금액과 외화 종류로 환전 처리를 해죽 PrintClass로 출력까지 해주도록 하는 클래스

 - ### PrintClass.java

	PrrocessingClass에서 인자를 받아 print 각종 외화와 원화 거스름돈을 출력하는 클래스

 - ### Fileout.java

	ExchangeType에서 정의된 인자들을 csv파일에 쓰는 클래스
	(파일이 없으면 head로 정의된 부분을 먼저 쓰고 그 후에 나머지를 쓰도록 함)

 - ## CostValueClass.java

	고정적으로 설정해두어서 다른 클래스에서 계속 정의하거나 수정을 못하도록 하는 클래스

 - ### ExchangeType.java

	클래스에 인자들을 저장해서 다른 여러 클래스에서 연결되어 값을 저장할 수 있도록 하는 클래스
