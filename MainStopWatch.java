package com.bridgelabz.fellowship.logical_programs;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import com.bridgelabz.fellowship.exceptions.StopWatchException;
import com.bridgelabz.fellowship.util.InputUtility;
import com.bridgelabz.fellowship.util.Utility;

public class MainStopWatch {

	public static void main(String[] args) {
		PropertyConfigurator.configure("loggers\\log4j.properties");
		Logger logger=Logger.getLogger(MainStopWatch.class);
		logger.info("please press \"S\" to start and \"E\" to end");
		char c=(InputUtility.stringVal()).charAt(0);
		try {
			Utility.stopWatch(c);
		}catch(StopWatchException e)
		{
			e.printStackTrace();
		}
				
	}
}
