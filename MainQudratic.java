package com.bridgelabz.fellowship.functional_programs;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import com.bridgelabz.fellowship.exceptions.QudraticException;
import com.bridgelabz.fellowship.util.InputUtility;
import com.bridgelabz.fellowship.util.Utility;

public class MainQudratic {

	public static void main(String[] args) {
		PropertyConfigurator.configure("loggers\\log4j.properties");
		Logger logger=Logger.getLogger(MainQudratic.class);
		logger.info("Enter the Coefficient of x2 and x");
		int x2=InputUtility.intVal();
		int x=InputUtility.intVal();
		logger.info("Enter the Constant");
		int c=InputUtility.intVal();
		try {
			logger.info(Utility.checkQudratic(x2, x, c));
		}catch(QudraticException e)
		{
			e.printStackTrace();
		}
				
	}
}
