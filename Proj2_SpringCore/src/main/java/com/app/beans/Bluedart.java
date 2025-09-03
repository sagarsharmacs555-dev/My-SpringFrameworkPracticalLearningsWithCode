package com.app.beans;

public class Bluedart {
	
	public String dispatchOrder(int orderId)
	{
		return "Your OrderId is: " + orderId + " and order is dispatched";
	}
	
	public String trackOrder(int orderId)
	{
		return "Your OrderId is: " + orderId + " and order is reached to nearedhub";
	}

	public String returnOrder(int orderId)
	{
		return "Your OrderId is: " + orderId + " and order is returned and soon you get the refund";
	}

}
