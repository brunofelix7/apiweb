package br.com.fabricadeprogramador.model;

public class ServerResponse {
	
	private String message;
	
	public ServerResponse(){
		
	}
	
	public ServerResponse(String message){
		super();
		this.message = message;
	}
	
	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}

}
