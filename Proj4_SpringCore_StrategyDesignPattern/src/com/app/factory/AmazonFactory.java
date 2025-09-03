package com.app.factory;

import com.app.components.Amazon;
import com.app.components.Bluedart;
import com.app.components.Delhivery;
import com.app.components.LogisticsService;

public final class AmazonFactory {
	
	public static Amazon choseDeliveryPartner(String deliveryPartner)
	{
		if(deliveryPartner.equalsIgnoreCase("Bluedart"))
		{
			return new Amazon(new Bluedart());
		}
		
		else if (deliveryPartner.equalsIgnoreCase("Delhivery"))
		{
			return new Amazon(new Delhivery());
		}
		
		else 
			
			throw new IllegalArgumentException("Invalid input Type:: wrong deliveryPartner name");
	}

}
