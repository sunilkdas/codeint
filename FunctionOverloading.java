package com.info;

public class FunctionOverloading {
	/*
	 * public static int sum(int x,int y) { System.out.println(1); return x+y; }
	 */
	/*
	 * public static float sum(float x,int y) { System.out.println(2); return x+y; }
	 */
	
	  public static float sum(int x,float y) { System.out.println(3); return x+y; }
	 
	
	  public static Double sum(Double x,float y) { System.out.println(4); return
	  x+y; }
	 

	/*
	 * public static Double sum(Double x,Double y) { System.out.println(5); return
	 * x+y; }
	 */
	public static Double sum(float x,Double y) {
		System.out.println(6);
		return x+y;
	}
	public static void main(String[] args) {
		System.out.println(sum(5,8));
		System.out.println(sum(5.0,8));
		System.out.println(sum(5,8.0));
		System.out.println(sum(5.0f,8));
		System.out.println(sum(5,8.5f));
		System.out.println(sum(5.0f,8.0f));
	}
}
