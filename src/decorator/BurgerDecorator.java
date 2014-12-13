package decorator;

public abstract class BurgerDecorator implements Burger{
	protected Burger tempBurger;
	
	public BurgerDecorator(Burger newBurger){
		tempBurger = newBurger;
	}
	
	public String getDescription(){
		return tempBurger.getDescription();
	}
	
	public double getCost(){
		return tempBurger.getCost();
	}
	
}
