package state;

public interface State {
	public void dispenseCash(int Amount);
	public void loadCash(int amount);
	public void enterPin(int pin);
}
