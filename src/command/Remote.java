package command;

public class Remote {
	
	Command command;
	
	public void setCommand(Command command){
		this.command = command;
	}
	
	public void pressButton(){
		command.execute();
	}
	
}
