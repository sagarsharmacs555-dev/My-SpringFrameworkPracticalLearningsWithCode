package com.app.dao;

public interface BankDao {
	
	public int withDrawMoney(long acNo, float amount) throws Exception;
	public int depositMoney(long acNo, float amount) throws Exception;

}
