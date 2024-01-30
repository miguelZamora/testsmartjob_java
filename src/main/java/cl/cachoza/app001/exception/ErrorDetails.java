package cl.cachoza.app001.exception;

import java.util.Date;

public class ErrorDetails {
	
	private String mensaje;
	private String details;

	public ErrorDetails(String mensaje, String details) {
		super();
		this.mensaje = mensaje;
		this.details = details;
	}

 
	public String getMensaje() {
		return mensaje;
	}

	public String getDetails() {
		return details;
	}
}