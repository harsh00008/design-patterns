package decorator;

public class Client {
	public static void main(String args[]){
		System.out.println("Decorator Pattern");
		Burger burger = new PlainBurger();
		System.out.println("Default Burger");
		printBurger(burger);
		burger = new Cheese(new Sauce(new PlainBurger()));
		System.out.println("Decorated Burger");
		printBurger(burger);
	}
	
	public static void printBurger(Burger burger){
		System.out.println("Burger Description : " + burger.getDescription() + " \nBurger Cost :" + burger.getCost());
	}
}
