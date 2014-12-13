package adapter;

public class ShipAdapter implements IShipAdapter{

	RocketShip rocketShip;
	
	public ShipAdapter(RocketShip ship){
		rocketShip = ship;
	}
	
	@Override
	public String myName() {
		return rocketShip.myName();
	}

	@Override
	public String myStrength() {
		return rocketShip.strongPoints();
	}

	@Override
	public String fire() {
		Integer fire = rocketShip.fire();
		return fire.toString();
	}

}
