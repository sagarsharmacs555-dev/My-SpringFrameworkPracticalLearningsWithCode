package com.app.beans;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Holiday {
	
	@Autowired
	@Qualifier("date")
	public Date date;
	
	public void checkHoliday()
	{
		if(date.getDay() == 14)
		{
			System.out.println("leave granted");
		}
		
		else
		{
			System.out.println("leave np");
			System.out.println(date);
		}
		
		
			
		
	}
}


