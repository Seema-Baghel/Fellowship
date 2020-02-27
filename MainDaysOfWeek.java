package com.bridgelabz.fellowship.junittesting;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.bridgelabz.fellowship.exceptions.DaysOfWeekException;
import com.bridgelabz.fellowship.util.InputUtility;
import com.bridgelabz.fellowship.util.Utility;

public class MainDaysOfWeek {

	public static void main(String[] args) {
		PropertyConfigurator.configure("loggers\\log4j.properties");
		Logger logger=Logger.getLogger(MainDaysOfWeek.class);
		logger.info("Enter the date");
		int d=InputUtility.intVal();
		logger.info("Enter the month");
		int m=InputUtility.intVal();
		logger.info("Enter the year");
		int y=InputUtility.intVal();
		try {
			Utility.daysOfWeek(d, m, y);
		}catch(DaysOfWeekException e)
		{
			e.printStackTrace();
		}
	}	
}
