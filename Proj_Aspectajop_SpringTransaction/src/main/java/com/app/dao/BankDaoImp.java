package com.app.dao;

import org.springframework.jdbc.core.JdbcTemplate;

public class BankDaoImp implements BankDao {
	
	private static final String withDrawQuery = "update bankDetails set balance = balance - ? where ac_No = ?";
	private static final String depositQuery = "update bankDetails set balance = balance + ? where ac_No = ?";
	
	private JdbcTemplate jdbcTemplate;
	
	public BankDaoImp(JdbcTemplate jdbcTemplate)
	{
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int withDrawMoney(long senderAccNo, float amount) throws Exception {
		
		int i = jdbcTemplate.update(withDrawQuery,amount,senderAccNo);
		
		return i;
	}

	@Override
	public int depositMoney(long recieverAccNo, float amount) throws Exception {
		int i = jdbcTemplate.update(depositQuery,amount,recieverAccNo);
		return i;
	}

}
