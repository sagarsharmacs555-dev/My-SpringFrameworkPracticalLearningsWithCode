package com.app.beans;

import java.util.Random;

public class Amazon {
	
	String orderId1 = null;
	LogisticsService logisticsService = null;
	
	public Amazon(LogisticsService logisticsService)
	{
		this.logisticsService = logisticsService;
	}
	
	public void getOrderDetails(String[] items,Float[]  price)
	{
		System.out.println("Your items are: ");
		
		float billAmount = 0.0f;
		
		for(float p : price)
		{
		   billAmount = billAmount + p;
		}
		
		System.out.println("Your billAmount is: " + billAmount);
		
		// generating OrderId
		
		Random random = new Random();
		
		int orderId = random.nextInt(1000000);
		
		String prefix = "AMAZOD";
		
		String orderId1 = prefix + orderId;
		this.orderId1 = orderId1;
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
		System.out.println("Your Order is: " + orderId1 + " And return status is " + status);
	}

}
