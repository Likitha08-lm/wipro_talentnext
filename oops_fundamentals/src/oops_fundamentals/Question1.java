package oops_fundamentals;

import java.util.*;
public class Question1 {
	
	public class Calculator{
		 public static int powerInt(int num1, int num2) {
		        return  (int) Math.pow(num1, num2);
		    }
		    public static double powerDouble(double num1, int num2) {
		        return Math.pow(num1, num2);
		    }
	}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int intResult = Calculator.powerInt(2, 3); 
	        System.out.println(intResult);
	        double doubleResult = Calculator.powerDouble(2.5, 3);
	        System.out.println(doubleResult);
		}
		}


