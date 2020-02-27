package com.bridgelabz.fellowship.logical_programs;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.bridgelabz.fellowship.exceptions.CouponException;
import com.bridgelabz.fellowship.util.InputUtility;
import com.bridgelabz.fellowship.util.Utility;

public class MainCoupon {


	public static void main(String[] args) {
		PropertyConfigurator.configure("loggers\\log4j.properties");
		Logger logger=Logger.getLogger(MainCoupon.class);
		logger.info("Enter the number of coupon generated");
		int n=InputUtility.intVal();
		try {
			logger.info(Utility.coupon(n));
		}catch(CouponException e)
		{
			e.printStackTrace();
		}
				
	}
}
