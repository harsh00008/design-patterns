package chainofresponsibility;

public class Addition implements Operation{

	Operation next;
	
	@Override
	public void nextHandle(Operation o) {
		// TODO Auto-generated method stub
		next = o;
	}

	@Override
	public void executeRequest(String request) {
		if(request.equals("Add")){
			System.out.println("Addition request executed");
		}else{
			next.executeRequest(request);
		}
	}

}
