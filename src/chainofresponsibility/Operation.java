package chainofresponsibility;

public interface Operation {
	
	public void nextHandle(Operation o);
	
	public void executeRequest(String request);

}
