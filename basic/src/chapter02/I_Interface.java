package chapter02;

// 인터페이스: 클래스가 구현해야만 하는 메서드들의 집합을 정의해둔 것 (이 기능을 만들어야 한다. 라면서 기능을 정의해둔 것. 약속해둔 것)
// 인터페이스의 모든 변수는 public static final 형태임
// 인터페이스의 모든 메서드는 public abstract 형태임
// 인터페이스는 다중 구현이 가능함

// 인터페이스는 개발자간의 상호 약속을 위한 수단으로 사용됨
// 기능, 상수들에 대한 약속을 정의함

// 접근제어자 interface 인터페이스명 { ... }
interface AreaCalculation {
	// 변수는 반드시 public static final 이기 떄문에 생략을 해도 됨.
	/*public static final*/ double PI = 3.14;//파이 숫자를 고정되게 해줘야. 모두가 같은 값으로 쓰게, 누구는 3.141 까지 쓴다거나 하지 않게 !약속!을 먼저 해두는.
	
	// 메서드는 반드시 public abstract 이기 떄문에 생략을 해도 됨 (기본이 public abstract)
	/*public abstract*/ double getTriangleArea(double bottom, double height); // abstract로 정의했기에 ;(세미콜론)으로 끝내야함.
	double getRectangleArea(double bottom, double height);
	double getCircleArea(double radius); 
}	//이건 개발 직전에 미리 정해두고 이를 토대로 개발해보자 하고 틀을 만드는 역할을 하는 인터페이스(기능)

interface NormalCalculation {
	double add(double a, double b);
}

// 인터페이스는 인터페이스끼리 확장(상속)이 가능함
// 인터페이스의 확장(상속)은 다중 상속이 가능함 // 클래스들끼리는 다중 상속이 안되지만 인터페이스 간에는 다중 상속이 가능한._구현부가 없기 때문에(다이아몬드문제는 구현부가 있어야)
interface Calculation extends AreaCalculation, NormalCalculation {
	
}

// 인터페이스는 implements 키워드를 이용하여 클래스에서 구현할 수 있음
// 인터페이스는 다중 구현이 가능함
class Calculator implements Calculation {//AreaCalculation, NormalCalculation {

	@Override
	public double getTriangleArea(double bottom, double height) {
		double triangleArea = bottom * height / 2;
		return triangleArea;
	}

	@Override
	public double getRectangleArea(double bottom, double height) {
		double rectangleArea = bottom * height;
		return rectangleArea;
	}

	@Override
	public double getCircleArea(double radius) {
		double circleArea = radius * radius * PI; // implements AreaCalculation 하고 있기에 PI 값도 같이 가지고 있음.
		return circleArea; // 인터페이스의 목적(왜 쓰는지)을 기억해두는 것이 좋음.
	}

	@Override
	public double add(double a, double b) {
		double result = a + b;
		return result;
	}
	
	
	
}

public class I_Interface {

	public static void main(String[] args) {
		

	}

}
