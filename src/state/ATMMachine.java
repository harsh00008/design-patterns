package state;

public class ATMMachine{
	State noCash;
	State hasCash;
	State hasPin;
	State dispenseCash;
	State currentState;
	boolean isPinCorrect = false;
	
	int cash;
	
	public ATMMachine(){
		cash = 0;
		noCash = new NoCash(this);
		hasCash = new HasCash(this);
		hasPin = new HasPin(this);
		dispenseCash = new DispenseCash(this);
		currentState = noCash;
	}
	
	public void setCurrentState(State state){
		currentState = state;
	}
	
	public State getCurrentState(){
		return currentState;
	}
	
	public int getCash(){
		return cash;
	}
	
	public boolean isValidPin(int pin){
		if(pin == 144 ){
			isPinCorrect = true;
			return true;
		}
		isPinCorrect = false;
		return false;
	}

	
	public void redeem(int amount) {
		currentState.dispenseCash(amount);	
	}

	
	public void addCash(int amount) {
		cash = amount;
		currentState.loadCash(amount);
	}

	
	public void enterAtmPin(int pin) {
		currentState.enterPin(pin);
	}
	
}
