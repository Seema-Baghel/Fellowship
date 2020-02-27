package com.bridgelabz.fellowship.algorithm_programs;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import com.bridgelabz.fellowship.util.InputUtility;
import com.bridgelabz.fellowship.util.Utility;

public class MainPrimePalindrome {

	public static void main(String[] args) {
		PropertyConfigurator.configure("loggers\\log4j.properties");
		Logger logger=Logger.getLogger(MainPrimePalindrome.class);
		logger.info("Enter the range");
		int n1=InputUtility.intVal();
		Utility.printPrimePalindrome(n1);
				
	}
}
