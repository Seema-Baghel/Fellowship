package com.bridgelabz.fellowship.algorithm_programs;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import com.bridgelabz.fellowship.exceptions.InsertionSortException;
import com.bridgelabz.fellowship.util.InputUtility;
import com.bridgelabz.fellowship.util.Utility;

public class MainInsertionSort {

	public static void main(String[] args) {
		PropertyConfigurator.configure("loggers\\log4j.properties");
		Logger logger=Logger.getLogger(MainInsertionSort.class);
		logger.info("Enter the no of word");
		int n=InputUtility.intVal();
		logger.info("Enter the string");
		String[] s1= new String[n];
		for(int i=0; i < s1.length; i++)
		{
			s1[i]=InputUtility.stringVal();
		}
		try {
			logger.info(Utility.insertionSort(s1));
		}catch(InsertionSortException e)
		{
			e.printStackTrace();
		}
				
	}
}
