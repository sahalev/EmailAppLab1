package com.greatlearning.email.service;

import java.util.Random;

import com.greatlearning.email.model.Employee;

public class CredentialServiceImpl implements CredentialService {

	@Override
	public String generateEmailAdress(Employee e, String department) {
		// TODO Auto-generated method stub
		return e.getFirstName().toLowerCase()+e.getLastName().toLowerCase()+"@"+department+".greatlearning.com";
	}

	@Override
	public char[] generatePassWord() {
		final String caps = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		final String small = "abcdefghijklmnopqrstuvwxyz";
		final String numbers = "0123456789";
		final String specialchar = "!@#$%&";
		String passwordRange=caps+small+numbers+specialchar;
		Random random = new Random();
		
		char[] password = new char[8];
		for (int i=0;i<8;i++)
		{
			password[i]=passwordRange.charAt(random.nextInt(passwordRange.length()));
		}
		return password;
				
	}

	@Override
	public void showCredentials(Employee e, String email, char[] password) {
		
		
		System.out.println("Dear "+e.getFirstName()+" "+e.getLastName()+" Your generated credentials are as follows");
		System.out.println("Email  -------> "+email);
		System.out.println("Password  -------> "+String.valueOf(password));
		
	}

	

}
