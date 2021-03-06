package exception.throws_;

public class MainClass {
	public static void main(String[] args) { // main에서 throws하면 JVM에게 넘어감.
		try {
			new ThrowsEx02();
		} catch (Exception e) {
			System.out.println("예외발생");
		}

		/*
		 * bbb메서드를 try-catch로 처리시 메서드 끝까지 처리
		 * 생성자 호출
		 * aaa호출
		 * bbb호출
		 * bbb종료
		 * aaa종료
		 * 생성자 종료
		 * 
		 */

		/*
		 * throws로 넘길시 - 예외가 잡혀 넘어가기때문에 아래쪽들이 실행이 되지 않음.
		 * - 예외 발생시 잘못될 수도 있으니 그 뒤에는 실행 하지 않음.
		 * 생성자 호출
		 * aaa호출
		 * bbb호출
		 * 예외발생
		 * 
		 */

	}
}
