package com.greatlearning.email.main;

import java.util.Scanner;

import com.greatlearning.email.model.Employee;
import com.greatlearning.email.service.CredentialService;
import com.greatlearning.email.service.CredentialServiceImpl;



public class EmailApp {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		 CredentialService credservice = new CredentialServiceImpl();
		 String dep="";
		 System.out.println("Please Enter your first name");
			String fName= sc.next();
			System.out.println("Please Enter your last name");
			String lName= sc.next();
			Employee e = new Employee(fName,lName);
			
			System.out.println("-----------------------------------------------");
			System.out.println("Please enter the department from the following");
			System.out.println("1. Technical");
			System.out.println("2. Admin");
			System.out.println("3. Human Resource");
			System.out.println("4. Legal");
			System.out.println("-----------------------------------------------");
			int department = sc.nextInt();
			switch(department){
			case 1:
				dep="tech";
				break;
			case 2:
				dep="admin";
				break;
			case 3:
				dep="hr";
				break;
			case 4:
				dep="legal";
				break;
			default :
				System.out.println("Enter valid Input");
				break;
			
			}
			e.setDepartment(dep);
			String emailaddress =credservice.generateEmailAdress(e, dep);
		
			
			credservice.showCredentials(e, emailaddress,credservice.generatePassWord());
			
			

	}

}
