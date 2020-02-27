package com.bridgelabz.fellowship.logical_programs;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.bridgelabz.fellowship.exceptions.TicTacToeException;
import com.bridgelabz.fellowship.util.InputUtility;
import com.bridgelabz.fellowship.util.Utility;

public class MainTicTacToe {


	public static void main(String[] args) {
		PropertyConfigurator.configure("loggers\\log4j.properties");
		Logger logger=Logger.getLogger(MainTicTacToe.class);
		logger.info("Enter the order");
		int n=InputUtility.intVal();
		char t[][]=new char[n][n];
		try {
			Utility.tictactoe(t, n);
		}catch(TicTacToeException e)
		{
			e.printStackTrace();
		}
				
	}
}
