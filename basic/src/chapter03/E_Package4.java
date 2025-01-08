package chapter03;

import java.util.Random;
import java.util.UUID;

public class E_Package4 {

	public static void main(String[] args) {
		
		// Random 클래스 : 난수를 생성하는 클래스
		Random random/*참조변수 만들어주고*/ = new Random();
		System.out.println(random.nextInt());
		// 범위 제약
		System.out.println(random.nextInt(5));
		System.out.println(random.nextInt(-9, 10));
		
		// SEED 지정 _ 컴퓨터는 난수를 생산하지 못하는데 우리가 임의로 난수를 지정해줌
		random = new Random(100);
		System.out.println(random.nextInt());
		System.out.println(random.nextInt());
		
		// UUID: 128비트의 고유 식별자 (시리얼 번호 같은 것 만드는데 쓰는)(소프트웨어에서 식별자의 표준)
		// 32개의 16진수로 나타나고 4개의 하이픈으로 나누어짐 (!!UUID 굉장히 많이 쓴다는)
		// 3.4 * 10^38개의 고유 값을 가질 수 있음_(중복될 일이 거의 없단 의미)
		String uuid = UUID.randomUUID().toString();
		System.out.println(uuid);
		
		
	}

}
