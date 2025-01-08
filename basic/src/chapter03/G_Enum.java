package chapter03;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

// 열거형(Enum): 서로 관련된 상수들의 집합을 나타내는 특수한 클래스
// enum 열거형타입이름 { 상수... }

enum Color1 {
	// 지정하고자하는 상수를 ,로 나열
	RED, ORANGE, YELLOW, GREEN, BLUE, NAVY, PURPLE
}

enum Color2 {
	// 생성자 호출을 열거된 상수 위치에서 호출함 (아래 private Color2(Sstring hex, String rgb) 에 맞게 입력해둔)
	RED("#ff0000", "rgb(255, 0, 0)"),
	GREEN("#00ff00", "rgb(0, 255, 0)"),
	BLUE("#0000ff", "rgb(0, 0, 255)"); //생성되어 있는 얘들을 통해서 enum 은 사용하게 된다는 원래 new 하는 것 대신에
	
	// 열거형도 클래스이기 때문에 필드, 생성자, 메서드 모두 가질 수 있음
	// enum의 필드는 상수로 사용되기 때문에 변경되면 안됨
	// 그래서 캡슐화 작업이 필요하다
	private final String hex; /*상수로 사용될 것이기에 private에 final까지 하면 좀 더 괜찮긴 함.*/
	private final String rgb;
	
	// 생성자의 접근제어자 private
	// 인스턴스 생성 자체를 외부에서 못하도록 막는 것(다른 네트워크를 통해서 인스턴스를 형성할 수 있도록 해주는)
	private Color2(String hex, String rgb) { /*클래스와 같은 이름으로 생성자 만들어줌*/
		this.hex = hex; // 각 생성자에 내용이 뭔지 this로 지정해주는
		this.rgb = rgb;
	}
	public String getHex() {
		return hex;
	}
	
	public String getRgb() {
		return rgb;
	}
}

public class G_Enum {

	public static void main(String[] args) {
		
		Color1 color1 = Color1.GREEN;
		System.out.println(color1);
		
		// 열거형을 사용하면 조건 비교(동등 비교)에 편하게 사용가능 
		if (color1 == color1.GREEN) {
			System.out.println("초록색!");
		}
		
		// 열거형을 사용하면 상수를 묶음으로 관리할 수 있음
		Color2 color2 = Color2.BLUE;
		System.out.println(color2);
//		System.out.println(color2.hex);  위에 private 로 캡슐화 했기에 이렇게 쓸 수 ㅇ벗는
//		System.out.println(color2.rgb);
//		color2.hex = "#000099";
//		System.out.println(color2.hex);
		
		System.out.println(color2.getHex());
		
		LocalDateTime localDateTime = LocalDateTime.now();
		Month month = localDateTime.getMonth();
		
		switch(month) {
		case Month.APRIL:
			System.out.println("작업");
		}
		
	}

}
