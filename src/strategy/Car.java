package strategy;

public class Car implements Strategy{
	@Override
	public void transportPassenger(String passengerName) {
		System.out.println("Hey, I'm a car and I'm taking Passenger " + passengerName + " home!");
	}
}
