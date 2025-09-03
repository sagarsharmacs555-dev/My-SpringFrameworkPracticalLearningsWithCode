package com.app.beans;

public class Amazon {
	
	private Bluedart bluedart;
	private String ShippmentName;
	private Shipprocket shipprocket;
	
	public Amazon(Bluedart bluedart, String ShippmentName)
	{
		this.bluedart = bluedart;
		this.ShippmentName = ShippmentName;
	}
	
	public void amazonShipOrder()
	{
		bluedart.shipOrder();
		System.out.println("ShippmentName: " + ShippmentName );
	}
	
	public void amazonShippmentName()
	{
		bluedart.shippmentName();
	}
	
	public void setBluedart(Shipprocket shipprocket)
	{
		this.shipprocket = shipprocket;
	}
	
	public void amazonShipOrderShipprocket()
	{
		shipprocket.shipOrder();
	}
	
	

}
