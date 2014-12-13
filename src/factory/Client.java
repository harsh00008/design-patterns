package factory;

public class Client {
	public static void main(String args[]){
		System.out.println("Factory pattern for coins.");
		ConcreteCoinFactory coinFactory = new ConcreteCoinFactory();
		Coin coin = coinFactory.createCoins(1);
		System.out.println(coin.myValue());
		coin = coinFactory.createCoins(2);
		System.out.println(coin.myValue());
	}
}
