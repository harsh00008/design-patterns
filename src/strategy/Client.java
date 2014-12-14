package strategy;

public class Client {
	
	public static void main(String args[]){
		System.out.println("Strategy Pattern");
		
		Context context = new Context(new Car());
		context.takePassengerHome("Mr. Anderson");
		
		context = new Context(new Bus());
		context.takePassengerHome("Mr. Smith");
		
		context = new Context(new Uber());
		context.takePassengerHome("Miss. Elin");
	}

}
