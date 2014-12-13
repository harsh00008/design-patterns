package observer;

public class HouseA implements Observer{

	@Override
	public void update() {
		System.out.println("New Mail received at House A");
	}

}
