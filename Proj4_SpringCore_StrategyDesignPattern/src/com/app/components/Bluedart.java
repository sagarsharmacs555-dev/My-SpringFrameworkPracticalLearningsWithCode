package com.app.components;

public final class Bluedart implements LogisticsService{

	public String dispatchOrder(String orderId) {
		// TODO Auto-generated method stub
		return "Your OrderId is: " + orderId + " is out for delivery now by Bluedart";
	}

	@Override
	public String trackOrder(String orderId) {
		// TODO Auto-generated method stub
		return "Your OrderId is: " + orderId + " is reached at nearest hub by Bluedart";
	}

	@Override
	public boolean returnOrder(String orderId) {
		// TODO Auto-generated method stub
		return true;
	}

}
