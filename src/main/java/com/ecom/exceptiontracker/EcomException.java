package com.ecom.exceptiontracker;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class EcomException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	private String errorMessage;

	public EcomException(String errorMessage) {
		super();
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	
	
	
}
