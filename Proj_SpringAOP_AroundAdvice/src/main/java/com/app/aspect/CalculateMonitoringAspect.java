package com.app.aspect;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class CalculateMonitoringAspect implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		
		long startTime = System.currentTimeMillis();
		
		Object obj =invocation.proceed();
		
		
		long endTime = System.currentTimeMillis();
		
		System.out.println("The time you get is " + (endTime - startTime) + "ms");
		System.out.println(invocation.getMethod().getName());
		
		
		
		
		return obj;
	}

}
