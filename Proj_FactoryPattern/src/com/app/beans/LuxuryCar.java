package com.app.beans;

public class LuxuryCar implements Car {
	
	LuxuryEngine engine;
	
	public LuxuryCar(LuxuryEngine engine)
	{
		this.engine = engine;
	}

	@Override
	public void musicSystem() {
		// TODO Auto-generated method stub
		System.out.println("LuxuryCar musicSystem on");
		
	}

	@Override
	public void horn() {
		// TODO Auto-generated method stub
		System.out.println("LuxuryCar horn is blown");
		
	}

	@Override
	public void journey() {
		// TODO Auto-generated method stub
		engine.engine();
		System.out.println("LuxuryCar journey Started");
		
	}

}
