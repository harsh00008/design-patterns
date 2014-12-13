package state;

public class DispenseCash implements State{

	ATMMachine tempAtmMachine;
	
	public DispenseCash(ATMMachine atmMachine){
		tempAtmMachine = atmMachine;
	}
	
	@Override
	public void dispenseCash(int amount) {
		System.out.println("Already dispensed cash");
	}
	
	@Override
	public void enterPin(int pin) {
		System.out.println("Illegal Operation");
	}
	
	@Override
	public void loadCash(int amount) {
		System.out.println("Cannot load money right now.");
	}

}
