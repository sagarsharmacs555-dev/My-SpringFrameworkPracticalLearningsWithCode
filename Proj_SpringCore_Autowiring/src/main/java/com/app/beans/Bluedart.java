package com.app.beans;

public class Bluedart implements LogisticsService {

	@Override
	public void trackOrder(int orderId) {
		
		System.out.println("Your orderId is " + orderId + " and your order is reached nearest hub by Bluedart");
		
	}

}
