package com.bridgelabz.fellowship.basic_programs;

import org.apache.log4j.Logger;

import org.apache.log4j.PropertyConfigurator;
import com.bridgelabz.fellowship.util.InputUtility;
import com.bridgelabz.fellowship.util.Utility;
import com.bridgelabz.fellowship.exceptions.PowerOfTwoException;

public class MainPowerOfTwo {

	public static void main(String[] args) {
		PropertyConfigurator.configure("loggers\\log4j.properties");
		Logger logger=Logger.getLogger(MainPowerOfTwo.class);
		logger.info("Enter the number");
		int n1=InputUtility.intVal();
		try {
			logger.info(Utility.powerOfTwo(n1));
		}catch(PowerOfTwoException e)
		{
			e.printStackTrace();
		}
				
	}
}

