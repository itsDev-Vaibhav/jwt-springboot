package com.example.rest.dto.request;

import java.util.Set;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import lombok.Data;

@Data
public class SignupRequest {
	
	@NotEmpty(message = "First name can not be null or empty.")
	private String firstName;
	
	@NotEmpty(message = "Last name can not be null or empty.")
	private String lastName;
	
	@NotEmpty(message = "User name can not be null or empty.")
	private String userName;
	
	@NotEmpty(message = "Email can not be null or empty.")
	@Email
	private String email;
	
	@NotEmpty(message = "Password can not be null or empty.")
	private String password;
	
	@NotEmpty(message = "Phone can not be null or empty.")
	private String phone;
	
	private Set<RoleReq> role;
	

}
