package static_.basic;

public class MainClass {
	public static void main(String[] args) {
		
		
		/*
		 * 1. 녹색 계산기와 빨강색 계산기를 각각 생성
		 * 2. pi값을 사용해서 원의 넓이를 확인
		 * 3. circle() 를 사용해서 원의 넓이를 확인
		 * 
		 */
		
		Calculator greenCal = new Calculator();
		greenCal.setColor("green");
		Calculator redCal = new Calculator();
		redCal.setColor("red");
		
		System.out.println("pi값을 사용해서 원의 넓이 : "+(5*5*Calculator.pi));
		
		System.out.println("circle()을 사용해서 원의 넓이 : "+Calculator.circle(5));
		
		String[] arr = new String[5];
		ArrayPrint.printArray(arr);
		// 생성자를 private하게 해두었기에 생성을 할 수 없음.
		//ArrayPrint arr1 = new ArrayPrint();		
	
	
	}
}
