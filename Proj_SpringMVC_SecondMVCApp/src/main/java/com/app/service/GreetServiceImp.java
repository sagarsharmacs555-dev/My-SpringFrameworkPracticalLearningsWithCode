package com.app.service;

import java.util.Date;

public class GreetServiceImp implements GreetService {

	@Override
	public String greetingMessage() {
		
		Date d = new Date();
		
		d.setYear(125);
		d.setDate(30);
		d.setMonth(6);
		
		if(d.getDate() == 30 && d.getYear() == 125 && d.getMonth()==6)
		{
			return "Today is Wednesday";
		}
		
		else
		{
			return "Today is Ordinay day";
		}
		
	}

}
