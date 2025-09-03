package com.app.beans;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Amazon {
	
	private LogisticsService logisticsService;
	private Date orderDate;
	private Date delhiveryDate;
	
	@Autowired
	public void setLogisticsService(@Qualifier("ek")LogisticsService logisticsService) {
		this.logisticsService = logisticsService;
	}
	
	
	public Amazon(@Qualifier("delh")LogisticsService logisticsService, @Qualifier("date") Date orderDate)
	{
		this.logisticsService = logisticsService;
		this.orderDate = orderDate;
		System.out.println(orderDate);
	}
	
	@Autowired
	public Amazon(@Qualifier("delh")LogisticsService logisticsService, @Qualifier("date") Date orderDate,@Qualifier("date") Date delhiveryDate)
	{
		this.logisticsService = logisticsService;
		this.orderDate = orderDate;
		this.delhiveryDate = delhiveryDate;
		System.out.println(orderDate);
		System.out.println(delhiveryDate);
	}
	
	
	public Amazon()
	{
		
	}
	



	public void trackOrder(int orderId)
	{
		logisticsService.trackOrder(orderId);
	}

}
