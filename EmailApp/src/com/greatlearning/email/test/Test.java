package com.greatlearning.email.test;

import java.util.Random;

public class Test {

	public static void main(String[] args) {
		
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
		System.out.println(password);
				

	}

}
