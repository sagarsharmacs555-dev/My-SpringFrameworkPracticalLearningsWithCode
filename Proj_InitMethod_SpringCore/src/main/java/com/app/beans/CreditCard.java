package com.app.beans;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class CreditCard {
	
	private String accountHolderName;

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	@Override
	public String toString() {
		return "CreditCard [accountHolderName=" + accountHolderName + "]";
	}
	
	@PostConstruct
	public void init()
	{
		System.out.println("init method of creditCard");
		if(accountHolderName==null)
		{
			throw new IllegalArgumentException("Can't be null");
		}
	}
	
	@PreDestroy
	public void destroy()
	{
		System.out.println("destroy method of creditCard");
		accountHolderName = null;
	}


}
