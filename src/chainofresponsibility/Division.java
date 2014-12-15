package chainofresponsibility;

public class Division implements Operation{

	Operation next;
	
	@Override
	public void nextHandle(Operation o) {
		// TODO Auto-generated method stub
		next = o;
	}

	@Override
	public void executeRequest(String request) {
		if(request.equals("Division")){
			System.out.println("Division request executed");
		}else{
			next.executeRequest(request);
		}
	}

}
