package com.app.service;

import java.sql.SQLException;

import com.app.dao.BankDao;

public class BankServiceImp implements BankService {
	
	private BankDao bankDao;
	
	public BankServiceImp(BankDao bankDao)
	{
		this.bankDao = bankDao;
	}

	@Override
	public String transferMonney(long senderAccNo, long recieverAccNo, float amount) throws Exception {
		
		
		
		int i = bankDao.withDrawMoney(senderAccNo, amount);
		int j = bankDao.depositMoney(recieverAccNo, amount);
		
		if(i == 0 || j == 0 )
		{
			throw new SQLException("Something went wrong. Please try again");
		}
		
		else
		{
			return "Transfer Success";
		}
		
	
	}

}
