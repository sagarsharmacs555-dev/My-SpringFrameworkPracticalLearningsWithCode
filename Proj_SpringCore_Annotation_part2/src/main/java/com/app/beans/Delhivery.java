package com.app.beans;

public class Delhivery implements LogisticsService {

	@Override
	public void trackOrder(int orderId) {
		System.out.println("Your OrderId : " + orderId + " and reached at nearest hub and soon will be deliverd by Delhivery");
		
	}

}
