package com.bridgelabz.fellowship.basic_programs;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.bridgelabz.fellowship.util.InputUtility;
import com.bridgelabz.fellowship.util.Utility;
import com.bridgelabz.fellowship.exceptions.PrimeFactorException;

public class MainPrimeFactor {

public static void main(String[] args) {
	PropertyConfigurator.configure("loggers\\log4j.properties");
	Logger logger=Logger.getLogger(MainPrimeFactor.class);
	logger.info("Enter the number");
	int num=InputUtility.intVal();
	try {
		logger.info(Utility.isPrimeFactor(num));
	}catch(PrimeFactorException e)
	{
		e.printStackTrace();
	}
			
}
}