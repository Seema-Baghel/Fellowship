package com.bridgelabz.fellowship.functional_programs;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import com.bridgelabz.fellowship.exceptions.TwoDimentionalArrayException;
import com.bridgelabz.fellowship.util.InputUtility;
import com.bridgelabz.fellowship.util.Utility;

public class MainTwoDimentionalArray {

	public static void main(String[] args) {
		PropertyConfigurator.configure("loggers\\log4j.properties");
		Logger logger=Logger.getLogger(MainTwoDimentionalArray.class);
		logger.info("Enter the number of row and column");
		int r=InputUtility.intVal();
		int c=InputUtility.intVal();
		int[][] p=new int[r][c];
		System.out.println("Enter"+(r*c)+"Array elements");
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				p[i][j]=InputUtility.intVal();
			}
		}
		try {
			Utility.printTwoDArray(p, r, c);
		}catch(TwoDimentionalArrayException e)
		{
			e.printStackTrace();
		}
				
	}
}
