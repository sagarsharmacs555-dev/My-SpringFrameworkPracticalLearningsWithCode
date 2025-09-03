package com.app.test;

import com.app.components.Amazon;
import com.app.components.Bluedart;
import com.app.factory.AmazonFactory;

public final class Test {

	public static void main(String[] args) {
		
		Amazon amazon = null;
		
		amazon = AmazonFactory.choseDeliveryPartner("Delhivery");
		
		amazon.getOrderDetails(new String[] {"pen","pencil"}, new Float[] {12.3f, 123.0f});
		
		amazon.dispatchOrder();
		amazon.trackOrder();
		amazon.returnOrder();

	}

}
