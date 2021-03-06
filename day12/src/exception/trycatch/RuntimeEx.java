package exception.trycatch;

public class RuntimeEx {
	public static void main(String[] args) {

		// 실행 예외의 대표적인 종류
		// ArrayIndex
		// int[] arr = { 1, 2, 3, 4, 5 };
		// System.out.println(arr[5]); //문법상은 틀리지 않았기에 빨간줄 x
		/*
		 * 실행시,
		 * Exception in thread "main"
		 * -에러 공간
		 * java.lang.ArrayIndexOutOfBoundsException: 5
		 * -에러 내용
		 * at exception.trycatch.RuntimeEx.main(RuntimeEx.java:9)
		 * -9 번째 줄에서 에러 발생
		 */

		// ClassCasting
		// String s = (String) new Object();

		// NumberFormat
		// String s = "10-";
		// int num = Integer.parseInt(s);
		// System.out.println(num);
		/*
		 * Exception in thread "main" java.lang.NumberFormatException: For input string: "10-"
		 * at java.lang.NumberFormatException.forInputString(Unknown Source)
		 * at java.lang.Integer.parseInt(Unknown Source)
		 * at java.lang.Integer.parseInt(Unknown Source)
		 * at exception.trycatch.RuntimeEx.main(RuntimeEx.java:25)
		 */

		// NullPointer
		String s = null;
		s.charAt(10);
		/*
		 * Exception in thread "main" java.lang.NullPointerException
		 * at exception.trycatch.RuntimeEx.main(RuntimeEx.java:37)
		 */
	}
}
