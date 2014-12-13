package state;

public class NoCash implements State{
	
	ATMMachine tempAtmMachine;
	
	public NoCash(ATMMachine atmMachine){
		tempAtmMachine = atmMachine;
	}

	@Override
	public void dispenseCash(int amount) {
		System.out.println("Opps. I have no money to dispense");
	}

	@Override
	public void loadCash(int cash) {
		System.out.println("Added $" + cash + " Cash to ATM");
		tempAtmMachine.setCurrentState(tempAtmMachine.hasCash);
	}

	@Override
	public void enterPin(int pin) {
		System.out.println("I'm sorry, the machine is out of cash!");
	}


}
