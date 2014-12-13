package observer;

import java.util.ArrayList;

public class MailBox implements Subject{
	
	ArrayList<Observer> observerList;
	
	public MailBox(){
		observerList = new ArrayList<Observer>();
	}
	
	
	public void newMail(){
		notifyObserver();
	}

	@Override
	public void addObserver(Observer o) {
		observerList.add(o);
		
	}

	@Override
	public void removeObserver(Observer o) {
		int index = observerList.indexOf(o);
		observerList.remove(index);
		System.out.println("Observer Deleted");
	}

	@Override
	public void notifyObserver() {
		// TODO Auto-generated method stub
		for(Observer o : observerList){
			o.update();
		}
		
	}

}
