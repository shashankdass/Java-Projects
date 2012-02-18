package com.palindrome;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Palindrome pal = new Palindrome();
		int mincost = 0;
		String x = "o??oxxo?xoox?ox??x??" ;
		int ocost = 3;
		int xcost = 10;
		mincost = pal.getMinimum(x,ocost,  xcost);
		System.out.println("Mincost = "+mincost);
	}

}
