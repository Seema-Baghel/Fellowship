package com.bridgelabz.fellowship.algorithm_programs;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import com.bridgelabz.fellowship.exceptions.MergeSortException;
import com.bridgelabz.fellowship.util.InputUtility;
import com.bridgelabz.fellowship.util.Utility;

public class MainMergeSort {

	public static void main(String[] args) {
		PropertyConfigurator.configure("loggers\\log4j.properties");
		Logger logger=Logger.getLogger(MainMergeSort.class);
		logger.info("Enter the no of word");
		int n1=InputUtility.intVal();
		String[] arr=new String[n1];
		logger.info("Enter the elements");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=InputUtility.stringValue();	
		}
		try {
			Utility.mergeSort(arr);
			Utility.printMergeArray(arr);
		} catch (MergeSortException e) {
			e.printStackTrace();
		}
			
	}
}
