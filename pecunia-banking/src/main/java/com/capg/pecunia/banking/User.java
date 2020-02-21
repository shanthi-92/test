package com.capg.pecunia.banking;
import java.util.Scanner;
public class User {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        Service s=new Service();
		while (true) {
			System.out.println("Account creation of Customer");
			System.out.println("1.Create account");
			System.out.println("2.Update Account details");
			System.out.println("3.Delete Account");
			int choice = scan.nextInt();
			switch (choice) {
			case 1:
				try {
				System.out.println("name");
				String accountName = scan.next();
					/*
					 * if(accountName.matches("[a-z]{15}")){} 
					 * else throw new Exception("invalid Exception");
					 */
				System.out.println("accountnumber");
				String accountNo = scan.next();
				if(accountNo.matches("[0-9]{10}")) {}
				else
					throw new Exception("invalid account number");
				System.out.println("aadharnumber");
				String aadharNo = scan.next();
		         if(aadharNo.matches("[0-9]{12}")) {}
			      else
			       throw new Exception("invalid Aadhar number");
				System.out.println("Pannumber");
				String panNo = scan.next();		
				if(panNo.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}"))
				{}
				else
					throw new Exception("invalid pan number");
String a=Service.addAccount(accountName,accountNo,aadharNo,panNo);
		System.out.println("account number "+a+"  created");
				}
				        catch(Exception e)
				        {
				        System.out.println(e);
				        }
			}break;

		}
	}

}

