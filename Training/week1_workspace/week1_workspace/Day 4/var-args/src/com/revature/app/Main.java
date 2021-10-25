package com.revature.app;

/* 
 * Var-args is variable arguments. Java has included a feature that simplifies the creation of methods 
 * that need to take a variable number of arguments. This feature is called varargs and it is short-form 
 * for variable-length arguments. A method that takes a variable number of arguments is a varargs method */


public class Main {

	public static void main(String[]... args) { //...is what is know as var-args
		//The purpose of var-args is to have the abliity to provide abitrary number of parameters (of a particular type)
		
		System.out.println("Hello" + args[0] + "" + args[1]);
		
		System.out.println(getSum(10.5, 5.757));
		
		System.out.println(getSum(1.5, 2.5, 3.2, 4.5, 10, 11.1, 15, 1000, 2000));
	}
		public static double getSum(double a, double b) {
			System.out.println("getSum with 2 doubles invoked");
			return a + b;
			
		}
		
		public static double getSum(double...numbers) {
			double sum = 0;
			
			for (double num: numbers) {
				sum += num;
			}
			return sum;
		}

}
