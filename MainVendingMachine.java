package com.bridgelabz.fellowship.junittesting;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.bridgelabz.fellowship.exceptions.VendingMachineException;
import com.bridgelabz.fellowship.util.InputUtility;
import com.bridgelabz.fellowship.util.Utility;

public class MainVendingMachine {

	public static void main(String[] args) {
		PropertyConfigurator.configure("loggers\\log4j.properties");
		Logger logger=Logger.getLogger(MainVendingMachine.class);
		logger.info("Enter the amount to be returned");
		int n=InputUtility.intVal();
		
		try {
			Utility.vendingMachine(n);
		}catch(VendingMachineException e)
		{
			e.printStackTrace();
		}
	}	
}
