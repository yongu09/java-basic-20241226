package chapter02;

// 캡슐화: !!!인스턴스 필드와 메서드를 하나로 묶어서!!! 필드에 대한 조작을 메서드르 통해서만 하도록 하는 것
// 정보 은닉과 데이터 보호, 데이터 무결성(정확한 값이 들어가게하는)을 보장할 수 있음

// Entity: 데이터베이스의 레코드를 관리하는 객체
// (생성자와 Getter 만 유지하는 방식을 권장)_setter를 가지고 있기도 함.
// DTO (Data Transfer Object): 데이터 전송을 위한 객체
// (불변성: 생성자와 Getter 만 유지 / 가변성: 생성자와 Getter Setter 모두 유지)_가변성을 인정해줌.
// VO (Value Object): 값을 표현하는 객체 _ 가변성을 인정하지 않기 때문에
// (생성자와 Getter 만 유지, Object 클래스의 equals() 메서드를 오버라이딩 해서 사용)
class Player {
	private String name;
	private String team;
	private String birth;
	private int number;
	//생성자는 클래스명과 동일하게 써주고 
	Player(String name, String team, String birth, int number) {
		this.name = name;
		this.team = team;
		this.birth = birth;
		this.number = number < 0 ? 0 : number; // 필드의 조작을 메서드를 통해서 할 수 있게 해주는 것들임.
	}
	// 값을 불러와서 쓸 수 있게 만들어주는 것이 getter 메서드
	// getter 메서드:  캡슐화에서 private 필드의 값을 반환하는 메서드, 접근제어자의 경우 public을 많이 쓰나 
	String getName() {
		return name;
	}
	String getTeam() {
		return team;
	}
	String getBirth() {
		return birth;
	}
	int getNumber() {
		return number;
	}

	// setter 메서드: 캡슐화에서 private 필드의 값을 변경하는 메서드 _변경하면 끝이니(이전에 뭐였는지 안중요) 반환타입이 없다_void로 반환타입을 지정
	void setName(String name) {
		this.name = name;
	}
	void setTeam(String team) {
		this.team = team;
	}
	void setNumber(int number) {
		this.number = number < 0 ? 0 : number;
	}
	
}

class King {
	private String ho;
	private String name;
	
	public King(String ho, String name) {
		this.ho = ho;
		this.name = name;
	}

	public String getHo() {
		return ho;
	}

	public void setHo(String ho) {
		this.ho = ho;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}

public class G_Encapsulation {

	public static void main(String[] args) {
		
//		Player player1 = new Player();
//		player1.name = "이성계";
//		player1.team = "조선";
//		player1.birth = "1335-11-04";
//		player1.number = 1;
		
		Player player1 = new Player("이성계","조선","1335-11-04",1); // 이렇게 인스턴스가 초기화 되어서 만들어짐
		System.out.println(player1.getName());
		System.out.println(player1.getNumber());
		
		player1.setName("고려");
		System.out.println(player1.getTeam());
		
	}

}
