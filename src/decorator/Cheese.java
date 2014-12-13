package decorator;

public class Cheese extends BurgerDecorator{

	Burger tempBurger;
	
	public Cheese(Burger newBurger) {
		super(newBurger);
		tempBurger = newBurger;
	}
	
	public String getDescription(){
		return tempBurger.getDescription() + " , Adding some cheese";
	}
	
	public double getCost(){
		return tempBurger.getCost() + 1.00;
	}
	
}
