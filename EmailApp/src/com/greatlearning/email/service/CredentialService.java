package com.greatlearning.email.service;

import com.greatlearning.email.model.Employee;

public interface CredentialService {
	
	public String generateEmailAdress (Employee e, String department);
	public char[] generatePassWord();
	public void showCredentials(Employee e, String email,char[] password);

}
