package org.stackroute.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {
	
	@Before("execution(* org.stackroute.service.PaymentServiceImpl.makePAyment())")
	public void printBefore() {
		System.out.println("Payment Started...");
	}
	
	@After("execution(* org.stackroute.service.PaymentServiceImpl.makePAyment())")
	public void printAfter() {
		System.out.println("Payment Done");
	}

}
