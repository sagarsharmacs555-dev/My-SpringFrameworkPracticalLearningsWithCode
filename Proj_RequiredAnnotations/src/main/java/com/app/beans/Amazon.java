package com.app.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Amazon {
	
	@Autowired(required = true)
	@Qualifier("bluedart")
	private LogisticsService logisticsService;
	
	
	public void getDetails(int id)
	{
		logisticsService.trackOrderDetails(id);
		logisticsService.returRequest(id);
	}

}
