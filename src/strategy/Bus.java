package strategy;

public class Bus implements Strategy{

	@Override
	public void transportPassenger(String passengerName) {
		System.out.println("I'm a bus, and I'mtaking " + passengerName + " with me. Add a few more people please");
	}

}
