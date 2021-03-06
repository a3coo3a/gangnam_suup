package inter.basic2;

public class MainClass {
	public static void main(String[] args) {
		
		Animal baduk = new Dog();
		Animal nabi = new Cat();
		Animal hodol = new Tiger();
		
		// 1. Animal 배열을 생성해서 baduk, nabi, hodol를 저장하고
		// 공통기능 출력
		Animal[] animals = {baduk, nabi, hodol};
		
//		for (int i = 0; i < animals.length; i++) {
//			animals[i].eat();
//		}
		
		for (Animal animal : animals) {
			animal.eat();
		}
		
		// 2. IPet 배열을 생성한 후 baduk, nabi, 금붕어를 저장하고, 
		// 향상된 포문으로 IPet의 기능을 사용
		// 캐스팅을 해야함.
			Fish bbombbom = new GoldFish();
			IPet[] ipets = {(Dog)baduk, (Cat)nabi, (GoldFish)bbombbom};
			PetShop store = new PetShop();
			store.for_IPetMethod(ipets);
			store.carePet(ipets[0]);
			store.carePet((Cat)nabi);
			//store.carePet((Tiger)hodol);	// IPet을 상속 받지 않았기에 사용 불가
			
		// 3. 
	}
}
