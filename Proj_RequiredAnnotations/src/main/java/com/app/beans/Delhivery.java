package com.app.beans;

public class Delhivery implements LogisticsService {

	@Override
	public void trackOrderDetails(int id) {
		// TODO Auto-generated method stub
		System.out.println("Your OrderId is " + id + " and is reached at nearest hub and will be delivered by Delhivery agent");
		
	}

	@Override
	public void returRequest(int id) {
		System.out.println("Your OrderId is " + id + " and return will be picked up tomorrow by Delhivery agent");
		
	}

}
