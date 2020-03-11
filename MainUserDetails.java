package com.bridgelabz.fellowship.algorithm_programs;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import com.bridgelabz.fellowship.exceptions.UserNameException;
import com.bridgelabz.fellowship.util.InputUtility;
import com.bridgelabz.fellowship.util.Utility;

public class MainUserDetails {
	public static String name; 
	public static String fullname; 
	public static String phn; 
	public static void main(String[] args) {
		PropertyConfigurator.configure("loggers\\log4j.properties");
		Logger logger=Logger.getLogger(MainUserDetails.class);
		logger.info("Enter the fast name");
		name=InputUtility.stringVal();
		logger.info("Enter the last name");
		fullname=InputUtility.stringVal();
		logger.info("Enter the mobile number");
		phn=InputUtility.stringVal();
		
		try {
			logger.info(Utility.printdetails1(name, fullname, phn));
			logger.info("Enter what you want to change:");
			String s= InputUtility.stringVal();
			logger.info(Utility.changedetails(s));
		}catch(UserNameException e)
		{
			e.printStackTrace();
		}
				
	}
}
