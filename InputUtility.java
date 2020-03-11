package com.bridgelabz.fellowship.util;

import java.util.Random;
import java.util.Scanner;

public class InputUtility {

	private static final Scanner sc= new Scanner(System.in);
	private static final Random random = new Random();
	public static long intRdVal()
	{
		return random.nextLong();
	}
	public static int intVal()
	{
		return sc.nextInt();
	}
	public static long longVal()
	{
		return sc.nextLong();
	}
	public static double doubleVal()
	{
		return sc.nextDouble();
	}
	public static float floatVal()
	{
		return sc.nextFloat();
	}
	public static byte byteVal()
	{
		return sc.nextByte();
	}
	public static boolean booleanVal()
	{
		return sc.nextBoolean();
	}
	public static String stringVal()
	{
		return sc.nextLine();
	}
	public static String stringValue()
	{
		return sc.next();
	}
	public static char charVal()
	{
		return sc.next().charAt(0);
	}
	///////////////////////////////////////////////////////////////
	public static Integer genericintVal()
	{
		return sc.nextInt();
	}
	public static Long genericlongVal()
	{
		return sc.nextLong();
	}
	public static Double genericdoubleVal()
	{
		return sc.nextDouble();
	}
	public static Float genericfloatVal()
	{
		return sc.nextFloat();
	}
	public static Byte genericbyteVal()
	{
		return sc.nextByte();
	}
	public static Boolean genericbooleanVal()
	{
		return sc.nextBoolean();
	}
	public static String genericstringVal()
	{
		return sc.nextLine();
	}
	public static String genericstringValue()
	{
		return sc.next();
	}
	public static char genericcharVal()
	{
		return sc.next().charAt(0);
	}
	
	
}
