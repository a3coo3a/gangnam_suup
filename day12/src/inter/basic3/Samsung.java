package inter.basic3;

public class Samsung implements Printed{

	@Override
	public void turnOn() {
		System.out.println("★★★ 삼성 ---------------------------");
		System.out.println("Hello~");
	}

	@Override
	public void turnOff() {
		System.out.println("★★★ 삼성 ---------------------------");
		System.out.println("Good Bye~ See You~");
	}

	@Override
	public void print(String document) {
		System.out.println("★★★ 삼성 ---------------------------");
		System.out.println("* 문서 내용 : " + document);
	}

	@Override
	public void colorPrint(String document, String color) {
		System.out.println("★★★ 삼성 ---------------------------");
		System.out.println(color + "으로 인쇄됩니다.");
		System.out.println("* 문서 내용 : " + document);
	}

	@Override
	public int copy(int n) {
		System.out.println("★★★ 삼성 ---------------------------");
		System.out.println(n + "장 인쇄 되었습니다.");
		return n;
	}

}
