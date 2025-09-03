package com.app.beans;

public class Bluedart implements LogisticsService {
	
	@Override
	public void trackOrderDetails(int id) {
		// TODO Auto-generated method stub
		System.out.println("Your OrderId is " + id + " and is reached at nearest hub and will be delivere by BLuedart Agent");
		
	}

	@Override
	public void returRequest(int id) {
		System.out.println("Your OrderId is " + id + " and return will be picked up tomorrow by BLuedart Agent");
		
	}

}
