package com.app.beans;

public class Ekart implements LogisticsService {

	@Override
	public void trackOrder(int orderId) {
		// TODO Auto-generated method stub
		System.out.println("Your OrderId : " + orderId + " and reached at nearest hub and soon will be deliverd by Ekart");
		
	}

}
