package command;

public class TurnOff implements Command{
	
	Television television;
	
	public TurnOff(Television tv){
		television = tv;
	}

	@Override
	public void execute() {
		television.turnOff();
	}

}
