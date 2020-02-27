package com.bridgelabz.fellowship.algorithm_programs;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import com.bridgelabz.fellowship.exceptions.PermutationException;
import com.bridgelabz.fellowship.util.InputUtility;
import com.bridgelabz.fellowship.util.Utility;

public class MainPremutation {

	public static void main(String[] args) {
		PropertyConfigurator.configure("loggers\\log4j.properties");
		Logger logger=Logger.getLogger(MainPremutation.class);
		logger.info("Enter the 1st string");
		String s1=InputUtility.stringVal();
		int n=s1.length();
		try {
			Utility.isIterative(s1, 0, n-1);
			Utility.isRecurssion(s1, "");
		}catch(PermutationException e)
		{
			e.printStackTrace();
		}
				
	}
}
