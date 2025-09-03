package com.app.test;

import com.app.beans.Car;
import com.app.factory.CarFactory;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car car =CarFactory.getCarInstance("sportzcar");
		
		car.musicSystem();
		car.horn();
		car.journey();

	}

}
