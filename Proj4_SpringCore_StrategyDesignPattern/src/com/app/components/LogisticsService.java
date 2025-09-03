package com.app.components;

public  interface LogisticsService {
	
	public String dispatchOrder(String orderId);
	public String trackOrder(String orderId);
	public boolean returnOrder(String orderId);

}
