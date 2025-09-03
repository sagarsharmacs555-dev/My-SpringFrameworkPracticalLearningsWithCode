package com.app.components;

public final class Delhivery implements LogisticsService {

	@Override
	public String dispatchOrder(String orderId) {
		// TODO Auto-generated method stub
		return "Your OrderId is: " + orderId + " is out for delivery by delhivery ";
	}

	@Override
	public String trackOrder(String orderId) {
		// TODO Auto-generated method stub
		return "Your OrderId is: " + orderId + " is reached at nearest hub by delhivery";
	}

	@Override
	public boolean returnOrder(String orderId) {
		// TODO Auto-generated method stub
		return true;
	}

}
