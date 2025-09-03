package com.app.components;

import java.lang.reflect.Array;
import java.util.Random;

public final class Amazon {
	
	LogisticsService logisticsService = null;
	String orderId1 = null;
	
	
	public Amazon(LogisticsService logisticsService)
	{
		this.logisticsService = logisticsService;
	}
	
	public void getOrderDetails(String[] items, Float[] price)
	{
		float billAmount = 0.0f;
		
		System.out.println("Your items are: ");
		
		for(float p : price)
		{
			billAmount = billAmount + p;
		}
		
		System.out.println("Your billAmount is: " + billAmount);
		
		// generatingOrderId
		
		Random random = new Random();
		
		int orderId = random.nextInt(1000000);
		String prefix = "AMZOD";
		
		String orderId1 = prefix + orderId;
		this.orderId1 = orderId1;
		
		System.out.println("Your orderId: " + orderId1);
		
		}
	
	public void dispatchOrder()
	{
		String status = logisticsService.dispatchOrder(orderId1);
		System.out.println(status);
	}
	
	public void trackOrder()
	{
		String status = logisticsService.trackOrder(orderId1);
		System.out.println(status);
	}
	
	public void returnOrder()
	{
		boolean status = logisticsService.returnOrder(orderId1);
		System.out.println("Your OrderId: " + orderId1 + " And return status is " + status);
	}

}
