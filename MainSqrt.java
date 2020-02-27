package com.bridgelabz.fellowship.junittesting;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.bridgelabz.fellowship.exceptions.SqrtException;
import com.bridgelabz.fellowship.util.InputUtility;
import com.bridgelabz.fellowship.util.Utility;

public class MainSqrt {

	public static void main(String[] args) {
		PropertyConfigurator.configure("loggers\\log4j.properties");
		Logger logger=Logger.getLogger(MainSqrt.class);
		logger.info("Enter the nonnegative value");
		int n=InputUtility.intVal();
		try {
			
			logger.info(Utility.sqrt(n));
		}catch(SqrtException e)
		{
			e.printStackTrace();
		}
	}	
}
