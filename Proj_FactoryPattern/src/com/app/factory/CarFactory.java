package com.app.factory;

import com.app.beans.Car;
import com.app.beans.LuxuryCar;
import com.app.beans.LuxuryEngine;
import com.app.beans.SportzCar;
import com.app.beans.SportzEngine;

public class CarFactory {
	
	public static Car getCarInstance(String CarType)
	{
		Car car = null;
		if(CarType.equalsIgnoreCase("LuxuryCar"))
		{
			car = new LuxuryCar(new LuxuryEngine());
		}
		
		else if(CarType.equalsIgnoreCase("SportzCar"))
		{
			car = new SportzCar(new SportzEngine());
		}
		
		else
			throw new IllegalArgumentException("invalid input");
		
		return car;
			
			
	}

}
