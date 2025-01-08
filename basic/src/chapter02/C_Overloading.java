package chapter02;

// 오버로딩(Overloading): 같은 클래스 내부에서 같은 이름의 메서드를 여러개 작성할 수 있도록 하는 방법론
// 오버로딩의 조건
// 1. 메서드의 이름을 중복해서 작성하고 매개변수 타입의 조합(개수, 타입의 순서)을 다르게 작성
// 2. 메서드의 반환타입과 매개변수의 이름은 영향을 주지 않음
class NewMath {
	
	int add(int a, int b) { // 인스턴스 메서드로 만들었음.
		return a + b; //static을 붙이지 않았기에 main 에서 인스턴스 생성하고 작업가능하다는.
	}
	
	// 문제점
	// 1. 메서드의 이름이 불규칙적임(작성할 때)
	// 2. 사용시에 불편함을 초래함
	double add2(double a, double b) {
		return a + b;
	}
	// add 라는 이름을 같게 쓰고 그 안에 매개변수만 int가 아닌 double로 해둠.
	// 오버로딩 : 매개변수의 타입을 다르게 한 경우
	double add(double a, double b) {
		return a + b;
	}
	
	// 오버로딩 : 매개변수의 개수를 다르게 한 경우
	int add(int a, int b, int c) {
		return a + b + c;
	}
	
	// 오버로딩 : 매개변수 타입의 조합이 다를 때
	double add(int a, double b) { //int 나 double 중 어느것이 먼저 매개변수로 와도 무관
		return a + b;
	}
	
	// 반환 타입만 다를 땐 오버로딩 불가능
//	double add(int a, int b) {
//		return a + b;
//	}
	
	// 매개변수의 이름만 다를 땐 오버로딩 불가능
//	int add(int x, int y) {
//		return x + y;
//	}
	
}

public class C_Overloading {

	public static void main(String[] args) {
		
		NewMath newMath = new NewMath(); // NewMath의 인스턴스가 만들어짐, NewMath 주소를 참조하는 newMath 를 만듬
		// newMath.add2();
		newMath.add(1.2, 1.4);
		newMath.add(1, 2, 3);
		//newMath.add("0", "0");
		
		
		
	}

}
