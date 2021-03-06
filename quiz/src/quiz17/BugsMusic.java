package quiz17;

public class BugsMusic implements SongList {

	private String[] list = new String[100];
	private int count = 0;

	/*
	 * SongList인터페이스를 상속받습니다. 마음대로~
	 * 
	 */
	@Override
	public void insertList(String song) {
		
		System.out.println("고음질로 음악을 저장합니다");
		list[count] = song;
		count += 2;

	}

	@Override
	public void playList() {
		System.out.println("순차적으로 재생합니다.");
		for (int i = 0; i < count; i++) {
			if(list[i] != null)
			System.out.println(list[i] + " 노래 재생");
		}
					
	}

	@Override
	public int playLength() {
		System.out.println("총 " + count/2 + "개의 음악이 저장되어 있습니다");
		return count/2;
	}

}
