package com.greatlearninga.appa8;

import java.util.Scanner;

import com.greatlearninga.model.Employeea;
import com.greatlearninga.servicea.EmpCredentialsAImplA;

public class DriverAppa {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter the first name");
		String f=sc.next();
		System.out.println("please enter the last name");
		String l=sc.next();
		
		Employeea emp1=new Employeea(f,l);
		EmpCredentialsAImplA cred=new EmpCredentialsAImplA();
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. HR");
		System.out.println("4. Legal");
		
		System.out.println("Please choose your department");
		int choice=sc.nextInt();
		String genEmail="";
		String genPassword="";
		
	switch (choice) {
	case 1:genEmail=cred.generateEmailId(emp1.getFname().toLowerCase(), emp1.getLname().toLowerCase(),"tech");
	       break;
	case 2:genEmail=cred.generateEmailId(emp1.getFname().toLowerCase(), emp1.getLname().toLowerCase(),"admin");
            break;
	case 3:genEmail=cred.generateEmailId(emp1.getFname().toLowerCase(), emp1.getLname().toLowerCase(),"hr");
            break;    
	case 4:genEmail=cred.generateEmailId(emp1.getFname().toLowerCase(), emp1.getLname().toLowerCase(),"legal");
            break;
            
            default:
           System.out.println("please enter the valid input"); 	
	}

	
	genPassword=cred.generatePassword();
	emp1.setEmailid(genEmail);
	emp1.setPassword(genPassword);
	cred.showDetails(emp1);
	}

}
