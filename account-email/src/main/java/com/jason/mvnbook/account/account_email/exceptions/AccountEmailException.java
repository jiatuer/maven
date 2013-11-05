package com.jason.mvnbook.account.account_email.exceptions;

public class AccountEmailException extends Exception {

	
	public AccountEmailException(){
		super();
	}
	
	public AccountEmailException(String msg){
		super(msg);
	}	
	
	public AccountEmailException(String msg,Exception e){
		super(msg,e);
	}		
}
