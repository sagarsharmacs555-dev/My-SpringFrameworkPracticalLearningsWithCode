package com.app.beans;

public class Ekart implements LogisticsService {

	@Override
	public void trackOrder(int orderId) {
		// TODO Auto-generated method stub
		
		System.out.println("Your orderId is " + orderId + " and your order is reached nearest hub by Ekart");

		
	}

}
