package chainofresponsibility;

public class Substraction implements Operation{

	Operation next;
	
	@Override
	public void nextHandle(Operation o) {
		// TODO Auto-generated method stub
		next = o;
	}

	@Override
	public void executeRequest(String request) {
		if(request.equals("Substraction")){
			System.out.println("Substraction request executed");
		}else{
			next.executeRequest(request);
		}
	}

}
