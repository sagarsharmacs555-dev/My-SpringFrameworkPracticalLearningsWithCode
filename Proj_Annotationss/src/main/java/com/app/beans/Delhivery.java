package com.app.beans;

import org.springframework.stereotype.Component;

import jakarta.inject.Named;

@Component("delhivery")
public class Delhivery implements LogisticsService {

	@Override
	public void trackOrder(int OrderId) {
		
		System.out.println("Your orderId " + OrderId + " and is reached at nearest and soon it will be delivered Delhivery logistics");
		
	}

}
