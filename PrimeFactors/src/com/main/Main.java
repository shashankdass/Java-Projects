package com.main;

import java.util.ArrayList;
import java.util.List;

public class Main {

	/**
	 * @param args
	 */
	 private static void main(String[] args) {
		// TODO Auto-generated method stub
		int k = 13;
		List<Integer> finarr = new ArrayList<Integer> ();
		List<Integer> arrth = new ArrayList<Integer> ();
		List<Integer> arrfi = new ArrayList<Integer> ();
		List<Integer> arrse = new ArrayList<Integer> ();
		finarr.add(1);
		arrth.add(3);
		arrfi.add(5);
		arrse.add(7);
		while(finarr.size() < k)
		{
			int min = arrth.get(0);
			if(arrfi.get(0) < arrse.get(0))
			{
				if(arrfi.get(0) < min)
					{
					min = arrfi.get(0);
					arrfi.add(arrfi.get(0)*5);
					arrfi.add(arrfi.get(0)*7);
					arrfi.remove(0);
					}
				else
				{
					arrth.add(arrth.get(0)*3);
					arrth.add(arrth.get(0)*5);
					arrth.add(arrth.get(0)*7);
					arrth.remove(0);
				}
				
			}
			else
			{
				if(arrse.get(0)<min)
				{
					min = arrse.get(0);
					arrse.add(arrse.get(0)*7);
					arrse.remove(0);
				}
				else
				{
					arrth.add(arrth.get(0)*3);
					arrth.add(arrth.get(0)*5);
					arrth.add(arrth.get(0)*7);
					arrth.remove(0);
				}
			}
			finarr.add(min);
		}
		for(int i=0 ; i<finarr.size() ; i++)
		{
			System.out.println(finarr.get(i));
		}
 	}

}
