package chapter01;

public class D_Operator {

	public static void main(String[] args) {
		
		int a = 15, b = 2;
		double c = 15.0, d = 7.0;
		
		int intResult = 0;
		double doubleResult = 0.0;
		
		// 산술 연산자 : 사칙연산을 수행하는 연산자
		
		// 더하기 : +
		// 좌항에 우항을 더한 값을 반환
		intResult = a + b;
		System.out.println(intResult);
		doubleResult = c + d;
		System.out.println(doubleResult);
		// intResult = a + c; >> 자동 형변환이 안되는 경우에 해당.
		doubleResult = a + c; // int 타입인 a를 double 계산식에 넣어서 자동 형변환 되게끔.
		System.out.println(doubleResult);
		
		// 빼기 : -
		// 좌항에 우항을 뺀 값을 반환
		intResult = a - b;
		System.out.println(intResult);
		doubleResult = a - c;
		System.out.println(doubleResult);
		
		// 곱하기 : *
		// 좌항에 우항을 곱한 값을 반환
		intResult = a * b;
		System.out.println(intResult);
		doubleResult = a * c;
		System.out.println(doubleResult);
		
		// 나누기 : /
		// 좌항에 우항을 나눈 결과를 반환
		// 정수와 정수를 나누면 실수부가 소멸함
		doubleResult = a / b; //실수가 날라간 정수부분이 나오게 되고 그것을 실수 결과값인 doubleResult에 넣은 상황_둘 중 하나에 대해 강제 형변환 하면 실수결과임
		System.out.println(doubleResult); // (double) (a / b); > 이미 (a / b)가 먼저 실행된 결과로 7 정수가 나오므로 그것을 double로 해도 결과는 7 
		doubleResult = c / b; // 실수가 아닌 정수를 실수로 바꾸는 작업을 먼저하게 된다고 했음. 그럼 실수와 실수를 나누는 작업을 하는 것. 실수로 표현 가능
		System.out.println(doubleResult);
		
		// 나머지 : %
		// 좌항에 우항을 나눈 나머지를 반환
		intResult = a % b;
		System.out.println(intResult);
		doubleResult = a % d;
		System.out.println(doubleResult);
		
		// 증감연산자
		// 피연산자 값을 1 증가 혹은 감소
		// 단항 연산자, 이때, 피연산자는 !반드시 변수이어야 함!(상수가 될 수 없다_자기자신을 바꾸는 것이기에 상수는 값을 바꿀 수 없으므로)
		// 증가 연산자: ++
		// 감소 연산자: --
		int number = 7;
		System.out.println(number);
		number++; //이미 자기 자신이 그릇이기에 따로 담을 것이 필요가 없어_단항 연산자
		System.out.println(number);
		number--;
		System.out.println(number);
		++number;
		System.out.println(number);
		
		// number = 8 인 상태 여기서 아래 내용 보면,
		// 선행 증감 연산은 증감 연산을 먼저 수행하고 다른 연산을 진행
		// 후행 증감 연산은 다른 연산을 먼저 진행하고 증감 연산을 수행
		System.out.println(10 + number++); // 선행 : 증가시켜서 더해라. 결과값은 10에 8에서 1 증가하고(변경을 먼저하고) 더해라(연산작업 수행해라)
		System.out.println(number); // 바로 위에 후행 증가해서 10에 number값이었던 8을 먼저 더하고 이후에 number를 1 증가했기에 여기선 9로 확인.
		
		final int NUMBER = 7;
		// NUMBER++; // 상수에 증감연산자 사용 불가.
		// 7++; // 값 그자체인, 숫자 그자체인 것에도 증감연산자 사용 불가하다.
		
		// 대입 연산자 : 좌항에 우항을 할당
		
		// 일반 대입 연산자 : = 사용
		// 좌항에 우항의 연산 결과를 할당
		// 좌항에 일반 변수와 상수형 변수 모두 올 수 있음
		// 단, 상수형 변수에는 초기화 시에만 사용 가능
		number = 10 + 5;
		
		// 복합 대입 연산자 : 타연산자=
		// 좌항에 우항의 연산 결과를 좌항에 할당
		// 좌항은 반드시 초기화가 이루어진 일반 변수이어야 한다.(조건)
		number += 3;
		System.out.println(number);
		
		number %= 5;
		System.out.println(number);
		
		int number2; //초기화 하지 않고
		// number2 += 1; //초기화 하지 않은 값을 사용까지 하려는 것. 대입만 하는 것이 아니라. 컴파일 에러가 나타나게 되는
		final int NUMBER2 = 10; //초기화를 해놓은 상수에 
		// NUMBER2 += 1; // 상수 final 로 지정된 녀석에게 재할당 하려는 행동이라고 하며 안되는
		
		// 비교 연산자 : 좌항과 우항을 비교하여 그 결괄르 논리 값으로 반환하는 연산자
		boolean booleanResult = true;
		
		// 같다, 다르다 연산자
		// == : 좌항이 우항과 같으면 true, 다르면 false
		// != : 좌항이 우항과 다르면 true, 같으면 false
		// a: 15, b: 2, c: 15.0, d: 7.0
		booleanResult = a == b;
		System.out.println(booleanResult);
		booleanResult = a != b;
		System.out.println(booleanResult);
		booleanResult = a == c; // 어떤 항이든 좌항이든 우항이든 정수,실수로 존재하는데 어느 하나가 실수이면 나머지 하나를 실수로 변경하는 작업이 거쳐지기에
		System.out.println(booleanResult); // 위 설명에 의해 a와 c는 같다는 것이 true로 나오게 되는 이유임.
		
		// 작다, 작거나 같다 연산자
		// < : (lessthan이라고 읽음) 좌항이 우항보다 작으면 true, 크거나 같으면  false
		// <= : 좌항이 우항보다 작거나 같으면 true, 크면 false
		booleanResult = a < c;
		System.out.println(booleanResult);
		booleanResult = a <= c;
		System.out.println(booleanResult);
		
		// 크다, 크거나 같다 연산자
		// > : (greatthan이라고 읽음) 좌항이 우항보다 크면 true, 작거나 같으면 false
		// >= : 좌항이 우항보다 크거나 같으면 true, 작으면 false
		booleanResult = d > b;
		System.out.println(booleanResult);
		booleanResult = d >= b;
		System.out.println(booleanResult);		
		
		
		// 논리 연산자 : 피연자가 모두 논리값인 연산자, 피연산자를 조합
		
		// 논리 AND 연산자: && - 좌항과 우항이 모두 true일 때 true를 반환, 하나라도 false이면 false를 반환
		booleanResult = true && false;
		System.out.println(booleanResult);
		booleanResult = (a == b) && (c == d);
		System.out.println(booleanResult);
		// |(1개는 bit OR 연산이라함)
		// 논리 OR 연산자: || - 좌항과 우항 중 하나라도 true면, true 반환, 아니면 false 반환
		booleanResult = true || false; // 뒤에 false 는 dead code가 되어 노란줄. 앞에 true에서 이미 답이 나온 것이기에 뒤에 false는 읽지 않아서 dead code가 잡히는
		System.out.println(booleanResult);
		booleanResult = (a > b) || (c < d);
		System.out.println(booleanResult);
		
		// 논리 NOT 연산자: ! - 피연산자가 true이면 false, false이면 true
		System.out.println(!booleanResult); // ( ) 안에 ! 와 표현식을 넣는.
		
		// AND 연산의 경우 좌항이 false 이면 우항의 코드는 dead code가 됨
		// OR 연산의 경우 좌항이 true이면 우항의 코드는 dead code가 됨 _ 많이 쓰이게 될 부분임.
		System.out.println(a);
		booleanResult = true || (a++ > b); //여기서 a가 15로 b와 > 비교 후에 ++수행해서 16이 되었을 것인데 아래에 a는 15, dead code로 읽지 않았다는 것
		System.out.println(booleanResult);
		System.out.println(a);
		
		// 삼항 연산자: 조건에 따라 지정한 결과를 반환하는 연산자
		//조건(논리식이 옴) ? 참일때 결과 : 거짓일때 결과
		
		String resultString = false ? "참" : "거짓"; // true false 인지에 따라서 뒤에 참부분이 dead code가 되기도 거짓부분이 dead code가 되기도
		System.out.println(resultString);
		
		
	}

}
