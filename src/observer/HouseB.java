package observer;

public class HouseB implements Observer{

	@Override
	public void update() {
		System.out.println("New Mail received House B");
	}

}
