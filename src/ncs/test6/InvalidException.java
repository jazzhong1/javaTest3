package ncs.test6;

public class InvalidException extends Exception {
	
	private String message;
	
	
	@Override
	public String getMessage() {
		return message;
	}

	public InvalidException(String message) {
		this.message=message;
		
	}
	

	
	


	




	
	
}
