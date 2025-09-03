package com.app.beans;

public class BankLoanInterestCalculator_SI {
	
	public float loanCalSi(float p, float r, float t)
	{
		
		float si = (p*r*t)/100;
		return si;
	}

}
