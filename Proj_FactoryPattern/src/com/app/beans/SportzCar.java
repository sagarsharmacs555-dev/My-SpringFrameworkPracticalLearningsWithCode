package com.app.beans;

public class SportzCar implements Car {
	
	SportzEngine engine;
	
	public SportzCar(SportzEngine engine)
	{
		this.engine = engine;
	}

	@Override
	public void musicSystem() {
		// TODO Auto-generated method stub
		System.out.println("Sportz Car musicSystem started");
		
	}

	@Override
	public void horn() {
		// TODO Auto-generated method stub
		System.out.println("Sportz Car horn is blown");
		
	}

	@Override
	public void journey() {
		// TODO Auto-generated method stub
		engine.engine();
		System.out.println("Sportz Car journey Started");
		
	}

}
