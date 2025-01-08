package chapter01;

public class E_Controll_If {

	public static void main(String[] args) {
		
		// 코드 블럭
		// 코드들의 묶음 (여러 구문을 하나의 묶음(기능)으로 취급)
		// {}로 표시
		{
			int a = 10;
			int b = 20;
			int result = a + b;
			System.out.println(result); //변수는 중복된 이름을 가질 수 없다.
		
			// int a = 0;
		} // {}로 묶은 녀석들이 하나의 작업 단위라고 볼 수 있음_이런 용도로 코드블록을 씀_여러코드의 묶음_베이스(기본 전제조건)은 코드가 여러줄이 있어야 한다는 
		
		int a = 0; //{}안에서 쓰던 변수명을 {} 밖에서는 쓸 수 있는. 
		
		{
			// int a = 0;
			int b = 0; // {}안에 있는 값 a 전에 main 부분에 a 가 선언되었기에 {}안에 a는 main의 a를 쓸 수 있는.(따라서 {}안에 a쓰면 중복으로 인식)
		}
		
		// 제어문 : 조건에 따라서 코드의 흐름을 결정하는 것
		
		// 조건문 : 특정 조건이 만족하면 해당 코드 블럭을 실행하는 것
		
		// if문 : 주어진 논리표현식(조건)이 true이면 코드블럭을 실행하게 하는 것
		// if (논리표현식_논리값을 반환해주는) { 논리표현식이 true 일때 실행할 코드블럭 }
		
		System.out.println("if문 시작");
		
		int number = -10;
		
		if (number > 0) {
			System.out.println("양수");
		}
		
		System.out.println("if문 종료");
		
		// else문 : if문의 논리표현식이 false일때 코드블럭을 실행하게 하는 것
		// if (논리표현식) { true일 때 실행할 코드블럭 } 
		// else { false일 때 실행할 코드블럭 }
		
		// 주의!
		// 1. else문은 반드시 if문 이후에 와야함 (else문 단독 사용 불가능)
		// 2. else문에는 논리표현식을 작성하지 않음
		
		System.out.println("if-else문 실행");
		
		number = -5;
		
		if (number > 5) {
			System.out.println("양수");
		} else {
			System.out.println("양수가 아님");
		}
		
		System.out.println("if-else문 종료");
		
		
		System.out.println("여러 조건");
		
		number = 0;
		
		if (number > 0) {
			System.out.println("양수");
		} else if (number < 0) System.out.println("음수");
		  else System.out.println("0");
		
		System.out.println("여러 조건 종료");
		
		// 대한민국, 성인(> 19), 남성 - 현역
		String country = "대한민국";
		int age = 15;
		String gender = "남성";
		
//		if (country.equals("대한민국")) {
//			if (age > 19) {
//				if (gender.equals("남성")) {
//					System.out.println("현역");
//				}
//			}
//		}
//		
//		System.out.println("종료");
		
//		if (country.equals("대한민국") && age > 19 && gender.equals("남성")) {
//					System.out.println("현역"); // 논리연산자의 특성을 이용해서_dead code 같이 false이면 안 읽는 것처럼
//				}
		//boolean 은 변수명을 is나 has를 많이 씀
		boolean isActive = country.equals("대한민국") && age > 19 && gender.equals("남성");
		if (!isActive) return;
		System.out.println("현역");
		
		
		
	}

}
