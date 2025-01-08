package chapter02;

// 클래스 : 공통된 속성과 기능을 <정의>한 것(묶어두는 것, 집합들)
// [접근제어자] class 클래스명 { 속성, 기능들이 나열 될 부분 }
class ExampleClass1 {
	
	// 속성: 객체가 가지는 정보나 상태의 정의
	// 일반적으로 변수 형태로 표현
	int attribute1; // 사람은 이름, 나이 이런 것 가질 수 있는 것에 대한 것만 정의만 하는. 정의돈 것으로 실체를 만들었을 때 값을 할당하게 됨.
	double attribute2; // 정의만 하는 것임. 일반적으로 이것에 할당하는 작업을 하지 않아 여기 값을 넣는게 아니라 실체를 정의.
	
	// 인스턴스 변수 : 각 인스턴스마다 독립적으로 값을 가지는 변수 / 인스턴스 생성_new를 통한 생성 후 공간이 만들어진 뒤 사용가능
	// 반드시 인스턴스가 생성된 후에 사용 가능
	int instanceVariable;
	
	// 클래스 변수 : 해당 클래스로 생성된 모든 인스턴스가 공유하는 변수  / 클래스 코드가 읽혀질 때 쓸 수 있다. 
	// 필드의 데이터 타입 앞에 static 키워드를 사용하여 지정(static 정적이다_변함없다)
	// 인스턴스 생성 없이 사용 가능
	static int classVariable; //글꼴도 달라짐. 클래스 변수는 이태리체로.

	// 기능 : 클래스가 가질 수 있는 행동이나 작업 (메서드라 이야기함)
	// [접근제어자] 반환타입 메서드명 (매개변수타입 매개변수명, ... _0개 이상이 됨. 여기 표시될 것들의 수는)//{} 앞까지이 부분을 선언부(함수 메서드의 선언부라고 부름)
	// { 메서드의 기능 구현 } // {}중괄호가 적힌 이 부분은 메서드구현부라고 함.
	void method1 () {
		System.out.println("메서드");
		// return : 메서드의 결과를 반환하는 역할을 수행함.
		// 일반적인 메서드는 반드시 가장 마지막에 return이 필수
		// void 메서드에서는 필수가 아님
		// 메서드 중간에서 조건문 등을 활용하여 강제 메서드 종료에도 사용됨 다만, 반환타입이 존재하면 return 값 앞에도 반환타입을 같이 써줘야 함.
		return; //어제(12.30) 수업 때, void 상태에서 return을 하게되면 강제로 종료하게도 할 수 있다고 했어.
	}
	
	// 인스턴스 메서드 : 인스턴스 생성 후!!! 인스턴스를 통해 호출 가능한 메서드
	// 인스턴스, 클래스 변수 및 메서들르 모두 사용 가능
	int instanceMethod1(int arg1) {
		//return arg1 * attribute1;\
		return arg1 * classVariable;
	}
	
	// 클래스 메서드 : 인스턴스 생성 없이 클래스로 호출 가능한 메서드
	// 반환타입 앞에 static 키워드를 붙여서 선언 가능
	// 클래스 메서드에서는 인스턴스 변수 사용 및 인스턴스 메서드 호출이 불가능!!! 
	// 인스턴스 변수 및 인스턴스 메서드를 사용하지 않는 기능에 주로 사용됨
	static int classMethod1(int arg1) {
		//return arg1 * attribute1;
		return arg1 * classVariable;
	}
}

// 스마트폰 이라는 것의 실체 타입을 만들어 본느 것임
// - 운영체제
// - 전화번호 > 16진수나 -가 있다보니 int나 double로 표현하기 어렵 String으로 표현
// - 전원상태
// - 전원 상태 변경 작업
// - 정보를 보여주는 작업
// - 전화를 거는 작업

class SmartPhone1 {  //new - 새로운 공간에 컨테이너를 만드는 작업을 했어. 변수에는 그 주소가 들어가게 되는
	String os; // 이 요소들 쓴 것은 구조체라 볼 수 있음. 커스텀 데이터 타입이라 볼 수 있어 원하는 것으로 정의해둔
	String telNumber;
	boolean power;
	
	void onOff() {
		power = !power;
	}
	
	void printInfo() {  // 특정 반환할 값이 존재하지 않으니 void
		if (!power) {
			System.out.println("전원이 꺼져있습니다.");
			return; // void에서 해당 메서드를 종료처리하는데는 return 사용.
		}
		System.out.println("OS : " + os);
		System.out.println("Tel Number : " + telNumber);
	}
	//void - 특정 값을 반환해야하나 안하냐에 따라 사용 유무 결정
	void tel(String to) {
		if (!power) {
			System.out.println("전원이 꺼져있습니다.");
			return;
		}
		System.out.println(telNumber + "가 " + to + "에게 전화를 겁니다.");
	}
}

// 삼각형 관련 수학  _ 독립적 동작이 아니기에 클래스 메서드로 만들 것임
// 빗변 구하기 / 빗변이라고 하는 것을 뱉어줄 녀석임 _ 그럼 이 빗변의 데이터 타입을 무엇으로 지정해주는 것이 좋을까? 
// 둘레 구하기
// 넓이 구하기
class TriangleMath {
	
	// SPEED_OF_LIGHT은 TriangleMath 클래스의 단일 책임 원칙에 위배됨. (SOLID 중 S)
	static final int SPEED_OF_LIGHT = 300_000_000; //TriangleMath에 갑자기 빛의속도 관련 내용 넣으면 SOLID 법칙 중 S에 위반(단일 책임 원칙)
	
	static double getHypotenuse(double bottom, double height) {
		if (bottom <= 0 || height <= 0) {
			return 0; // 아래 정상적인 결과값에선 절대 나올 수 없는 수를 반환하는 것으로 하는.
		}
		double hypotenuse2 = Math.pow(bottom, 2) + Math.pow(height, 2); //bottom 값과 height 값의 2제곱 구할 수 있는
		double hypotenuse = Math.sqrt(hypotenuse2); // sqrt 제곱근을 구해줌
		return hypotenuse;
	}
	
	static double getCircumference(double bottom, double height, double hypotenuse) {
		
		if (bottom <= 0 || height <= 0 || hypotenuse <= 0) {
			return 0;
		}
		
		double circumference = bottom + height + hypotenuse;
		return circumference;
	}
	
	static double getArea(double bottom, double height) {
		if (bottom <= 0 || height  <= 0) {
			return 0;
		}
		double area = (bottom * height) / 2;
		return area;
	}
	
}

public class A_Class_Object {
	
	// 함수 : 특정한 기능에 대한 정의
	// 반환타입 함수명(매개변수타입 매개변수명, ...) { 함수의 기능 }
	static int fx1(int x) {
		int y = x * x + 2 * x + 1;
		// return : 함수를 종료하면서 함수 결과를 반환하는 역할
		// 함수에서 반드시 return 작업이 수행되어야함
		// 단, void 반환타입 일때는 return이 필수는 아님
		// void : 타입 없음
		return y;
	} // 함수 값 구하는 것을 코드로 구현한게 이렇게 되는 것임.(이해)
	
	// 함수의 목적 !!! (함수 는 기능이다)
	// 1. 기능을 미리 정의해두고 사용할땐 호출하여 사용할 수 있도록 함
	//    (코드 중복 제거, 유지 보수성 향상, 실제 구현내용을 알 필요가 없음)
	// 2. 기능에 이름을 부여하여 사용할 수 있도록 함 (변수의 기능 중 하나가 이름부여이듯)	
	static void printBMI() {
		double x = (183 * 183);
		double y = 84 / x; //
		System.out.println("bmi : " + y);
	}
	
	public static void main(String[] args) {
		
		// 인스턴스 : 특정 ㅓ클래스로 정의된 것을 실체화한 것
		// 클래스명 참조변수명 = new 클래스명();
		ExampleClass1 instance1 = new ExampleClass1(); // new ExampleClass1(); 이게 인스턴스야. 이거 쓰고 .찍고 속성 사용하는 것임.
		ExampleClass1 instance2 = new ExampleClass1(); // instance2가 인스턴스가 아님. 인스턴스를 담고 있는 주소임. 그 안에 들어있는게 인스턴스
		
		System.out.println(instance1);
		System.out.println(instance2);
		
		// 인스턴스가 가지고 있는 속성 접근 방법
		// 인스턴스.속성명;
		instance1.attribute1 = 10;
		instance2.attribute1 = 20;
		new ExampleClass1().attribute1 = 30; //만들어지고 값 할당하고 끝. 주소를 기억하지 못하니 1회성.
		
		instance1.classVariable = 10;
		ExampleClass1.classVariable = 20; // 인스턴스 생성 없이 사용 가능한 
		instance2.classVariable = 99; // 마지막에 입력한 이 값으로 클래스 변수값이 덮어씌워진 것. 그래서 아래 3가지 출력 결과가 모두 99가됨
		
		System.out.println(instance1.classVariable); // 바로 위에 2만 99로 변경했는데
		System.out.println(instance2.classVariable); // instance1과 2 모두 Variable 값이 99.
		System.out.println(ExampleClass1.classVariable); // ExampleClass1도 classVariable 값이 99.
		
		// 클래스 변수 사용할 때 주의할 점
		// 클래스 변수는 모든 인스턴스에 영향을 미치기 때문에
		// 클래스로 접근하길 권장함 (왠만하면 인스턴스에서는 클래스 변수를 명명하지 않는 것이 좋음)
		// 일반적으로 클래스 변수는 final 키워드와 함께 사용한다(일반적으로임. 모두다 그렇다는 것이 아님. 상황마다 달라지는)
		
		SmartPhone1 iPhone16 = new SmartPhone1(); // iphone16은 참조변수이고 그 안에 들어가있는 것이 인스턴스(new SmartPhone1)다.
		SmartPhone1 galaxyS24 = new SmartPhone1(); // 이렇게 실체를 만들어주는
		// 이렇게 만든게 인스턴스 변수_각 객체 인스턴스가 자체 복사본을 가지는 변수. 인스턴스에 직접 속하며, 객체 생성때마다 컨테이너에 각 각 만들어짐.
		iPhone16.os = "iOS";
		iPhone16.telNumber = "010-1111-1111";
		galaxyS24.os = "Android";
		galaxyS24.telNumber = "010-9999-9999";
		// 지역변수는 메서드 안에서 선언하여 사용하는 변수들. 좁게보면 이렇고 넓게 보면 글로벌변수(클래스 선언 아래에 바로 할당된) 로컬변수에서 로컬변수라 설명하는 부분
		System.out.println(iPhone16.os);
		System.out.println(galaxyS24.os);
		//static 변수(클래스 변수)_클래스의 모든 인스턴스가 공유하는 변수.값을 넣기 위한 메모리 공간이 들어가는 것이 아닌, 
//		System.out.println(iPhone16.telNumber + "가 ");
//		System.out.println("010-2222-2222로 전화를 겁니다.");
//		
//		System.out.println(galaxyS24.telNumber + "가 ");
//		System.out.println("010-3333-2222로 전화를 겁니다.");
		
		// 인스턴스가 가지고 있는 메서드 호출 방법
		// 인스턴스.(호출할)메서드명(매개변수, ..._이 메서드가 매개변수를 받아야 한다면 여기에 매개변수 입력한다는);
		iPhone16.printInfo();
		iPhone16.onOff();
		iPhone16.printInfo();
		iPhone16.tel("010-2222-2222");
		
		//함수를 실행시키곘다>> 함수를 호출한다고함
		System.out.println(fx1(10)); //함수 호출하는 방법임. 위에 fx1 함수 설명한것 참고
		System.out.println(fx1(4));
		
//		double x = (183 * 183);
//		double y = 84 / x; //
//		System.out.println("bmi : " + y);
		
		printBMI();
		
		double result = TriangleMath.getHypotenuse(3, 4);
		System.out.println(result);
		
	}

}
