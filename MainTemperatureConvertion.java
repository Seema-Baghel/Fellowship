package com.bridgelabz.fellowship.junittesting;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.bridgelabz.fellowship.exceptions.TemperatureConversionException;
import com.bridgelabz.fellowship.util.InputUtility;
import com.bridgelabz.fellowship.util.Utility;

public class MainTemperatureConvertion {

	public static void main(String[] args) {
		PropertyConfigurator.configure("loggers\\log4j.properties");
		Logger logger=Logger.getLogger(MainTemperatureConvertion.class);
		logger.info("Enter the Fahrenhiet");
		int Ftemp=InputUtility.intVal();
		logger.info("Enter the Celsius");
		int Ctemp=InputUtility.intVal();
		try {
			Utility.tempConv(Ftemp, Ctemp);
		}catch(TemperatureConversionException e)
		{
			e.printStackTrace();
		}
	}	
}
