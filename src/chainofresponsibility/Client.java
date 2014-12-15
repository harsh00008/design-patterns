package chainofresponsibility;

public class Client {
	
	public static void main(String args[]){
		System.out.println("Chain Of Responsibility v1");
		Operation addition = new Addition();
		Operation substraction = new Substraction();
		Operation division = new Division();
		addition.nextHandle(substraction);
		substraction.nextHandle(division);
		addition.executeRequest("Substraction");
		addition.executeRequest("Division");
	}
}
