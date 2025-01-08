package chapter02_sub;

class Controller {
	Service service;
	
	Controller(Service service) {
		this.service = service; // 여기서도 서비스를 아래 서비스에서 받아온 서비스로 값을 대신하라(외부 주입)
	}
	
	void controllerMethod() {
		System.out.println("Controller A");
		service.serviceMethod();
	}
	
	void controllerMethod2() {
		System.out.println("Controller A2");
		service.serviceMethod2();
	}
}

class Service {
	//상위 모듈인 service가 하위 모듈인 repository에 의존하고 있어. 이렇다보니 불안정적인 내용이 존재하게 되는. '구체적인 클래스에 의존하는 것'
	IRepository repository; //클래스 내부에서 값을 넣는 것을 하고 있음 new Repository에 값을 넣고 있는 것인데 Service 클래스 안에서함
	
	Service(IRepository repository) {
		this.repository = repository; // 이렇게 외부 주입을 하게 되는.
	}
	
	void serviceMethod() {
		System.out.println("Service A");
		repository.repositoryMethod();
	}//의존하고 있다. 필요로 하고 있다.
	
	void serviceMethod2() {
		System.out.println("Service A2");
		repository.repositoryMethod2();
	}
}

interface IRepository {
	void repositoryMethod();
	void repositoryMethod2(); // 이런식으로 추상화를 시켜놓음
}

class Repository implements IRepository {
	
	public void repositoryMethod() {
		System.out.println("Repository A");
	}
	
	public void repositoryMethod2() {
		System.out.println("Repository A2");
	}
}
class Repository2 implements IRepository {
	
	public void repositoryMethod() {
		System.out.println("Repository B");
	}
	
	public void repositoryMethod2() {
		System.out.println("Repository A2");
	}
}

public class DIP { // DIP 의존성 역전의 원칙 _ 의존을 구체적인 것이 아닌 추상화된 것에 해서 유지보수에 아주 높은 영향을 미치는 것이 DIP .

	public static void main(String[] args) {
		
		Repository repository = new Repository();
		Repository2 repository2 = new Repository2();
		
		Service service = new Service(repository);
		Controller controller = new Controller(service); //안에서 결정하던 것을 밖에서 결정하게 바꾸면서 이렇게 변경한 것임.
		controller.controllerMethod();

	}

}
