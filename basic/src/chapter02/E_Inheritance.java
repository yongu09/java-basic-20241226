package chapter02;

// 상속 : 객체지향 프로그래밍의 특성 중 하나
// 원래 존재하던 클래스를 '확장'하여 재사용할 수 있도록 하는 것
// 코드의 중복을 제거하여 코드 재사용성, 유지보수성, 확장성을 높일 수 있음
// extends 키워드를 사용

// class SubClass(자식클래스) extends SuperClass { ... }
class Human {
	String name;
	int age;
	
	Human() {} // 특정한 행위를 하지 않게 기본 생성자를 하나 만들었음
	
	// 부모 클래스의 생성자는 상속되지 않음(자식에서 Human이라는 생성자를 사용할 수 없다는_인스턴스에서)
	Human(String name, int age) { //생성자(클래스와 같은 이름, 반환타입 없음)를 만드는
		this.name = name;
		this.age = age;
	}
	
	void sleep() {
		System.out.println(name + "이 잠을 잔다");
	}
	
	final void eat() {
		System.out.println("밥을 먹습니다.");
	}
}

class Korean extends Human { // 코리안도 사람일 것이기에 Human 을 상속받는
	static String country = "대한민국";

	void sleep() {
		System.out.println("01시에 잠을 잔다");
	} // 위에 Human 클래스의 sleep 메서드와 이름이 같음. 자식클래스에서 sleep 클래스 쓸 때 어느 클래스의 sleep을 쓰는건지 다중상속에서 문제가 있을것이니 막아버리자는

	
	
}
// Java에서는 단일 상속만 지원함
// 그 이유가, 다중 상속에서 발생할 수 있는 다이아몬드 문제가 발생하지 않도록 하기 위함
// 다이아몬드 문제 : 다중 상속으로 인해 동일한 이름의 메서드를 상속받은 상태에서 어떤 메서드를 선택해야 할지 모호해지는 문제
// 인터페이스를 사용하여 다중 상속 효과를 볼 수 있음, 중첩 상속을 사용하여 다중 상속 효과를 볼 수 있음
class Firefighter extends Korean /*, Human*/ {  // Human 을 상속받은 Korean 을 상속받는 중첩상속으로 다중상속의 효과를 내는
//	String name;
//	int age;	
	String position;
	
//	void sleep() { //같은 sleep 의 이름으로 오버로딩 된.
//	System.out.println(name + "이 잠을 잔다");
//}
	
	// Human 클래스에서 상속받은 sleep 메서드를 오버로딩한 것 _ 다형성이 적용된 것 _ 원래코드를 만지지 않고
	void sleep(int time) { // 오버로딩에 해당 위에 //친 sleep()과 같은 이름으로 int time을 넣은
		System.out.println(name + "이 " + time + "시에 잠을 잔다");
	}
	
	void firefight() {
		System.out.println("소방활동을 한다");
		
	}
}

class Police extends Human {
	String rank;
		
	Police() {
		// super(): 부모 크래스의 생성자를 지칭하는 키워드
		super("이향", 32);
		// super: 부모 클래스를 지칭하는 키워드
//		super.name = "이향";
//		age = 32;
		rank = "경감";
	}
	
	void patrol() {
		System.out.println("순찰을 한다");
	}
}

// Java의 모든 클래스는 Object 클래스를 최상위 클래스로 상속받아 사용함

class SalesMan extends Human {
	int sales;
	
	void sale(int amount) {
		sales += amount;
	}
	
	// 오버라이딩 (Overriding): 하위 클래스에서 상위 클래스의 메서드를 '재정의' 하는 것
	// 규칙
	// 1. 상위 클래스에서 선언된 메서드와 이름, 매개변수 조합, 반환타입이 같아야 함
	// 2. 상위 클래스에서 선언된 메서드가 final로 선언되면 재정의가 불가능
	// @Override: 컴퍼일러에게 현재 작업이 오버라이딩 작업임을 알려줌(문법검사를 수행하게 만들어주는)
	@Override
	void sleep() {
		// 오버라이딩을 통해서 코드의 유연성을 증가시킬 수 있음
		System.out.println("영업 사원이 잠을 잔다.");
		// 오버라이딩을 통해 코드의 재사용성을 증가시킬 수 있음
		super.sleep(); // 원래있던 코드를 유지하면서 앞이나 뒤에 추가적인 코드가 필요하다면 오버라이딩 시켜서 앞이나 뒤에 출력상태를 붙여주면 됨.
		//System.out.println(name + "이 잠을 잔다"); //원래 Human클래스의 sleep에 있던 내용임 _super를 써서 부모클래스에 있는 sleep을 불러 쓰는.
	}
	
//	void eat() {
//		
//	}
}

final class FinalSuper {
	int a;
}

// final로 정의된 클래스는 상속받을 수 없음
//class FinalSub extends FinalSuper {
//	
//}

public class E_Inheritance {

	public static void main(String[] args) {
		
		Firefighter firefighter = new Firefighter();
		firefighter.name = "이도";
		System.out.println(firefighter.name);
		
		Police police = new Police();
		police.sleep();
		firefighter.sleep();
		
		SalesMan salesMan = new SalesMan();
		salesMan.sleep(); // Human 클래스에서의 sleep을 SalesMan 클래스의 sleep의 내용으로 바뀌어져서 출력.
		
	}

}
