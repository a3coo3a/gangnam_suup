package quiz15;

public class MainClass {
	public static void main(String[] args) {
		Marine m = new Marine();
		Tank t = new Tank();
		DropShip d = new DropShip();
		
		m.location();
		t.location();
		d.location();
		
		m.move(3, 4);
		m.location();
		t.move(4, 3);
		t.location();
		
		d.ride(m);
		d.ride(t);
		
		d.move(5, 5);
		d.location();
		m.location();
		t.location();
		
		d.ride(t);
		d.ride(m);
		d.ride(m);
		d.ride(m);
		d.ride(m);
		
	}
}
