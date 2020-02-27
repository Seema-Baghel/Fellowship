package com.bridgelabz.fellowship.functional_programs;

import org.apache.log4j.Logger;

import org.apache.log4j.PropertyConfigurator;

import com.bridgelabz.fellowship.exceptions.DistanceException;
import com.bridgelabz.fellowship.util.InputUtility;
import com.bridgelabz.fellowship.util.Utility;

public class MainDistance {

	public static void main(String[] args) {
		PropertyConfigurator.configure("loggers\\log4j.properties");
		Logger logger=Logger.getLogger(MainDistance.class);
		logger.info("Enter the value of x and y");
		int x=InputUtility.intVal();
		int y=InputUtility.intVal();
		try {
			logger.info(Utility.checkDistance(x, y));
		}catch(DistanceException e)
		{
			e.printStackTrace();
		}
				
	}
}
