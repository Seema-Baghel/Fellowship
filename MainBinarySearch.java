package com.bridgelabz.fellowship.algorithm_programs;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.bridgelabz.fellowship.exceptions.BinarySearchException;
import com.bridgelabz.fellowship.util.InputUtility;
import com.bridgelabz.fellowship.util.Utility;

public class MainBinarySearch {

	public static void main(String[] args) {
		PropertyConfigurator.configure("loggers\\log4j.properties");
		Logger logger=Logger.getLogger(MainBinarySearch.class);
		logger.info("Enter the string");
		String s1=InputUtility.stringVal();
		logger.info("Enter the word");
		String s2=InputUtility.stringVal();
		try {
			logger.info(Utility.binarySearch(s1, s2));
		}catch(BinarySearchException e)
		{
			e.printStackTrace();
		}
				
	}
}
