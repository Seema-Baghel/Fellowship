package com.bridgelabz.fellowship.algorithm_programs;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import com.bridgelabz.fellowship.exceptions.BinarySearchException;
import com.bridgelabz.fellowship.util.InputUtility;
import com.bridgelabz.fellowship.util.Utility;

public class MainGenericBinarySearch {

	public static void main(String[] args) {
		PropertyConfigurator.configure("loggers\\log4j.properties");
		Logger logger=Logger.getLogger(MainGenericBinarySearch.class);
		logger.info("Enter the no of word");
		int n1=InputUtility.intVal();
		String[] arr=new String[n1];
		logger.info("Enter the elements");
		Utility.getGenericArrayWords(arr);
		logger.info("Enter the element to be searched");
		String str=InputUtility.genericstringValue();
		try {
			logger.info(Utility.binarySearched(arr, str));
			
		} catch (BinarySearchException e) {
			e.printStackTrace();
		}
			
	}
}
