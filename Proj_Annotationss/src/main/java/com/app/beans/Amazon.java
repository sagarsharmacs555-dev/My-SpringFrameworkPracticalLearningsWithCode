package com.app.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import jakarta.annotation.Resource;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@Component
public class Amazon {
	
	@Resource(name = "delhivery")
	public LogisticsService logisticsService;
	
	public void trackOrder(int OrderId)
	{
		logisticsService.trackOrder(OrderId);
	}

}
