package exception.trycatch;

import java.util.Scanner;

public class TryCatchEx03 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {
			try {
				System.out.print("> ");
				int num = sc.nextInt();
				System.out.println("입력결과 : " + num);
			} catch (Exception e) {
				System.out.println("숫자로 입력하실래요?");		// 엔터 값 때문에 계속 무한 루프가 도는 현상이 발생
				// nextLine() 은 엔터까지 다 받아들임
				// 엔터 제거후 다시 실행 
				sc.nextLine();
			}
		}
	}
}
