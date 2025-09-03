package com.app.beans;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Amazon {
	
	private LogisticsService logisticsService;
	private Date date;
	
//    @Autowired
//    @Qualifier(value = "ekart")
//	public void setLogisticsService(LogisticsService logisticsService) {
//		this.logisticsService = logisticsService;
//	}
	
	@Autowired(required = false)
	public Amazon(@Qualifier(value = "delhivery")LogisticsService logisticsService)
	{
		this.logisticsService = logisticsService;	
		System.out.println("amazon");
	}
	
	@Autowired(required = false)
	public Amazon(@Qualifier(value = "ekart")LogisticsService logisticsService, Date date)
	{
		this.logisticsService = logisticsService;	
		this.date = date;
		System.out.println("amazon");
		System.out.println(date);
	}
	
    
    public void trackOrder(int orderId)
    {
    	logisticsService.trackOrder(orderId);
    }
	

}
