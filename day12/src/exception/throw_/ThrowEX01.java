package exception.throw_;

public class ThrowEX01 {
	public static void main(String[] args) {
		/*
		 * 예외 생성하기 (throw new)
		 * - 메서드 실행도중에 throw 키워를 만나면 즉시 throw로 생성한 예외가 발생된다.
		 * - 예외가 발생되면 실행된 코드는 즉시 중단되고, 예외를 처리할 수 있는 catch문으로 이동합니다.
		 * - 즉, 예외발생시 반환 여부와 상관 없이 메서드를 강제 종료할 때 사용할 수 있습니다.
		 * 
		 */
		try {
			System.out.println("결과 : " + calc(10));
			System.out.println("결과 : " + calc(-10));
		} catch (Exception e) {
			// System.out.println("반드시 양수값을 전달해야 합니다.");
			// System.out.println(e.getMessage());	// 예외 발생시 전달할 예외 메시지 얻어오는 기능.
			e.printStackTrace();	// 예외의 경로를 추적하는 메세지를 출력합니다 (예외의 원인을 찾을때 매번 사용됩니다.)
		}
		
		System.out.println("프로그램 정상 종료");
	} // main end

	public static int calc(int n) throws Exception {
		if (n < 0) {
			throw new Exception("반드시 양수값을 전달해야 합니다."); // 예외 생성
		}
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		return sum;
	} // calc end

}
