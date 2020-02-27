package com.bridgelabz.fellowship.basic_programs;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.bridgelabz.fellowship.exceptions.FlipCoinException;
import com.bridgelabz.fellowship.util.InputUtility;
import com.bridgelabz.fellowship.util.Utility;

public class MainFlipCoin {

	public static void main(String[] args) {
		PropertyConfigurator.configure("loggers\\log4j.properties");
		Logger logger=Logger.getLogger(MainFlipCoin.class);
		logger.info("Enter the number");
		int t=InputUtility.intVal();
		try {
			logger.info(Utility.flipCoin(t));
		}catch(FlipCoinException e)
		{
			e.printStackTrace();
		}
				
	}
}
