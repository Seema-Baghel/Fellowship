package com.bridgelabz.fellowship.algorithm_programs;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.bridgelabz.fellowship.exceptions.MergeSortException;
import com.bridgelabz.fellowship.util.InputUtility;
import com.bridgelabz.fellowship.util.Utility;

public class MainGenericMergeSort {

	public static void main(String[] args) {
		PropertyConfigurator.configure("loggers\\log4j.properties");
		Logger logger=Logger.getLogger(MainGenericMergeSort.class);
		logger.info("Enter the no of word");
		int n1=InputUtility.intVal();
		String[] arr=new String[n1];
		logger.info("Enter the elements");
		Utility.getGenericArrayWords(arr);
		try {
			Utility.mergeSorted(arr);
			Utility.printMergeArrays(arr);
		} catch (MergeSortException e) {
			e.printStackTrace();
		}
			
	}
}
