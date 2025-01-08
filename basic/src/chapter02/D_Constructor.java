package chapter02;

// 생성자(Constructor): 클래스의 인스턴스가 생성되는 순간에 호출되는 메서드
// 클래스와 같은 이름을 가짐, 반환타입이 존재하지 않음
// 클래스명(매개변수, ...)  { 구현부에는 인스턴스가 생성될 떄 수행할 작업 }
class Human1 {
	String name;
	int age; //필드를 이름, 나이, 성별 로 만드는
	String gender;
	
	// !!! final(상수가 되는)로 선언된 인스턴스 변수는 생성자에서 반드시 초기화 해야함.(하지 않으면 String변수의 경우 기본값 null에서 변경불가하게 되는 것처럼 문제생기니)
	// 즉, 필수 값 (required)
	final String address; //!!!인스턴스 필드에 주소라는 것을 만들고(일반변수임) 이걸 상수로 만들어보는 final 로 하면 생성자로 필수값으로 들어간다는.
	
	int[] numbers;
	
	// 만약 다른 생성자(매개변수가 존재하는 생성자)만 존재한다면
	// 기본 생성자는 자동으로 생성되지 않음
	Human1() { // new 해서 생성자 만들면 반환타입을 별도로 작성할 필요 없음, new 하면서 해당 주소가 인스턴스에 부여되니
		// !! this() : 클래스의 다른 생성자를 호출하는 키워드라
		// !! 반드시 생성자에서만 사용 가능
		// !! 그리고 생성자의 가장 첫 구문으로 들어와야 함.
		this("홍길동"); //생성자에서 다른 생성자를 호출하고 싶으면 가장 상단에 작성해줘야 한다.
		
		// 1. 인스턴스를 생성할 때 특정 작업을 수행하고 싶을 때
		System.out.println("Human1의 인스턴스가 생성됩니다.");
		
		// 2. *인스턴스를 생성과 동시에 인스턴스 변수를 초기화하고 싶을 때
		// 의존성을 내부에서 주입하는 행위라 한다 이런 것을.(아래 예시)_하지만 그닥 좋지 않은 방식.(해야하는 상황이 오면 해야겠지만)
		name = "홍길동"; // 인스턴스 형성 때 각 변수에 초기화를 하게끔 생성자를 만드는.
		age = 20;
		gender = "남";
		// address = "부산";
		
		}// 여기까지로 생성자 만들고 아래 = new Human1(); 까지만 작성한 상태에서 출력하면 위 생성됩니다 내용이 콘솔 출력됨.
	
	Human1(String name) { // 이 name 은 위의 name을 아래 this name은 이 name을 지칭함)
		// this : 현재 자기 자신의 인스턴스를 지칭하는 키워드 (클래스 자기 자신에서 뭘 사용했다는 것을 지칭)
		// 인스턴스 변수나 인스턴스 메서드를 정확히 지칭할 때 사용됨
		this.name = name;
		age = 20;
		gender = "남";
		address = "부산";
	}
	
	Human1(String name1, int age1, String gender1) {
		// 아래와 같은 예가 의존성을 모두 외부에서 주입하는 행위이다. 이게 유연한 방식임
		name = name1; // name 값에 생성자 안에 받은 name1 값을 넣겠다. (이게 아주 좋은 방법 중의 하나임.)
		age = age1; 
		gender = gender1;
		address = "부산";
		numbers = new int[] {1, 2, 3};
	}
	
	Human1(Human1 human1) { //이렇게 생성자를 돌리니 새로운 인스턴스가 만들어지면서 그 안 공간에 name,age 값 등.. 같은 것이 기존값과 같은 값이 독립적인 공간에서 만들어지는)
		name = human1.name;
		age = human1.age;
		gender = human1.gender;
		address = human1.address;
		numbers = human1.numbers;
	}
}

public class D_Constructor {

	public static void main(String[] args) {
		// new 뒤의 Human1() <- 이것이 생성자다. 여기서 (안에 아무것도 없는) 것이면 기본생성자라고 한다.
		// 만약 클래스에 생성자를 정의하지 않으면
		// 컴파일러가 자동으로 기본 생성자를 제공함 (이 때 기본생성자는 별다른 작업을 수행하지 않음)
		Human1 human1 = new Human1();
		
		human1.name = "이성계"; //초기화 하기 전 name 값에는 null 이 들어가있을 것임. 일반데이터 값에는 0.
		human1.age = 60; // 생성했다면 값을 초기화 해줘야 하는.
		human1.gender = "남";
		
		Human1 human2 = new Human1(); //human2라는 참조변수 생성했고, 생성자는 Human1() 즉, 기본생성자를 생성했음 출력내용 뜨고 name~gender까지 설정한대로 값이 들어간 상태로 만들어질것임
		System.out.println(human2.name); // 기본값을 가진 상태로 만들고 싶으면 생성자를 통해서 이렇게 만들 수 있다는.

		Human1 human3 = new Human1("이성계");
		System.out.println(human3.name);
		
		Human1 human4 = new Human1("이방과", 30, "여"); //인스턴스 생성과 동시에 내가 쓰고자 하는 값을 바로 초기화시켜버리는 방법
		System.out.println(human4.name);
		System.out.println(human4.age);
		System.out.println(human4.gender);
		
		// 주소만 복사되는 형태 (독립적이지 않음_참조변수 안의 값을 복사해서 전달하는 행위_같은 주소를 가지고 있음)
		Human1 human5 = human4; //human4의 주소가 5로 들어가게됨. _인스턴스는 독립이나 같은 주소를 쳐다보는 2개의 인스턴스
		// 새로운 주소를 생성해서 human4가 가지고 있던 값을 새 주소 내 새 공간에 복사하는 형태(독립적)
		Human1 human6 = new Human1(human4); // human5와 달리 새로운 인스턴스에 독립적인 주소가 만들어져서 내용은 같지만 주소가 다른 독립적이게 되는
		
		human4.numbers[0] = 99;
		System.out.println(human4.numbers[0]);
		System.out.println(human6.numbers[0]); //여기도 99가 뜨는 이유? 독립적인 형태랬는데?_같은 것을 쳐다보고 있다는 것. (얕은 복사)
		
	}

}
