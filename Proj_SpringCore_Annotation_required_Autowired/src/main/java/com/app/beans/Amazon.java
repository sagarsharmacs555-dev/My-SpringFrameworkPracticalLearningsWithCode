package com.app.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Amazon {
	
	@Autowired(required = true)
	
	private LogisticsService logisticsService;
	
	public void trackOrder(int orderId)
	{
		logisticsService.trackOrder(orderId);
	}

}
