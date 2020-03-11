package com.bridgelabz.fellowship.algorithm_programs;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import com.bridgelabz.fellowship.exceptions.FindYourNumException;
import com.bridgelabz.fellowship.util.InputUtility;
import com.bridgelabz.fellowship.util.Utility;

public class MainFindYourNum {

	public static void main(String[] args) {
		PropertyConfigurator.configure("loggers\\log4j.properties");
		Logger logger=Logger.getLogger(MainFindYourNum.class);
		logger.info("Enter the range that is 0 to (N-1)");
		int n= InputUtility.intVal();
		int lb=0;
		int ub=n-1;
		try {
			Utility.findYourNum(lb, ub);
		}catch(FindYourNumException e)
		{
			e.printStackTrace();
		}
				
	}
}
