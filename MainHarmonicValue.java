package com.bridgelabz.fellowship.basic_programs;

import org.apache.log4j.Logger;

import org.apache.log4j.PropertyConfigurator;
import com.bridgelabz.fellowship.util.InputUtility;
import com.bridgelabz.fellowship.util.Utility;
import com.bridgelabz.fellowship.exceptions.HarmonicValueException;

public class MainHarmonicValue {

		public static void main(String[] args) {
			PropertyConfigurator.configure("loggers\\log4j.properties");
			Logger logger=Logger.getLogger(MainHarmonicValue.class);
			logger.info("Enter the number");
			double n=InputUtility.doubleVal();
			try {
				logger.info(Utility.harmonicValue(n));
			}catch(HarmonicValueException e)
			{
				e.printStackTrace();
			}
			
		}
	}


