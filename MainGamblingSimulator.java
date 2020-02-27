package com.bridgelabz.fellowship.logical_programs;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.bridgelabz.fellowship.exceptions.GamblingSimulatorException;
import com.bridgelabz.fellowship.util.InputUtility;
import com.bridgelabz.fellowship.util.Utility;

public class MainGamblingSimulator {

	public static void main(String[] args) {
		PropertyConfigurator.configure("loggers\\log4j.properties");
		Logger logger=Logger.getLogger(MainGamblingSimulator.class);
		logger.info("Enter the stake, goal, and number of times");
		int stake=InputUtility.intVal();
		int goal=InputUtility.intVal();
		int n=InputUtility.intVal();
		try {
			Utility.gamblingSimulator(stake, goal, n);
		}catch(GamblingSimulatorException e)
		{
			e.printStackTrace();
		}
				
	}
}
