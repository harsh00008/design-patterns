package state;

public class HasCash implements IState{
	
	ATMMachine atmMachine;
	
	public HasCash(ATMMachine atmMachine){
		atmMachine = atmMachine;
	}

	@Override
	public void dispenseCash() {
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

	@Override
	public void loadCash(int amount) {
		// TODO Auto-generated method stub
		
	}

}