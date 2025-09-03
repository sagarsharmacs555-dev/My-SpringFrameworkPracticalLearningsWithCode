package com.app.service;

public interface BankService {
	
	public String transferMonney(long senderAccNo, long recieverAccNo, float amount) throws Exception;

}
