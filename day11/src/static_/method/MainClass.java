package static_.method;

public class MainClass {

	int x;
	
	
	public static void main(String[] args) {
		// 정적 메서드
		// - static이 붙은 변수나 메서드만 사용이 가능,
		// - 단, 객체 생성을 통해서는 일반 변수도 사용이 가능.
		// 결국 메인메서드도 정적 메서드 이다!! 그래서 그래서 static이 없어서 new로 객체를 만들어 사용한 것
		
		
		Count.b++;
		Count.method2();
		
		Count c = new Count();
		c.a = 10;
		c.method1();
		
		MainClass m = new MainClass();
		m.x = 10;
		// 이렇게 사용해야함.
		// - 바로 사용하려면 static int x;로 선언해 주어야함.
		
		
		 System.out.println(Count.b);
	}

}