package com.app.test;

import com.app.Factory.TyreFactory;
import com.app.components.Tyres;

public class Test {

	public static void main(String[] args) {
		
		Tyres tyre = null;
		
	    tyre = TyreFactory.getTyreType("Mrf");
	    
	    tyre.offRoadGrip();
	    tyre.highWayGrip();
	 

	}

}
