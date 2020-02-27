package com.bridgelabz.fellowship.util;

import java.time.LocalTime;

import java.util.Arrays;
import java.util.Random;

import com.bridgelabz.fellowship.exceptions.AnagramDetectionException;
import com.bridgelabz.fellowship.exceptions.BinaryException;
import com.bridgelabz.fellowship.exceptions.BinarySearchException;
import com.bridgelabz.fellowship.exceptions.BubbleSortException;
import com.bridgelabz.fellowship.exceptions.CouponException;
import com.bridgelabz.fellowship.exceptions.DaysOfWeekException;
import com.bridgelabz.fellowship.exceptions.DistanceException;
import com.bridgelabz.fellowship.exceptions.FlipCoinException;
import com.bridgelabz.fellowship.exceptions.GamblingSimulatorException;
import com.bridgelabz.fellowship.exceptions.HarmonicValueException;
import com.bridgelabz.fellowship.exceptions.InsertionSortException;
import com.bridgelabz.fellowship.exceptions.LeapYearException;
import com.bridgelabz.fellowship.exceptions.MergeSortException;
import com.bridgelabz.fellowship.exceptions.MonthlyPaymentException;
import com.bridgelabz.fellowship.exceptions.PermutationException;
import com.bridgelabz.fellowship.exceptions.PowerOfTwoException;
import com.bridgelabz.fellowship.exceptions.PrimeFactorException;
import com.bridgelabz.fellowship.exceptions.PrimeNumException;
import com.bridgelabz.fellowship.exceptions.QudraticException;
import com.bridgelabz.fellowship.exceptions.ReplaceStringException;
import com.bridgelabz.fellowship.exceptions.SqrtException;
import com.bridgelabz.fellowship.exceptions.StopWatchException;
import com.bridgelabz.fellowship.exceptions.TemperatureConversionException;
import com.bridgelabz.fellowship.exceptions.TicTacToeException;
import com.bridgelabz.fellowship.exceptions.TripletException;
import com.bridgelabz.fellowship.exceptions.TwoDimentionalArrayException;
import com.bridgelabz.fellowship.exceptions.VendingMachineException;
import com.bridgelabz.fellowship.exceptions.WindChillException;

public class Utility {

	//Leap Year
	public static boolean isLeapyear(int year)throws LeapYearException
	{
		if(year<1582)
		{
			throw new LeapYearException("Invalid year");
		}else {
			if(year%4==0)
			{
				return true;
				}else if((year%100!=0)&&(year%400==0))
			{
				return true;
			}
			else
			{
				return false;
			}
		}
	}
	
	//Harmonic Value
	public static double harmonicValue(double n) throws HarmonicValueException
	{
		if(n<0)
		{
			throw new HarmonicValueException("Invalid number");
		}
		else {
			double k=1;
			double  j=2;
			while(j<n+1){
				System.out.println(k);
				k=k+(1/j);
			j++;
			}
			return k;
		}
	}
	
	//Power of two
	public static int powerOfTwo(int n1) throws PowerOfTwoException
	{
		if(n1<0)
		{
			throw new PowerOfTwoException("Invalid number");
		}
		else {
		int j=(int)Math.pow(2,n1);
		int k=2;
		while(k<j){
		 k=k*2;
		}
		return k;
		}
	}
	
	//PrimeFactor
	public static int isPrimeFactor(int num) throws PrimeFactorException
	{
		if(num<0)
		{
			throw new PrimeFactorException("Invalid number");
		}
		else
		{
		for(int i=2; i<num;i++)
		{
			while(num%i==0)
			{
				System.out.println(i+" ");
				num=num/i;
			}
		}
		if(num>2)
		{
			return num;
		}
		}
		return num;
	}
	
	//ReplaceString
	public static String replaceString(String s1)throws ReplaceStringException
	{
		if(s1.length()>2)
		{
			String str=new String("Hello <<username>>, how are you");
			return str.replace("<<username>>", s1);
		}else
		{
			throw new ReplaceStringException("Enter the name greater than 3 char");
		}
	}
	
	//FlipCoin
	public static String flipCoin(int t)throws FlipCoinException
	{
		double chead=0, ctail=0;
			if (t>0) {
				for(int i=0;i<t;i++)
				{
					if(Math.random()>0.5)
					{
						chead++;
					}else {
						ctail++;
					}
				}
			}else{
				throw new FlipCoinException("Cooin not flipped");
			}
			double head=chead/t*100;
			double tail=ctail/t*100;
			return "Percentage of head is "+head+" and tail is "+tail;		
		}

	//Distance
	public static double checkDistance(int x, int y)throws DistanceException
	{
		double dist;
		if(x==0&&y==0)
		{
			throw new DistanceException("Invalid distance");
		}else {
			dist=(x*x)+(y*y);
		}
		return Math.sqrt(dist);
	}

	//Qudratic
	public static String checkQudratic(int x2, int x, int c)throws QudraticException
	{
		double root1, root2;
		if(x2==0&&x==0&&c==0)
		{
			throw new QudraticException("Invalid Coefficient");
		}
		else {
			double delta=4*x2*c-(Math.pow(x,2));
			root1= (Math.sqrt(delta)-x)/(2*x2);
			root2= (-x - Math.sqrt(delta))/(2*x2);
		}
		return "Qudratic values are "+root1+" and "+root2;
	}
	
	//2DArray
	public static void printTwoDArray(int p[][], int r, int c) throws TwoDimentionalArrayException
	{
		 int n=p.length;
		if(n==0 && r==0 && c==0)
		{
			throw new TwoDimentionalArrayException("Enter valid row and col value");
		}
		else {
			for (int i = 0; i <r; i++) {
				for (int j = 0; j < c; j++) {
					System.out.print(p[i][j]+" ");
					}
				System.out.println();
			}
			
		}
		 
		
	}
	
	//WindChill
	public static double checkWindChill(double t , double s) throws WindChillException

	{
		double w;
		if(t>50 &&s>120)
		{
			throw new WindChillException("Out of range");
		}else {
			w=35.74+0.6215*t+(0.4275*t-35.75)*Math.pow(s, 0.16);
		}
		return w;
	}

	
	public static int[] get1DArray(int n)
	{
		int arr[]= new int[n];
		for (int i = 0; i < n; i++)
		{
			arr[i]= InputUtility.intVal();
		}
		return arr;
	}
	
	//Add Triplet
	public static int addTriplets(int array[]) throws TripletException
	{
		int count = 0;
		if(array.length==0)
		{
			throw new TripletException("Give some input");
		}
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				for (int k = 0; k < array.length; k++) {
					if ((array[i] + array[j] + array[k]) == 0) {
						System.out.println(array[i] + " " + array[j] + " "
								+ array[k]);
						count++;
					}
				}
			}
		}
		return count;
	}

	//Gambling Simulator
	public static void gamblingSimulator(int stake, int goal, int n)throws GamblingSimulatorException
	{
		double w=0, l=0;
		if(stake<=0 || stake>goal || n<=0)
		{
			throw new GamblingSimulatorException("Invalid input");
		}
		while(stake>0&& stake!=goal &&n>0)
		{
			System.out.println("Enter the bet amount");
			int bet=InputUtility.intVal();
			if(bet>stake)
			{
				System.out.println("bet is more than stake");
				continue;
			}
			if(Math.random()>0.5)
			{
				System.out.println("You won the bet");
				stake=stake+bet;
				w++;
			}
			else
			{
				System.out.println("You lost the bet");
				stake=stake-bet;
				l++;
			}
			System.out.println("stake:"+stake);
			System.out.println("No. of win:"+w+" No. of loss:"+l);
			System.out.println("Percentage :"+(w/l)*100);
			n--;
			}
	}
	
	//StopWatch
	public static void stopWatch(char c)throws StopWatchException
	{
		if (c=='s'||c=='S') {
			System.out.println("StopWatch statred");
			LocalTime  l=java.time.LocalTime.now();
			int h=l.getHour();
			int m=l.getMinute();
			int s=l.getSecond();
			System.out.println(l);
			char c1=(InputUtility.stringVal()).charAt(0);
			if (c1=='e'||c1=='E') {
				System.out.println("stopwatch ended");
				LocalTime  l1=java.time.LocalTime.now();
				int h1=l1.getHour();
				int m1=l1.getMinute();
				int s1=l1.getSecond();
				int hours=h1-h;
				int min=m1-m;
				int sec=s1-s;
			System.out.println(hours+"hours "+min+"minutes "+sec+"seconds");
			}
			else {
				throw new StopWatchException("Only allowed option is e here");
			}
		}
		else {
			throw new StopWatchException("Only allowed option is s here");
			}
		}

	//TicTacToe Game
	public static void dispMat(char mat[][]) 
	{
		
		for(int i=0;i<mat.length;i++)
		{
			for (int j = 0; j < mat.length; j++) 
			{
				System.out.print(mat[i][j]+"|");
			}
			System.out.println();
			for (int j = 0; j < mat.length; j++)
			{
				System.out.print("__");
			}
			System.out.println();
		}
	}

	public static void playCom(char[][] t) 
	{
		System.out.println("Computer Term Enter the Cell indexes");
		Random rd=new Random();
		int r=rd.nextInt(t.length);
		int c=rd.nextInt(t.length);
		System.out.println(r);
		System.out.println(c);
		if(t[r][c]==0)
			t[r][c]='X';
		else
		{
			System.out.println("Invalid input..");
			playCom(t);
		}
	}
	public static boolean checkWinCom(char[][] t) 
	{
		int pd=0,sd=0;
		for(int i=0;i<t.length;i++)
		{
			int r=0;
			int c=0;
			for(int j=0;j<t[i].length;j++)
			{
				if(t[i][j]=='X')
					r++;
				if(t[j][i]=='X')
					c++;
				if(i==j&&t[i][j]=='X')
					pd++;
				if(i+j==t.length-1&&t[i][j]=='X')
					sd++;
			}
			if(r==t.length||c==t.length)
				return true;
		}
		if(pd==t.length||sd==t.length)
				return true;
		return false;
	}

	public static void playUser(char[][] t) 
	{
		System.out.println("User Term Enter the Cell indexes");
		int r=InputUtility.intVal();
		int c=InputUtility.intVal();
		if(t[r][c]==0)
			t[r][c]='O';
		else
		{
			System.out.println("Invalid input..");
			playUser(t);
		}
	}

	public static boolean checkWinUser(char[][] t) 
	{
		int pd=0,sd=0;
		for(int i=0;i<t.length;i++)
		{
			int r=0;
			int c=0;
			for(int j=0;j<t[i].length;j++)
			{
				if(t[i][j]=='O')
					r++;
				if(t[j][i]=='O')
					c++;
				if(i==j&&t[i][j]=='O')
					pd++;
				if(i+j==t.length-1&&t[i][j]=='O')
					sd++;
			}
			if(r==t.length||c==t.length)
				return true;
		}
		if(pd==t.length||sd==t.length)
				return true;
		return false;
	}
	public static void tictactoe(char t[][], int n)throws TicTacToeException
	{
		if(n<=2 )
		{
			throw new TicTacToeException("Invalid input");
		}
		dispMat(t);
		int count=n*n;
		while(count>0)
		{
				playCom(t); 
				count--;
				dispMat(t);
				boolean rs=checkWinCom(t);
			if(rs)
			{
				System.out.println("Computer won the Game..");
				break;
			}
			if(count==0)
				break;
		System.out.println("<----End---->");
			playUser(t);
			dispMat(t);
					rs=checkWinUser(t);
				if(rs)
				{
					System.out.println("User won the Game..");
					break;
				}
				count--;
		}
		if(count==0)
				System.out.println("Draw...");
	}
	
	//Coupon
	public static String coupon(int n) throws CouponException
	{
		String[] arr=new String[n];
		if(n<=0)
		{
			throw new CouponException("Give positive value");
		}else {
			while(n!=0)
			{
				long val=InputUtility.intRdVal();
				 char c=(char)(64+n);
				 String cou=val+"@"+c;
				arr[--n]=cou;
			}
		}
		return Arrays.toString(arr);
	}

//............................JUnitTesting Programs......................................//
	
	//Vending Machine
	public static void vendingMachine(int n)throws VendingMachineException
	{
		int n1=n;
		int count=0;
		boolean flag=true;
		int rem=0;
		int thousand=0,one=0,two=0,five=0,ten=0,fifty=0,hundred=0,fivehundred=0;
		if(n1<0)
		{
			throw new VendingMachineException("Invalid amount");
		}
		while(flag) {
			if(n/1000>=1) {
			
				rem=rem+1000;
				thousand++;
				n=n-1000;
				count++;
				if (rem==n1) {
					flag=false;
				}
				}
			else if(n/500>=1) {
				rem=rem+500;
				fivehundred++;
				n=n-500;
				count++;
				if (rem==n1) {
					flag=false;
				}
			}
			else if(n/100>=1) {
				rem=rem+100;
				hundred++;
				n=n-100;
				count++;
				if (rem==n1) {
					flag=false;
				}
			}
			else if(n/50>=1) {
				rem=rem+50;
				fifty++;
				n=n-50;
				count++;
				if (rem==n1) {
					flag=false;
				}
			}
			else if(n/10>=1) {
				rem=rem+10;
				ten++;
				n=n-10;
				count++;
				if (rem==n1) {
					flag=false;
				}
			}
			else if(n/5>=1) {
				rem=rem+5;
				five++;
				n=n-5;
				count++;
				if (rem==n1) {
					flag=false;
				}
			}
			else if(n/2>=1) {
				rem=rem+100;
				two++;
				n=n-2;
				count++;
				if (rem==n1) {
					flag=false;
				}
			}
			else if(n/1>=1) {
				rem=rem+1;
				one++;
				n=n-1;
				count++;
				if (rem==n1) {
					flag=false;
				}
				
			}
		}
		System.out.println("total number of notes: "+count);
		
	System.out.println("thousand note: "+thousand+"\n"+"five hundred note: "+fivehundred+"\n"+"hundred note: "+hundred+
			"\n"+"fifty note: "+fifty+"\n"+"ten note: "+ten+"\n"+"five note: "+five+"\n"
			+"two note: "+two+"\n"+"one note: "+one);
	}
	
	//Days of week
	public static void daysOfWeek(int d, int m, int y)throws DaysOfWeekException
	{
		if(d<=0|| m<=0|| y<1582)
		{
			throw new DaysOfWeekException("Invalid date");
		}
		int y0= y-(14-m)/12;
		int x=y0+y0/4-y0/100+y0/400;
		int m0=m+12*((14-m)/12)-2;
		int d0=(d+x + 31*m0 /12)% 7;
		switch(d0)
		{
		case 0:
			System.out.println("Sunday");
			break;
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thusday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		
			}
		}	
	
	//Temperature Conversion
	public static void tempConv(int Ftemp, int Ctemp)throws TemperatureConversionException
	{
		if(Ctemp<0 && Ftemp<0)
		{
			throw new TemperatureConversionException("Invalid Temperature");
		}else {
		 		Ctemp = (Ctemp * 9) / 5 + 32;  
		 		Ftemp = ((Ftemp- 32)*5)/9;
		 		System.out.println("temperature in Farhrenheit = " + Ctemp);
		 		System.out.println("temperature in Celsius = " + Ftemp);
			}
	}
	
	//Monthly Payment
	public static double monthlyPayment(double p, double r, int y)throws MonthlyPaymentException
	{
		double R;
		double Payment;
		if(p<0 || r<=0 || y<=0)
		{
			throw new MonthlyPaymentException("Invalid input");
		}else {
			int n=12*y;
			R=r/(12*100);
			Payment=(p*r)/(1- Math.pow(1+r, -n));
			
		}
		return Payment;
	}
	
	//Sqrt 
	public static double sqrt(int n)throws SqrtException
	{
		int t=n;
		if(n<=0)
		{
			throw new SqrtException("Invalid input");
		}else {
			double epsilon=1e-15;
			while( (Math.abs(t - n/t)) > epsilon*t) 
			{
				t=(t+n/t)/2;
			}
		}
		return t;
	}

	//To decimal to Binary convertion
	public static String toBinary(int n)throws BinaryException {
		int rem;
		if(n<=0)
		{
			throw new BinaryException("Input should be a postive value");
		}
		String bin[] = { "0", "1" };
		String binary = "";
		int padding = 0;
		while (n > 0 || padding % 8 != 0) {
			rem = n % 2;
			binary = bin[rem] + binary;
			n = n / 2;
			padding++;
			if (padding % 4 == 0 && n != 0) {
				binary = " " + binary;

			}
		}
		return binary;
	}

	//Nibble swap
	public static String swappedNibbles(String binary) {
		binary = binary.replaceAll(" ", "");
		String lowerNibble = binary.substring(0, 4);
		String upperNibble = binary.substring(4, 8);
		String swappedBinary = upperNibble + lowerNibble;
		return swappedBinary;
	}

	//Binary to Decimal convertion
	public static int binaryToDecimal(String binary) {
		int dec = 0, p = 0;
		binary = binary.replaceAll(" ", "");
		int in = binary.length() - 1;
		while (in >= 0) {
			dec = dec+(int) (Integer.parseInt(binary.charAt(in) + "") * Math
					.pow(2, p));
			p++;
			in--;
		}
		return dec;

	}

//.......................Algorithm Program...............................//
	//Binary Search
	public static String[] wordList(String s1)
	{
		String s2[]=s1.split(" ");
		return s2;
	}
	public static boolean binarySearch(String s1, String s2) throws BinarySearchException
	{
		String[] s3=wordList(s1);
		int f = 0, l = s3.length - 1; 
		if(s3.length<0)
		{
			throw new BinarySearchException("Give the input");
		}
	    int m = (f+l) / 2; 
	    while (f <= l) {
	    	int res = s2.compareTo(s3[m]); 
	          if (res == 0) 
	                return true; 
	          else if (res > 0) 
	                f = m + 1; 
	          else
	                l = m - 1; 
	          m = (f+l) / 2;   
	        } 
	        return false; 
	    } 
	
	//Insertion Sort
	public static String insertionSort(String[] s1)throws InsertionSortException
	{
		int n=s1.length;
		for (int i = 1; i < n; i++) {
			String t = s1[i];
			int j = i - 1;
			while (j >= 0 && t.length()< s1[j].length()) {
				s1[j + 1] = s1[j];
				j--;
			}
			s1[j + 1] = t;
		}
		return Arrays.toString(s1);
	}
	
	public static int[] getArray(int[] n)
	{
		for(int i=0;i<n.length;i++)
		{
			n[i]=InputUtility.intVal();
		}
		return n;	
	}
	
	//Bubble Sort
	public static void bubbleSort(int[] n)throws BubbleSortException
	{
		int[] n1=getArray(n);
		if(n.length<0)
		{
			throw new BubbleSortException("Input elements");
		}else {
		for(int i=0;i<n.length-1;i++) {
			for(int j=0;j<n.length-1-i;j++) {
				if (n[j]>n[j+1]) {
					int temp=n[j];
					n[j]=n[j+1];
					n[j+1]=temp;
				}
			}
			}
		}
		System.out.println("using bubble sort");
		for (int r:n) {
			System.out.println(r);
		}
	}
	
	public static String[] getArray(String[] s1)
	{
		for(int i=0; i<s1.length;i++)
		{
			s1[i]=InputUtility.stringVal();
		}
		return s1;
	}
	
	//Merge Sort
	public static void mergeSort(String[] a)throws MergeSortException 
	{
		if(a.length==1)
			return;
		String[] b=new String[a.length/2];
		String[] c=new String[a.length-b.length];
		int i;
		for(i=0;i<b.length;i++) 
		{
			b[i]=a[i];		
		}
		for (int j=0;j<c.length;j++)
		{
			c[j]=a[i];
			i++;
		}
		mergeSort(b);
		mergeSort(c);
		merge(b,c,a);
	}
	
	public static void merge(String[] b,String[] c,String[] a) 
	{
		int i=0,j=0,k=0;
		while(i<b.length&&j<c.length)
		{
			if(b[i].compareTo(c[j])<0)
				a[k++]=b[i++];
			else
				a[k++]=c[j++];
		}
		while(i<b.length)
			a[k++]=b[i++];
		while(j<c.length)
			a[k++]=c[j++];
	}
	
	public static void printMergeArray(String[] arr) 
	{
         for (int i = 0; i < arr.length; i++) {
        	 System.out.println(arr[i] + " ");
         }
	}

	//Anagram Detection
	public static boolean isAnagram(String str1, String str2)throws AnagramDetectionException
	{
		boolean isAnagram = true;
		char arr1[] = str1.toLowerCase().toCharArray();
		char arr2[] = str2.toLowerCase().toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		if (arr1.length != arr2.length) 
		{
			return false;
		} else {
			for (int i = 0; i < arr1.length; i++) 
			{
				if (arr1[i] == arr2[i]) 
				{
					isAnagram = true;
				} else {
					isAnagram = false;
					break;
				}
			}
		}
		return isAnagram;
	}
	
	public static boolean isPalindrome(String str) 
	{
		char arr[] = str.toLowerCase().toCharArray();
		boolean isPalindrome = true;
		int j = arr.length - 1;
		for (int i = 0; i < arr.length; i++, j--) 
		{
			if (arr[i] == arr[j]) 
			{
				isPalindrome = true;
			} else 
			{
				isPalindrome = false;
				return isPalindrome;
			}
		}
		return isPalindrome;

	}

	//PrimeNumber 0 to 1000
	public static boolean isPrime(int n) 
	{
		if (n < 2) 
		{
			return false;
		}
		for (int i = 2; i * i <= n; i++)
		{
			if (n % i == 0)
			{
				return false;
			}
		} 
		return true;
	}

	public static void printPrimes(int n1) 
	{
		for (int n = 0; n <= n1; n++) 
		{
			if (isPrime(n)) 
			{
				System.out.println(n);
			}
		}
	}

	public static void printPrimePalindrome(int n1) 
	{
		for (int n = 2; n < n1; n++) 
		{
			if (isPrime(n)) 
			{
				if (isPalindrome(Integer.toString(n))) 
				{
					System.out.println(n);
				}
			}
		}
	}
	public static void printPrimeAnagram(int n1) 
	{
		for (int n = 2; n < n1; n++) 
		{
			if (isPrime(n)) 
			{
//				if (isAnagram(Integer.toString(n))) 
				{
					System.out.println(n);
				}
			}
		}
	}

	//Permutation of String
	public static void isRecurssion(String s1, String ans)throws PermutationException
	{
		 if (s1.length() == 0) { 
	            System.out.print(ans + " "); 
	            return; 
	        } 
	        for (int i = 0; i < s1.length(); i++) { 
	           
	            char ch = s1.charAt(i); 
	            
	            String ros = s1.substring(0, i) +  
	                         s1.substring(i + 1); 
	           
	            isRecurssion(ros, ans + ch); 
	        } 
	}
	public static void isIterative(String str, int l, int r)throws PermutationException
	{
		if (l == r) 
            System.out.println(str); 
        else
        { 
            for (int i = l; i <= r; i++) 
            { 
                str = swap(str,l,i); 
                isIterative(str, l+1, r); 
                str = swap(str,l,i); 
            } 
        } 
	}
	 public static String swap(String a, int i, int j) 
	    { 
	        char temp; 
	        char[] charArray = a.toCharArray(); 
	        temp = charArray[i] ; 
	        charArray[i] = charArray[j]; 
	        charArray[j] = temp; 
	        return String.valueOf(charArray); 
	    }
	 
	/* public static <S> void printGenericArray(<S>[]s)
	 {
		 for(int i=0; i<s.length; i++)
			 
	 }*/
	
	
}
























