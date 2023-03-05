package com.example.rest.dto.response;

import lombok.Data;

@Data
public class SignupResponse {
	
	private String message;

	public SignupResponse(String message) {
		this.message = message;
	}
	
	

}
