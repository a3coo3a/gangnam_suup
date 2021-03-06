package quiz15;

public class Marine extends Unit {
	static int attack = 6;
	static int armor = 0;

	public Marine() {
		super(0, 0, 60);
	}
	
	/*
	 * location()의 기능
	 * - 마린의 현재 위치를 x, y의 출력
	 */
	
	@Override
	public void location() {
		System.out.println("Marine의 현재 위치는");
		System.out.println("x : " + getX() + ", y:" + getY());
		System.out.println("----------------------");
	}

	/*
	 * move()의 기능
	 * 1. 현재좌표값에서 매개변수의 좌표만큼의 이동한거리를 구한다.
	 * 		루트근사값은 Math.sqrt(제곱근)을 이용하면 됩니다.
	 * 
	 * 2. 현재의 좌표값으로 매개변수의 좌표값으로 변경
	 * 3. 이동한 거리를 정수형으로 출력
	 */
	
	@Override
	public void move(int x, int y) {
		int moveX = x-getX();
		int moveY = y-getY();
		double distance = Math.sqrt(moveX^2 + moveY*moveY);	// 이동거리
		setX(x);
		setY(y);
		System.out.println("Marine 이동 거리 : " + (int) distance);
		System.out.println("----------------------");
	}

	
}
