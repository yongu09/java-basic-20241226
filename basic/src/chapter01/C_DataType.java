package chapter01;

public class C_DataType {

	public static void main(String[] args) {
		
		// 변수의 데이터 타입
		// 기본형 데이터 타입과 참조형 데이터 타입
		
		// 기본형 데이터 타입
		
		// 정수형 데이터 타입 : 실수부가 존재하지 않음, 부호를 가지고 있음
		
		// byte: 1byte(8bit)의 크기를 가지는 정수형 데이터 타입
		// -128 ~ 127
		byte byte1 = 100;
		// byte byte2 = 128; (이렇게 하면 int 값이 리터럴로 지정된다)
		
		// short: 2byte(16bit)의 크기를 가지는 정수형 데이터 타입
		// -32,768 ~ +32,767 (위 아래로 32000쯤 된다)
		short short1 = 128;
		// short short2 = 40000;
		
		// int: 4byte(32bit)의 크기를 가지는 정수형 데이터 타입
		// -2,147,483,648 ~ +2,147,483,647 (위 아래로 21억쯤 된다)
		int int1 = 40000;
		// int int2 = 2_200_000_000L;  //천 단위로 ,찍질 못하니 _로 구분지을 수 있다.
		
		// long: 8byte(64bit)의 크기를 가지는 정수형 데이터 타입
		long long1 = 2_200_000_000L;
		
		
		// 실수형 데이터 타입 : 실수부를 가지는 데이터 타입
		
		// float: 4byte(32bit)의 크기를 가지는 실수형 데이터 타입
		// 소수점 아래 6-7자리에서 오차가 발생
		float float1 = 0.123456789F; /*(저장될 위치는 double 로 저장된다는 것을 에러표시를 통해 알 수 있음0)*/
		System.out.println(float1); //하면 결과가 다 나오지 않고 0.12345679로 소수점 아래 8자리까지 표시되면서 올림으로 처리된 것 확인가능
		
		// double: 8byte(64bit)의 크기를 가지는 실수형 데이터 타입
		// 소수점 15-17자리에서 오차가 발생
		double double1 = 0.123456789;
		System.out.println(double1);
		
		
		// 문자형 데이터 타입 : 문자 하나를 저장할 수 있는 데이터 타입
		
		// char: 2byte(16bit)의 크기를 가지는 문자형 데이터 타입
		// 0 ~ 65,535 (ASCII 코드에 대한 숫자 범위임)
		// 문자를 리터럴로 표현할 땐 ''로 묶어서 표현
		char char1 = 'A';
		char char2 = 65; //ASCII 코드에 의해서 A가 나타나는
		char char3 = '\u0041'; // 유니코드에 의해서 A가 나타나는
		System.out.println(char1);
		System.out.println(char2);
		System.out.println(char3);
		
		// 논리형 데이터 타입 : 참과 거짓 값을 가지는 데이터 타입
		
		// boolean: 1byte(8bit)의 크기를 가지는 논리형 데이터 타입  1bit만 있어도 되지만 데이터 단위가 1byte가 가장 낮은것이기에.
		// true, false
		boolean boolean1 = true;
		boolean boolean2 = false;
		
		// 형변환 : 데이터 타입이 서로 다른 변수를 옮겨 담는 것
		
		// 자동 형변환: 작은 데이터 타입의 변수를 큰 데이터 타입의 변수에 옮겨 담을 때 발생
		// 강제 형변환: 큰 데이터 타입의 변수를 작은 데이터 타입의 변수에 옮겨 담을 때 발생(이 경우에는 타입이 다른 것도 포함됨)
		
		int number1 = 300;
		long number2 = number1;
		number1 = (int)number2;
		
		byte number3 = (byte)number2;  //데이터 손실이 일어나는 (강제 형변환 시)
		System.out.println(number3);
		
		double number4 = 3.1415;
		number1 = (int) number4;
		System.out.println(number1);
		
		number4 = number3;
		System.out.println(number4);

		
		// 배열 : '동일한 타입'의 변수를 묶어서 저장하는 컨테이너
		// new 연산자를 이용해서 컨테이너를 먼저 생성해야함
		// 한번 생성된 컨테이너의 크기는 변경할 수 없음
		
		// 배열 변수 선언 방법
		// 데이터타입[] 배열변수명;
		// 배열 생성
		// new 데이터타입[배열의길이 지정];
		int[] numbers; // int를 여러개 가지는 컨테이너의 주소를 만든 (변수 선언)
		numbers = new int[3]; // int 3개를 담을 수 있는 배열을 생성 //(=하면서 numbers 에 3개의 int값이 담겨있는 컨테이너의 주소가 들어가는
		System.out.println(numbers);
		
		int[] numbers2 = {1, 2, 3};  // 선언과 동시에 값을 넣은
		int[] numbers3 = new int[] {1, 2, 3}; // 길이를 지정하지 않고 값을 넣은
		System.out.println(numbers2);
		System.out.println(numbers3);
		
		// 배열의 요소에 접근 혹은 사용할 때는 '인덱스'라는 것을 사용
		// 배열의 시작 인덱스는 0, 마지막(종료) 인덱스는 길이 - 1
		int number = numbers3[1];
		System.out.println(number);
		numbers3[1] = 22;
		System.out.println(number); // numbers3[1]에 22를 넣었으나 출력되는 number에는 그 위에 2가 그대로 출력(2만 넣어져있으니)
		
		// 배열의 길이를 초과하는 인덱스에 접근할 시, 예외가 발생(문법성은 맞는데 예상치 못한 경우가 발생했다는 것)
		// System.out.println(numbers3[99]); //이러면 문법상으론 맞으나 numbers3라는 컨테이너에 99번째 값을 찾아와야겠다 하고 했는데 없어?!
		
		// 배열의 길이를 확인하고자 할 땐 .length
		System.out.println(numbers3.length);
		
		int lastIndex = numbers3.length - 1;
		System.out.println(numbers3[lastIndex]); // numbers3[numbers3.length - 1] 이렇게 하면 마지막 인덱스의 값을 알 수 있다.
		
		//참조형 데이터 타입에서의 new 연산자가 중요.
		int[] example1 = new int[] {0, 0, 0}; // example1에는 주소가 들어가있어
		int[] example2 = example1; // example2에도 이 경우 1의 주소가 들어가게 됨..
		
		System.out.println(example1);
		System.out.println(example2);
		
		example1[0] = 99; // 0번 인덱스 값을 99로 바꿈
		System.out.println(example1[0]); // example1 그 값은 그대로이고(직접 변경하는 작업한게 없으니) 그 안에 있는 값 중 인덱스0번 값이 바뀐것임
		System.out.println(example2[0]); // 하지만 example2에 들어가 있는 값은 바뀌지 않음. (위치값으로 나오는 값_1과 같은 주소,컨테이너를 공유하고있는)
		
		System.out.println(example1);
		
		char[] chars = {'e','x','a','m'};
		System.out.println(chars);
		
		// String : 문자의 배열(문자열)을 표현하는데 사용되는 '참조형 데이터 타입'
		// 선언
		// String 변수명;
		// 생성이라는 작업을 먼저 수행해줘야 함 ( new 사용해서 아래 예시처럼 )
		// new String();
		// 초기화 작업
		// 변수명 = "문자열";
		String string1; //이건 선언
		string1 = "맑음"; //이건 초기화
		String string2 = "오후"; // 선언과 동시에 초기화해도 됨
		
		String string3 = "exam"; //불변성을 가지기에 새로운 값으로 변경하고 싶으면 새로운 String을 만들어서 값을 넣어야 함.
		System.out.println(chars);
		System.out.println(string3);
		chars[0] = 'd';
		// string3[0] = 'd';
		string3 = "dxam";
		
		
		// String 클래스의 주요 기능
		String statement = "  My Name Is Loki  ";
		
		// 1. 문자열 결합
		// + 라는 연산자 혹은 concat(문자열) 이라는 메서드를 통해서 괄호안에 어떤 문자열을 합칠지를 지정. >> 두 문자열을 연결할 수 있음
		System.out.println(statement + "@@@@");
		System.out.println(statement.concat("!!!!"));
		
		// 2. 문자열 비교
		// equals(문자열) : 괄호 안에 비교할 문자열을 넣어줌. 두 문자열이 동등한지 비교
		// compareTo(문자열) : 두 문자열을 사전순으로 비교 (대소문자 구분함)
		// compareToIgnoreCase() : 두 ㅁ누자열을 사전순으로 비교 (대소문자 구분 X) >> 비교하겠다, 다만 무시할래, 대소문자 비교를
		System.out.println(statement.equals("My Name Is Loki")); // " " > 공백도 컴퓨터는 문자가 있다고 인식한다는 점!
		System.out.println(statement.compareTo("  My Name Is Loki  "));
		
		// 3. 문자열 길이
		// length(): 문자열의 길이 반환
		System.out.println(statement.length());
		
		// 4. 문자열 변환
		// toUpperCase(): 모두 대문자로 변환
		// toLowerCase(): 모두 소문자로 변환
		// trim(): 앞뒤 공백 제거
		// replace(찾을문자열, 바꿀문자열): 특정 문자열을 찾아 변경
		System.out.println(statement.toUpperCase());
		System.out.println(statement.toLowerCase());
		System.out.println(statement.trim());
		System.out.println(statement.replaceAll("Loki", "Hulk")); //replaceAll해야 모든 문자를 다 찾아서 다 바꿔주는
		
		// 5. 문자열 찾기
		// indexOf(문자열): 찾고자하는 문자열의 처음 찾은 위치의 인덱스 번호를 반환
		// lastIndexOf(문자열): 찾고자하는 문자열의 마지막 위치의 인덱스 번호를 반환
		statement = "내가 그린 기린 그림은 잘 그린 기린 그림이고 네가 그린 기린 그림은 잘 못그린 기린 그림이다.";
		System.out.println(statement.indexOf("그림"));
		System.out.println(statement.indexOf("사진")); //문자열에 없는 단어를 넣게 되면 -1이라고 결과값을 볼 수 있음
		
		// 6. 부분 문자열
		// substring(시작인덱스번호), substring(시작인덱스, 종료인덱스) >> 두 가지 방법이 있음 : 문자열을 원하는 크기만큼 추출
		System.out.println(statement.substring(13)); // 해당 인덱스번호 부터 끝까지 추출하는
		System.out.println(statement.substring(13, 23)); // 해당 시작 인덱스번호 부터 입력한 인덱스번호까지 추출하는
		
		// 참조형 데이터 타입
		// 주소를 가지는 변수의 데이터 타입
		// null을 가질 수 있다는 것이 중요(null : 아무것도 지정되지 않은 상태)
		// 배열, 클래스, 인터페이스, 열거형이 참조형 데이터 타입에 속함 (기본형이 아니면 다 참조형임)
		String string4 = null;
		string4.substring(0);
		
		
		
	}

}
