package com.bridgelabz.fellowship.functional_programs;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import com.bridgelabz.fellowship.exceptions.TripletException;
import com.bridgelabz.fellowship.util.InputUtility;
import com.bridgelabz.fellowship.util.Utility;

public class MainTriplet {

	public static void main(String[] args) {
		PropertyConfigurator.configure("loggers\\log4j.properties");
		Logger logger=Logger.getLogger(MainTriplet.class);
		logger.info("Enter the values");
		int arr=InputUtility.intVal();
		int array[]=Utility.get1DArray(arr);
		
		try {
			logger.info(Utility.addTriplets(array));
		}catch(TripletException e)
		{
			e.printStackTrace();
		}
				
	}
}
