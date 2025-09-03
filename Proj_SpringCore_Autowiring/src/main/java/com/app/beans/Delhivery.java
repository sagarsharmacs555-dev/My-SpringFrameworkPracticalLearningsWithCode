package com.app.beans;

public class Delhivery implements LogisticsService {

	@Override
	public void trackOrder(int orderId) {
		// TODO Auto-generated method stub
		System.out.println("Your orderId is " + orderId + " and your order is reached nearest hub by Delhivery");

		
	}

}
