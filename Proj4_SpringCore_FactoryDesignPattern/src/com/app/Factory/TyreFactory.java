package com.app.Factory;

import com.app.components.Apollo;
import com.app.components.Ceat;
import com.app.components.Mrf;
import com.app.components.Tyres;

public class TyreFactory {
	
	public static Tyres getTyreType(String info)
	{
		if(info.equalsIgnoreCase("Mrf"))
		{
			return new Mrf();
		}
		
		else if (info.equalsIgnoreCase("Ceat")) {
			return new Ceat();
			
		}
		
		else if (info.equalsIgnoreCase("Apollo"))
		{
			return new Apollo();
		}
		
		else {
			
			throw new IllegalArgumentException("Invalid Input Type");
		}
		
	}

	

}
