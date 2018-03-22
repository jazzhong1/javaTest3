package ncs.test13;


public class AmountNotEnough extends Exception{
	private String message;

	
	@Override
	public String getMessage() {
		return message;
	}


	public AmountNotEnough(String message) {
		this.message=message;
		
	}
	
}
