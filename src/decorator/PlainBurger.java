package decorator;

public class PlainBurger implements Burger{

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "This is a Plain Burger";
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return 5.00;
	}

}
