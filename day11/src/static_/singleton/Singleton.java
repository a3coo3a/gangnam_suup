package static_.singleton;

public class Singleton {
	// 싱글톤패턴 : 객체가 1개만 생성되도록 클래스를 구성하는 방법

	// 1. 외부에서 객체 생성을 할 수없도록 생성자를 1개만 생성하고 private을 붙임
	private Singleton() {

	}
	// 2. 자신의 클래스에서 스스로의 객체를 1개 생성
	private static Singleton instance = new Singleton();		// 만드는데 계속 만들어지기때문에 무한생성되어 에러 
	// 이렇게만 하면 MainClass에서 Singleton.instance = null;로 없앨수 있기에 private으로 막음
	// 무한생성을 막고 1번만 만들어 내기 위해 static 붙임.
	
	// 3. 외부에서 이 클래스의 객체를 요구할 때 getter 메서드를 생성해서
	// 		2번에서 생성해둔 하나의 객체를 제공합니다.
	
	public static Singleton getInstance() {
		// 따로 객체를 생성할 수 없기에 클래스명으로 호출할 수 있도록 static을 붙여줌 
		return instance;
	}
	
	private String name = "홍길동";
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}








}
