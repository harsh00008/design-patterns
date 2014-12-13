package state;

public class HasCash implements State{
	
	ATMMachine tempAtmMachine;
	
	public HasCash(ATMMachine atmMachine){
		tempAtmMachine = atmMachine;
	}

	@Override
	public void dispenseCash(int amount) {
		System.out.println("Please enter your pin first");
	}

	@Override
	public void enterPin(int pin) {
		System.out.println("Entered pin : " + pin);
		if( tempAtmMachine.isValidPin(144) ){
			System.out.println("Correct Pin");
			tempAtmMachine.setCurrentState(tempAtmMachine.hasPin);
		}else{
			System.out.println("Wrong Pin. Try again");
		}
	}

	@Override
	public void loadCash(int amount) {
		// TODO Auto-generated method stub
		
	}

}
