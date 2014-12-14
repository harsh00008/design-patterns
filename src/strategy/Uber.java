package strategy;

public class Uber implements Strategy{

	@Override
	public void transportPassenger(String passengerName) {
		System.out.println("I'm a uber driver. Taking " + passengerName + " home.");
	}

}
