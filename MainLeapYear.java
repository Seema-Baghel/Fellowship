package com.bridgelabz.fellowship.basic_programs;

import org.apache.log4j.Logger;

import org.apache.log4j.PropertyConfigurator;

import com.bridgelabz.fellowship.util.InputUtility;
import com.bridgelabz.fellowship.util.Utility;
import com.bridgelabz.fellowship.exceptions.LeapYearException;

public class MainLeapYear {

	public static void main(String[] args) {
		PropertyConfigurator.configure("loggers\\log4j.properties");
		Logger logger=Logger.getLogger(MainLeapYear.class);
		logger.info("Enter the year");
		int year=InputUtility.intVal();
		try {
			logger.info(Utility.isLeapyear(year));
		}catch(LeapYearException e)
		{
			e.printStackTrace();
		}
		
	}
}
