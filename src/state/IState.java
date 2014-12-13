package state;

public interface IState {
	public void dispenseCash();
	public void loadCash(int amount);
	public void enterPin(int pin);
	public void enterAmount(int amount);
}
