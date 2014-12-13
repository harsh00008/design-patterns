package observer;

public class Client {
	
	public static void main(String args[]){
		System.out.println("Observer Pattern");
		MailBox mailBox = new MailBox();
		
		Observer houseA = new HouseA();
		
		Observer houseB = new HouseB();
		
		mailBox.addObserver(houseA);
		
		mailBox.addObserver(houseB);
		
		mailBox.newMail();
		
		mailBox.newMail();
		
		mailBox.newMail();
		
		
	}
	
}
