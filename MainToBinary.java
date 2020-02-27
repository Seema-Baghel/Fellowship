package com.bridgelabz.fellowship.junittesting;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.bridgelabz.fellowship.exceptions.BinaryException;
import com.bridgelabz.fellowship.util.InputUtility;
import com.bridgelabz.fellowship.util.Utility;

public class MainToBinary {

	public static void main(String[] args) {
		PropertyConfigurator.configure("loggers\\log4j.properties");
		Logger logger=Logger.getLogger(MainToBinary.class);
		logger.info("Enter the number");
		int n=InputUtility.intVal();
		try {
			logger.info(Utility.toBinary(n));
		}catch(BinaryException e)
		{
			e.printStackTrace();
		}
	}	
}
