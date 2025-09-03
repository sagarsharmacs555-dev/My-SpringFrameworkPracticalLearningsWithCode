package com.app.beans;

public class Amazon {
	
	private Bluedart bluedart = null;
	
	public String amazonDispatchOrder(int orderId)
	{
		return bluedart.dispatchOrder(1001);
	}
	
	public String amazonTrackOrder(int orderId)
	{
		return bluedart.trackOrder(1001);
	}

	public String amazonReturnOrder(int orderId)
	{
		return bluedart.returnOrder(1001);
	}

	public void setBluedart(Bluedart bluedart) {
		this.bluedart = bluedart;
	}


}
