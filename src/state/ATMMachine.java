package state;

public class ATMMachine {
	IState noCash;
	IState hasCash;
	IState hasPin;
	IState dispenseCash;
	IState currentState;
	
	int cash;
	
	public ATMMachine(){
		cash = 0;
		noCash = new NoCash(this);
		hasCash = new HasCash(this);
		noCash = new NoCash(this);
		currentState = noCash;
	}
	
	public void setCurrentState(IState state){
		currentState = state;
	}
	
	public IState getCurrentState(){
		return currentState;
	}
}
