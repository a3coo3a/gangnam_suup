package abs.bad;

public class Store extends HeadStore{

	@Override
	public void apple() {
		System.out.println("서울 지점의 사과는 500원");
	}

	@Override
	public void bnanan() {
		System.out.println("서울 지점의 바나나는 700원");
	}

	@Override
	public void melon() {
		System.out.println("서울 지점의 멜론은 800원");
	}
	// 프래그래머가 실수로 메서드 재정의를 빼먹었다면??
	
	
}
