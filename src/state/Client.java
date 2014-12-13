package state;

public class Client {
	public static void main(String args[]){
		ATMMachine atm = new ATMMachine();
		System.out.println("Check ATM Cash :" + atm.getCash());
		atm.addCash(100);
		System.out.println("Check ATM Cash :" + atm.getCash());
		atm.redeem(100);
		atm.enterAtmPin(144);
		atm.redeem(120);
		
	}
}
