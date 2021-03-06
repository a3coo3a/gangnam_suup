package abs.good;

// 추상클래스 상속시 오류 해결 방법
// 1. 서브클래스도 추상클래스로 변경
// 2. 오버라이딩을 통해 추상메서드 재정의

public class Store extends HeadStore {
	
	// 생략
	public Store() {
		super();
	}

	@Override
	public void apple() {
		System.out.println("서울 지점 사과 500원");
	}

	@Override
	public void bnanan() {
		System.out.println("서울 지점 바나나 700원");
	}

	@Override
	public void melon() {
		System.out.println("서울 지점 멜론 900원");
	}

	@Override
	public void orange() {
		System.out.println("서울 지점 오렌지 1000원");
	}

}
