package static_.field;

public class MainClass {
	public static void main(String[] args) {
		
		Count c1 = new Count();
		
		c1.a++;
		//c1.b++;
		Count.b++;		// static 변수 사용 방법
		
		System.out.println("일반 멤버변수 : " + c1.a);
		System.out.println("정적 멤버변수 : " + c1.b);
		System.out.println();
		
		Count c2 = new Count();
		c2.a++;
		c2.b++;
		
		System.out.println("일반 멤버변수 : " + c2.a);
		System.out.println("정적 멤버변수 : " + c2.b);
		System.out.println();
		
		Count c3 = new Count();
		
		c3.a++;
		c3.b++;
		
		System.out.println("일반 멤버변수 : "+ c3.a);
		System.out.println("정적 멤버변수 : "+ c3.b);
		
		System.out.println("------------------------");
		
		/*
		 * static은 클래스 밖에 1개 생성된다.
		 * 객체들 사이의 같은 값을 갖게 합니다.
		 * 객체생성 없이 "클래스이름.변수명"으로 사용합니다.
		 * 객체생성 없이 ==> new를 쓰지 않고도 사용이 바로 가능하다.
		 */
		
		
		
		c3.b = 100;
		System.out.println(c1.b);
		System.out.println(c2.b);
		System.out.println(c3.b);
	}
}
