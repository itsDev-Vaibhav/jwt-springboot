package com.example.rest.dto.response;

import java.util.List;

import lombok.Data;

@Data
public class LoginResponse {

	private String token;
	private String type = "Bearer";
	private Long id;
	private String username;
	private String email;
	private List<String> roles;
	
	
	public LoginResponse(String token, Long id, String username, String email, List<String> roles) {
		this.token = token;
		this.id = id;
		this.username = username;
		this.email = email;
		this.roles = roles;
	}
	
	
	
	

}
