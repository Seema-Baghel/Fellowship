package com.bridgelabz.fellowship.algorithm_programs;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.bridgelabz.fellowship.exceptions.AnagramDetectionException;
import com.bridgelabz.fellowship.util.InputUtility;
import com.bridgelabz.fellowship.util.Utility;

public class MainAnagramDetection {

	public static void main(String[] args) {
		PropertyConfigurator.configure("loggers\\log4j.properties");
		Logger logger=Logger.getLogger(MainAnagramDetection.class);
		logger.info("Enter the 1st string");
		String s1=InputUtility.stringVal();
		logger.info("Enter the 2nd String");
		String s2=InputUtility.stringVal();
		
		try {
			logger.info(Utility.isAnagram(s1, s2));
		}catch(AnagramDetectionException e)
		{
			e.printStackTrace();
		}
				
	}
}
