package factory;

public class ConcreteCoinFactory implements ICoinFactory{
	Coin coin;
	public Coin createCoins(int choice) {
		switch(choice){
		case 1: 
			coin = (Coin) new Cent();
		break;
			
		case 2:
			coin = (Coin) new Dollar();
		break;
		default:
			coin = (Coin) new Dollar();
		}
		return coin;
	}
	
}
