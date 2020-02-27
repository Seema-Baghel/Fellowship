package com.bridgelabz.fellowship.junittesting;

import org.apache.log4j.Logger;

import org.apache.log4j.PropertyConfigurator;

import com.bridgelabz.fellowship.exceptions.BinaryException;
import com.bridgelabz.fellowship.util.InputUtility;
import com.bridgelabz.fellowship.util.Utility;

public class MainNibbleSwap {

	public static void main(String[] args) throws BinaryException {
		PropertyConfigurator.configure("loggers\\log4j.properties");
		Logger logger=Logger.getLogger(MainNibbleSwap.class);
		logger.info("Enter the number");
		int n=InputUtility.intVal();
		String num=Utility.toBinary(n);
		try {
			String binary=Utility.swappedNibbles(num);
			logger.info(binary);
			logger.info(Utility.binaryToDecimal(binary));
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}	
}
