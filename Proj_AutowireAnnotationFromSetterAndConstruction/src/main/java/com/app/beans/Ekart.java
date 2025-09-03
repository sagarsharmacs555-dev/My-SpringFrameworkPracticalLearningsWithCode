package com.app.beans;

public class Ekart implements LogisticsService {

	@Override
	public void trackOrder(int orderId) {
		System.out.println("Your orderId is " + orderId + " is reached at nearest hub and soon will be deliverd by Ekart.");
		
	}

}
