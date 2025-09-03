package com.app.factory;

import com.app.beans.Amazon;
import com.app.beans.Bluedart;
import com.app.beans.Delhivery;
import com.app.beans.Ekart;

public class Factory {
	
	public static Amazon getDeliveryName(String name)
	{
		if(name.equalsIgnoreCase("bluedart"))
		{
			return new Amazon(new Bluedart());
		}
		
		else if(name.equalsIgnoreCase("Ekart"))
		{
			return new Amazon(new Ekart());
		}
		
		else if (name.equalsIgnoreCase("Delhivery"))
		{
			return new Amazon(new Delhivery());
		}
		
		else
			throw new IllegalArgumentException("Invalid Input Type");
	}

}
