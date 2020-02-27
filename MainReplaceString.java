package com.bridgelabz.fellowship.basic_programs;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;


import com.bridgelabz.fellowship.exceptions.ReplaceStringException;
import com.bridgelabz.fellowship.util.InputUtility;
import com.bridgelabz.fellowship.util.Utility;

public class MainReplaceString {
	public static void main(String[] args) {
		
		PropertyConfigurator.configure("loggers\\log4j.properties");
		Logger logger=Logger.getLogger(MainReplaceString.class);
		logger.info("Enter the number");
		String s1=InputUtility.stringVal();
		try {
			logger.info(Utility.replaceString(s1));
		}catch(ReplaceStringException e)
		{
			e.printStackTrace();
		}
			
	}
}
