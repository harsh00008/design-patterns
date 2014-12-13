package adapter;

public class Client {
	public static void main(String args[]){
		System.out.println("Adapter Pattern");
		RocketShip rocketShip = new RocketShip();
		ShipAdapter shipAdapter = new ShipAdapter(rocketShip);
		System.out.println(shipAdapter.myName());
		System.out.println(shipAdapter.myStrength());
		System.out.println(shipAdapter.fire());
	}
}
