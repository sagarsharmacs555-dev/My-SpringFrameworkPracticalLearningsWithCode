package com.app.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class DebitCard implements InitializingBean, DisposableBean {
	
	private String accountHolderName;

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	@Override
	public String toString() {
		return "DebitCard [accountHolderName=" + accountHolderName + "]";
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("destroy method invoked of Debit Card");
		accountHolderName = null;
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("init method invoked of Debit Card");
		if(accountHolderName==null)
		{
			throw new IllegalArgumentException("Can't be null");
		}
		
	}
	
	
	

}
