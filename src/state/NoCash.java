package state;

public class NoCash implements IState{
	
	ATMMachine atmMachine;
	
	public NoCash(ATMMachine atmMachine){
		atmMachine = atmMachine;
	}

	@Override
	public void dispenseCash() {
		System.out.println("Opps. I have no money to dispense");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void loadCash(int cash) {
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterPin(int pin) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterAmount(int amount) {
		// TODO Auto-generated method stub
		
	}

}
