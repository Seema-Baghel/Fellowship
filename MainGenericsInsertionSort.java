package com.bridgelabz.fellowship.algorithm_programs;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.bridgelabz.fellowship.exceptions.InsertionSortException;
import com.bridgelabz.fellowship.util.InputUtility;
import com.bridgelabz.fellowship.util.Utility;

public class MainGenericsInsertionSort {

	public static void main(String[] args) {
		PropertyConfigurator.configure("loggers\\log4j.properties");
		Logger logger=Logger.getLogger(MainGenericsInsertionSort.class);
		logger.info("Enter the number of elements");
		Integer n2=InputUtility.genericintVal();
		logger.info("Enter the elements");
		Integer[] n= new Integer[n2];
		Utility.getGenericArray(n);
		try {
			
			Utility.insertionSorted(n);
		}catch(InsertionSortException e)
		{
			e.printStackTrace();
		}
				
	}
}
