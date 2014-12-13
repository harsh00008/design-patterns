package decorator;

public class Sauce extends BurgerDecorator implements Burger{
	Burger tempBurger;
	public Sauce(Burger newBurger) {
		super(newBurger);
		tempBurger = newBurger;
	}

	public String getDescription(){
		return tempBurger.getDescription() + ", Added some sauce";
	}
	
	public double getCost(){
		return tempBurger.getCost() + 3.50;
	}
}
