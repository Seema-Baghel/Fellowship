package com.bridgelabz.fellowship.functional_programs;

import org.apache.log4j.Logger;

import org.apache.log4j.PropertyConfigurator;

import com.bridgelabz.fellowship.exceptions.WindChillException;
import com.bridgelabz.fellowship.util.InputUtility;
import com.bridgelabz.fellowship.util.Utility;

public class MainWindChill {

	public static void main(String[] args) {
		PropertyConfigurator.configure("loggers\\log4j.properties");
		Logger logger=Logger.getLogger(MainWindChill.class);
		logger.info("Enter the Temperature(Should be less than 50)");
		double t=InputUtility.doubleVal();
		logger.info("Enter the Wind Speed in Miles per Hour(Should be un the range[3-120])");
		double s=InputUtility.doubleVal();
		try {
			logger.info(Utility.checkWindChill(t, s));
		}catch(WindChillException e)
		{
			e.printStackTrace();
		}
				
	}
}
