package inter.basic;
import java.io.*;
public class MainClass {
	public static void main(String[] args) {

		Basic b = new Basic();
		b.method1();
		b.method2();
		b.method3();
		System.out.println(b.PI);
		System.out.println(b.ABC);

		System.out.println(Inter1.PI);
		System.out.println(Inter2.ABC);

		System.out.println("----------------------------");
		/*
		 * 인터페이스도 하나의 데이터 타입이 될 수 있습니다 
		 * 인터페이스를 부모형 타입으로 사용할 때, 다형성의 형태와 동일하게 실행
		 * 
		 */
		Inter1 i1 = b; // Inter1 i1 = new Basic(); 과 같음.
		i1.method1(); // 1번 메소드만 사용가능

		Inter2 i2 = b;
		i2.method2(); // 2번 메소드만 사용가능

		// 인터페이스도 클래스 캐스팅 사용 가능
		Basic bb = (Basic) i1;
		
		String ss = new String("홍길동");
		Serializable sss = new String("홍길동");
		
		
	}
}
