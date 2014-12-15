package command;

public class Client {
	
	public static void main(String args[]){
		
		System.out.println("Command pattern");
		
		Television tv = new Television();
		
		Command turnOn = new TurnOn(tv);
		
		Command turnOff = new TurnOff(tv);
		
		Remote remote = new Remote();
		
		remote.setCommand(turnOn);
		
		remote.pressButton();
		
		remote.setCommand(turnOff);
		
		remote.pressButton();
		
	}

}