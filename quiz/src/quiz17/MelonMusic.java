package quiz17;

public class MelonMusic implements SongList {

	private String[] list = new String[100];
	private int count = 0;
	/*
	 * SongList인터페이스를 상속받아서 기능을 구현합니다.
	 * insertList() 는 list배열에 순서대로 저장
	 * playList() list의 음악을 랜덤하게 출력
	 * playLength() 는 저장된 음악의 개수를 반환
	 */
	@Override
	public void insertList(String song) {
		list[count] = song;
		count++;
	}
	@Override
	public void playList() {
		// 100이 아닌 count 값으로 곱하면 랜덤숫자가 저장되는게 한정됨.
		System.out.println("랜덤 재생합니다.");
		int playIndex = (int)(Math.random()*100);
		while(list[playIndex] == null) {
			playIndex = (int)(Math.random()*100);
		}
		System.out.println(list[playIndex]+" 노래 재생");
		
		
	}
	@Override
	public int playLength() {
		System.out.println("총 " + count + "개의 음악이 저장되어 있습니다");
		return count;
	}
	
	
	
}
