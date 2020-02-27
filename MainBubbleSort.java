package com.bridgelabz.fellowship.algorithm_programs;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import com.bridgelabz.fellowship.exceptions.BubbleSortException;
import com.bridgelabz.fellowship.util.InputUtility;
import com.bridgelabz.fellowship.util.Utility;

public class MainBubbleSort {

	public static void main(String[] args) {
		PropertyConfigurator.configure("loggers\\log4j.properties");
		Logger logger=Logger.getLogger(MainBubbleSort.class);
		logger.info("Enter the number of elements");
		int n1=InputUtility.intVal();
		logger.info("Enter the elements");
		int[] n= new int[n1];		
		try {
			Utility.bubbleSort(n);
		}catch(BubbleSortException e)
		{
			e.printStackTrace();
		}
				
	}
}
