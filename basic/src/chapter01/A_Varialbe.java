package chapter01;

public class A_Varialbe {

	public static void main(String[] args) {
		
		// 변수 (Variable)
		// 데이터를 메모리에 저장하는데 사용되는 공간 요소
		// 변수를 생성(선언)할 때는 반드시 해당 변수가 가질 수 있는 데이터의 형태를 지정해야함
		
		// 선언(생성) 방법
		// 데이터타입 변수명;
		int number1;
		
		// 초기화(초기값을 넣는) 방법
		// 변수명 = 데이터;
		number1 = 22;
		
		// 선언과 동시에 초기화 방법
		// 데이터타입 변수명 = 데이터;
		int number2 = 30;
		
		System.out.println(number1);
		System.out.println(number2);
		
		// 변수는 선언 후 반드시 초기화한 다음 사용할 수 있음
		// int number3;
		// System.out.println(number3);
		
		// 변수에 지정된 타입의 데이터가 아니면 할당이 불가능
		// int number3 = 3.14;
		
		// 변수에 처음 데이터를 넣는 행위가 아니기 때문에 초기화가 아님
		// 할당 혹은 재할당(Convert_값을 변경하는 행위)
		number1 = 400; // 위에서 처음 값을 넣는 것은 초기화라 하고, 다시 아래 같은 변수에 할당 또는 재할당이라함.
		
		// 변수 사용 목적
		// 1. 데이터를 저장 목적
		// 2. 변할 수 있는 데이터에 대해서 '이름'을 부여하는 목적
		
		// 변수 명명 규칙
		// 1. 중복된 변수명을 사용할 수 없음
		int number4;
		// int number4;
		// 변수의 데이터타입이 다르더라도 같은 변수명을 사용할 수 없음
		// double number4;
		// 대소문자를 구분해서 사용가능
		int Number4;
		
		// 2. 연산자로 사용되는 특수문자는 포함할 수 없음
		// int number+;
		// int number_$;
		
		// 3. 변수명은 숫자로 시작할 수 없음
		// int 1number;
		
		// 4. 키워드로만 구성되어 있는 단어는 사용할 수 없음
		// int public;
		
		// 비문법상 규칙 (암묵적 룰)_개발자 간의
		// 1. 띄어쓰기 규칙 (띄어쓰기도 특수문자이기에)
		// String home address;
		// - Camel Case : 띄어쓰기를 표현할 때 띄어쓰기를 제거하고 바로 뒤 문자를 대문자로 표현하는 방식
		String homeAddress;
		// - Snake Case : 띄어쓰기를 표현할 때 띄어쓰기 자리에 _(특수문자로 사용할 수 있는)로 표현
		String home_address;
		
		// - Upper : 대문자를 표현
		// - Lower : 소문자를 표현
		   // 프로그래밍 언어 < - - > 스크립트 언어(lower_snake_case 를 쓰게 됨)
		// UpperCamelCase : 첫글자를 대문자로 시작하는 (Camel Case를 따르는데 첫글자도 대문자로 쓰는 방식0) - 클래스, 인터페이스가 이를 따름
		// lowerCamelCase : 첫글자를 소문자로 시작 - 변수, 함수, 메서드가 이를 따름(첫글자를 소문자로 시작)
		// UPPER_SNAKE_CASE : 모든 글자를 대문자로 작성 - 상수형 변수
		// lower_snake_case : 모든 글자를 소문자로 작성 - 변수, 함수, 메서드
		
		// 2. 약어 사용 금지
		// 단축어를 사용하지 않도록 약속
		// 자신만 알고 있는 약어를 사용하면 다른 개발자가 이해하기 어려움
		// 독일식 표기법 사용하여 변수명 작성을 권장
		int subtractYesterdaysDateTodaysResults = 0;
		
		
		// 상수 (Constant)
		// 초기화가 이루어지면 변경이 불가능한 변수 (= 재할당이 불가능하다)
		// 변수 선언 시에 데이터 타입 앞에 final 키워드를 붙여서 선언
		// final 데이터타입 변수명(상수명);
		final int NUMBER;
		NUMBER = 100;
		
		final double PI = 3.14;
		// 상수는 초기화 이후 재할당 불가능
		// PI = 3.1415;
		// NUMBER = 111;
		
		// 1. 리터럴에 이름을 부여하기 위해 많이 사용됨 (리터럴은 데이터 자체를 의미)
		
		// 리터럴으로만 표현을 한다면 해당하는 리터럴이 무엇인지 이해하기 어려움
		double result = 77.6 * 163;
		
		final double I_PHONE_16_PRO_MAX_WIDTH = 77.6;
		final double I_PHONE_16_PRO_MAX_HEIGHT = 163.0;
		double iPhone16ProMaxArea = 
				I_PHONE_16_PRO_MAX_WIDTH * I_PHONE_16_PRO_MAX_HEIGHT;
		
		// 2. 데이터를 보호하기 위한 목적(으로 final 을 붙이는)
		final int INPUT_NUMBER = 8; // 이렇게 사용자가 입력한 값이 바뀌면 안되는 경우가 종종 있는
		
		// 리터럴 상수: 데이터 그 자체 (코드 상에서 데이터 그 자체)
		// int age = 32; 이라는 구문에서 '32'가 리터럴에 해당   '상수' > 변경이 불가능하다.
		// 32 = 10;  >>  32가 담겨있는 것을 10으로 변경하는 행위는 없다.
		 
	}

}
