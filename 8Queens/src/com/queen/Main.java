package com.queen;

public class Main {
	static int[] columnforrow = new int[8];
	public static void main(String args[])
	{
		
		placeQueen(0);
	}
	public static void placeQueen(int row)
	{
		if(row == 8)
			{
			for(int j=0 ; j<8 ; j++)
			
			{
				System.out.println(""+columnforrow[j]);
			}
			return ;
			}
		
		for(int i =0 ; i<8 ;i++)
		{
			columnforrow [row] =i;
			if(check(row))
				placeQueen(row+1);
		}
		
		
	}
	public static boolean check(int row)
	{
		for(int i =0 ;i<row ;i++)
		{
			int diff = Math.abs(columnforrow[i]-columnforrow[row]);
			if(diff ==0 || diff == Math.abs(i - row))
				return false;
			
		}
	
			return true;
	}
}
