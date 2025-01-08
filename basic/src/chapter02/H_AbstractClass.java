package chapter02;

// 추상 클래스: 추상 메서드를 포함할 수 '있는'(must 가 아닌 can) 클래스
// 추상 클래스 자체로는 인스턴스를 생성할 수 없음, 반드시 추상 클래스를 상속받은 하위 클래스로 인스턴스를 생성해야 함
// abstract class 추상클래스명 { ... }

// 추상 메서드: 선언부만 존재하고 구현부는 존재하지 않는 메서드
// 반드시 (클래스 중에서는) 추상 클래스 내부에서만 선언할 수 있음
// 반드시 추상 클래스를 상속받은 하위 클래스에서 재정의(오버라이딩)하여 구현해야함(강제성을 가짐)
// abstract 반환타입 추상메서드명(매개변수, ...); (세미콜론 찍어서 바로 마무리)

// abstract: 추상 클래스 혹은 추상 메서드를 정의하는 제어자
// abstract가 붙은 클래스는 인스턴스를 생성할 수 없음
// abstract가 붙은 메서드는 구현부를 가질 수 없음

abstract class Occupation { //추상 클래스가 되었고 추상 메서드를 가질 수 있게 되었음_추상 메서드가 없어도 되고)
	int annual;
	int income;
	
	// 추상클래스에서 생성자는 인스턴스를 생성하는 목적이 아님(인스턴스 생성 불가함)
	// 하위클래스에서 호출하여 사용할 수 있도록 제공하는 목적을 띠고 있음.
	// 단, 기본 생성자가 없는 상태에서 생성자를 정의한다면 
	// 하위클래스에 생성자 작성을 강요하게 된다.
	Occupation(int annual, int income) {
		this.annual = annual;
		this.income = income;
	}
	
	// 추상메서드는 하위 클래스에서 오버라이딩을 강요함(반드시 오버라이딩 해야한다)
	abstract void work(); // abstract 추상 메서드는 구현부가 없어야 하니 { } 를 지우고 ; 로 마침
	
	// 추상클래스도 일반 메서드를 가질 수 있음
	// 일반 메서드는 오버라이딩을 강요하진 않음(할 수 있지만)
	void sleep() {
		System.out.println("잠을 잡니다.");
	}
}

// 추상클래스도 단일 상속만 가능함
class Developer extends Occupation {
	String position;
	
	Developer(int annual, int income, String position) {
		super(annual, income); // super 로 상위클래스에 생성자 호출하는데 super는 그 영역 중 가장 맨 위에 써야함.
		this.position = position;
	}
	
	void work() { // 상속받은 Occupation 추상 클래스 내 추상 메서드 work를 써줘야 문법에 맞는. 그래서 여기에 work 내용을 쓰는 
		System.out.println("프로그램을 개발합니다.");
	}
	
	void eat(String food) {
		System.out.println(food + "을 먹습니다.");
	}
}

class TourGuide extends Occupation {
	
	String country;
	
	TourGuide(int annual, int income, String country) {
		super(annual, income);
		this.country = country;
	}

	@Override
	void work() {
		System.out.println(country + "에서 관광을 설명합니다.1");
	}
	
	void sleep() { // sleep 이라는 일반 메서드도 오버라이딩 한 것이 아래 내용.
		System.out.println("관광지에서 잠을 잡니다.");
	}
}


public class H_AbstractClass {

	public static void main(String[] args) {
		
		// Occupation occupation = new Occupation(10,100); // 앞에 Occupation이 문제였다기 보다 new 뒤에 Occupation으로 인스턴스 생성이 안된다는
		Developer developer = new Developer(10, 100, "백엔드");
		TourGuide tourGuide = new TourGuide(1, 20, "대한민국");
		developer.work();
		System.out.println(tourGuide.annual);
	
	}

}

// 제어자 조합
// static이 붙은 변수: public + static + final (static은 이 형태를 자주 사용)_static이 붙은 방식은 클래스에서 접근하는 것이기에 선언함과 동시에 만들어주길 원함
// private + final이 붙은 변수 : 생성자에서 필수로 초기화함을 의미한다.
// private + final이 붙은 메서드 : final이 의미가 없음. private 경우 자기 클래스에서만 접근 가능. final은 오버라이드를 할 수 없다는 의미._말이 안됨 
// private + abstract가 붙은 메서드 : abstract도 반드시 오버라이드해야한다는 것인데 private가 붙었으니. 서로 상충되는. 이 경우 메서드에서 아예 불가능한 조합임.
// final + abstract가 붙은 클래스와 메서드 : final은 클래스에 붙으면 상속불가.메서드에 붙으면 오버라이드 불가인데, abstract는 반드시 상속과 오버라이드 해야해서 불가능



