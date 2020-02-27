package com.bridgelabz.fellowship.algorithm_programs;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import com.bridgelabz.fellowship.util.InputUtility;
import com.bridgelabz.fellowship.util.Utility;

public class MainPrimeAnagram {

	public static void main(String[] args) {
		PropertyConfigurator.configure("loggers\\log4j.properties");
		Logger logger=Logger.getLogger(MainPrimeAnagram.class);
		logger.info("Enter the range");
		int n1=InputUtility.intVal();
		Utility.printPrimeAnagram(n1);
				
	}
}
