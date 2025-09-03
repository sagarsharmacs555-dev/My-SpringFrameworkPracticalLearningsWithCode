package com.app.beans;

public class Ekart implements LogisticsService {

	@Override
	public String dispatchOrder(String orderId) {
		// TODO Auto-generated method stub
		return "Your OrderId: " + orderId + " is out for delivery by Ekart";
	}

	@Override
	public String trackOrder(String orderId) {
		// TODO Auto-generated method stub
		return "Your OrderId: " + orderId + " is reached at nearest hub by Ekart";
	}

	@Override
	public boolean returnOrder(String orderId) {
		// TODO Auto-generated method stub
		return true;
	}

}
