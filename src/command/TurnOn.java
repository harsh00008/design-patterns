package command;

public class TurnOn implements Command{
	
	Television television;
	
	public TurnOn(Television tv){
		television = tv;
	}

	@Override
	public void execute() {
		television.turnOn();
	}

}
