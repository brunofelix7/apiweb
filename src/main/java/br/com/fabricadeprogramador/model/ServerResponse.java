package br.com.fabricadeprogramador.model;

public class ServerResponse {
	
	private String status;
	private String message;
	private String token;
	
	public ServerResponse(){
		
	}
	
	public ServerResponse(String message) {
		super();
		this.message = message;
	}

	public ServerResponse(String status, String message, String token) {
		super();
		this.status = status;
		this.message = message;
		this.token = token;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

}
