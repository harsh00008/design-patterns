package strategy;

public class Context {
	private Strategy transportType;
	
	public Context(Strategy strategy){
		transportType = strategy;
	}
	
	public void takePassengerHome(String passengerName){
		transportType.transportPassenger(passengerName);
	}
}
