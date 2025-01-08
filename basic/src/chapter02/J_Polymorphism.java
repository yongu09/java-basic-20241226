package chapter02;

// 다형성: 하나의 표현으로 여러가지 형태를 나타낼 수 있는 것

// 오버로딩(Overloading): 같은 클래스 내에서 동일한 이름의 메서드를 여러개 정의할 수 있는 것
// 오버라이딩(Overriding): 자손 클래스에서 조상 클래스에 정의된 메서드를 재정의 하는 것
// 업캐스팅은 Object 클래스를 모든 클래스가 상속받고 있기에 가능
// 업캐스팅: 하위 클래스의 객체를 상위 클래스 혹은 구현한 인터페이스의 타입에 참조변수로 저장하는 것(관리하는 것)_자동으로 일어남-상속, 추상화가 들어있는 녀석들만 대상으로 가능.
// 다운캐스팅: '업캐스팅된' 객체를 다시 원래 타입의 변수에 담는 것(꼭 원래 타입에 담는 것은 아니지만) 

class People {
	String name;
	int age;
	
	People(String name, int age) {
		this.name = name;
		this.age = age;
	}
}

class Teacher extends People {
	
	String subject;
	
	Teacher(String name, int age, String subject) {
		super(name, age);
		this.subject = subject;
	}
}
class Student extends People {
	int grade;
	
	Student(String name, int age, int grade) {
		super(name,age);
		this.grade = grade;
	}
	
}

public class J_Polymorphism {

	public static void main(String[] args) {
		
		People people1 = new People("이성계", 20);
		Teacher teacher1 = new Teacher("이방과", 30, "역사");
		Student student1 = new Student("이방원", 15, 3); //new ~ 쓴걸로 인스턴스가 생성됨. 그리고 앞 student1_참조변수에 주소가 들어감.
		
		People people2 = teacher1; //teacher1은 teacher1의 주소를 people2에 넣은 상황이 되는 것임.(이건 업캐스팅 한 사례)
		System.out.println(people2.name);
		System.out.println(people2.age);
		// System.out.println(people2.subject); < subject가 원래 있는 주소에는 그대로 있으나 people2 보는 것에서는 시야를 차단해둬서 못보는
		
		// 다운캐스팅 : (이미 업캐스팅이 되어 있어야 함)이미 업캐스팅 된 people2를 teacher2에 넣어보는 것 할거임
		Teacher teacher2 = (Teacher)people2; //Teacher를 강제로 주입하게 되는(people2보다 더 큰 사이즈다보니 형변환때처럼)
		System.out.println(teacher2.name);
		System.out.println(teacher2.age);
		System.out.println(teacher2.subject);
		
		// 업캐스팅이 되지 않은 참조변수에 대해서는 다운캐스팅 작업시 예외가 발생한다.
		// Student student2 = (Student)people1; // people1으로 넘기려니 안되어서 (Student)해서 강제로 넣게 하는 >그런데 위 이유로 인해 다운캐스팅 안됨.
		
		// Object를 활용한 업캐스팅 다운캐스팅 _ 모든 클래스는 Object 클래스로 업캐스팅 가능함.
		Object object1 = student1;
		Student student2 = (Student)object1;

	}

}
