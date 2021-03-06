package exception.multicatch;

public class MainClass {

	public static void main(String[] args) {
		/*
		 * main매서드 실행 매개값을 주는 방법
		 * run 탭 -> run configuration -> arguments
		 * -> ,대신 띄어쓰기 형태로 배열값 저장(고정값)
		 * 또는 ->${string_prompt} 실행할 인자값을 입력 받겠다
		 */
		// System.out.println(args[0]);
		// System.out.println(args[1]);
		// System.out.println(args[2]);

		try {
			String data1 = args[0];
			String data2 = args[1];

			int n1 = Integer.parseInt(data1);
			int n2 = Integer.parseInt(data2);

			System.out.println("두수의 합 : " + (n1 + n2));
		
			String s = null;
			s.charAt(0);
			
		} catch (ArrayIndexOutOfBoundsException e) {	// 실제 발생될 종류
			System.out.println("매개 값은 반드시 2개를 전달해 주세요.");
		} catch(NumberFormatException e) {
			System.out.println("매개 값은 반드시 숫자형태로 전달해 주세요");
		} catch(Exception e) {	// 모든 기타 예외 처리		// ctrl+t 상속 관계확인
			// Exception 은 모든 실행 예외의 부모 클래스 이기 때문에 모든 예외를 처리
			System.out.println("기타 예외 입니다.");		
		}

	}
	
}
