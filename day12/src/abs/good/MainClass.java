package abs.good;

public class MainClass {
	public static void main(String[] args) {
		
		/*
		 * 1. 추상클래스(추상메서드)를 사용하면, 오버라이딩이 강제화 되기 때문에 프로그래머의 실수를 줄일 수 있습니다.
		 * 2. 추상클래스(추상메서드)를 사용하면, 다형성의 형태를 보다 안전하게 사용할 수 있습니다.
		 * 
		 */
		
		
		// 불안정한 클래스 이기에 객체 생성을 할 수 없다.
		// HeadStore h = new HeadStore();
		// 이렇게는 가능.Store 에 불안정한 부분이 오버라이딩 되어 있어 안정되어서
		HeadStore h = new Store();
		
		// 재정의를 빼먹었다면,잘못된 메서드의 실행으로 이어질 수도 있다는 뜻
		Store s = new Store();
		System.out.println("상호명 : " + s.getName());
		s.apple();
		s.bnanan();
		s.melon();
		s.orange();
		
		System.out.println();
		
		System.out.println("상호명 : " + h.getName());
		h.apple();
		h.bnanan();
		h.melon();
		h.orange();
		
		System.out.println("-------------------------------");
		
		HeadStore h2 = new Store2();
		Store2 s2 = new Store2();
		System.out.println("상호명 : " + s2.getName());
		s2.apple();
		s2.bnanan();
		s2.melon();
		s2.orange();
		
		System.out.println();
		
		System.out.println("상호명 : " + h2.getName());
		h2.apple();
		h2.bnanan();
		h2.melon();
		h2.orange();
	}
}
