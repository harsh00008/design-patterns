package state;

public class HasPin implements State{

	ATMMachine tempAtmMachine;
	
	public HasPin(ATMMachine atmMachine){
		tempAtmMachine = atmMachine;
	}
	
	@Override
	public void dispenseCash(int amount) {
		if(tempAtmMachine.isPinCorrect){
			System.out.println("Dispensing Cash");
			if( (tempAtmMachine.cash - amount) >= 0 ){
				System.out.println("Take your cash of $"+amount);
				if( tempAtmMachine.cash == 0 ){
					tempAtmMachine.setCurrentState(tempAtmMachine.noCash);
				}
			}else{
				System.out.println("You cannot withdraw more than $" + tempAtmMachine.cash);
			}
		}
	}

	@Override
	public void enterPin(int pin) {
		System.out.println("Illegal Operation");
	}


	@Override
	public void loadCash(int amount) {
		System.out.println("Illegal Operation");
	}

}
