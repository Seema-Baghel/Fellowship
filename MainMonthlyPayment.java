package com.bridgelabz.fellowship.junittesting;

import org.apache.log4j.Logger;

import org.apache.log4j.PropertyConfigurator;

import com.bridgelabz.fellowship.exceptions.MonthlyPaymentException;
import com.bridgelabz.fellowship.util.InputUtility;
import com.bridgelabz.fellowship.util.Utility;

public class MainMonthlyPayment {

	public static void main(String[] args) {
		PropertyConfigurator.configure("loggers\\log4j.properties");
		Logger logger=Logger.getLogger(MainMonthlyPayment.class);
		logger.info("Enter the Payment");
		double p=InputUtility.intVal();
		logger.info("Enter the Rate");
		double r=InputUtility.intVal();
		logger.info("Enter the Year");
		int y=InputUtility.intVal();
		try {
			logger.info(Utility.monthlyPayment(p, r, y));
		}catch(MonthlyPaymentException e)
		{
			e.printStackTrace();
		}
	}	
}
