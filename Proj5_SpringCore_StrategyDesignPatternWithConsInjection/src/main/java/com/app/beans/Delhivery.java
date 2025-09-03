package com.app.beans;

public class Delhivery implements LogisticsService {
	
	@Override
	public String dispatchOrder(String orderId) {
		// TODO Auto-generated method stub
		return "Your OrderId: " + orderId + " is out for delivery by delhivery";
	}

	@Override
	public String trackOrder(String orderId) {
		// TODO Auto-generated method stub
		return "Your OrderId: " + orderId + " is reached at nearest hub by delhivery";
	}

	@Override
	public boolean returnOrder(String orderId) {
		// TODO Auto-generated method stub
		return true;
	}

}
