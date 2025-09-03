package com.app.beans;

public class Bluedart implements LogisticsService {

	@Override
	public String dispatchOrder(String orderId) {
		// TODO Auto-generated method stub
		return "Your OrderId: " + orderId + " is out for delivery by bluedart";
	}

	@Override
	public String trackOrder(String orderId) {
		// TODO Auto-generated method stub
		return "Your OrderId: " + orderId + " is reached at nearest hub by bluedart";
	}

	@Override
	public boolean returnOrder(String orderId) {
		// TODO Auto-generated method stub
		return true;
	}

}
