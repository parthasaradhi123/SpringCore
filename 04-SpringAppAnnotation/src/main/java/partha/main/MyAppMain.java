package partha.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import partha.service.UserService;

public class MyAppMain 
{
	public static void main(String[] args)
	{
		ApplicationContext factory = new ClassPathXmlApplicationContext("Beans.xml ");
		UserService us = factory.getBean(UserService.class);
		
		us.storeInDb();
		
		
	}
}
