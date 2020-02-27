package com.bridgelabz.fellowship.algorithm_programs;

import org.apache.log4j.Logger;

import org.apache.log4j.PropertyConfigurator;
import com.bridgelabz.fellowship.exceptions.PrimeNumException;
import com.bridgelabz.fellowship.util.InputUtility;
import com.bridgelabz.fellowship.util.Utility;

public class MainPrimeNum {

	public static void main(String[] args) {
		PropertyConfigurator.configure("loggers\\log4j.properties");
		Logger logger=Logger.getLogger(MainPrimeNum.class);
		logger.info("Enter the range");
		int n1=InputUtility.intVal();
		Utility.printPrimes(n1);
				
	}
}
