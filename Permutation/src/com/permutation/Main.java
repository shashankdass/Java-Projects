package com.permutation;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Permutation perm = new Permutation();
		perm.getPerm("","abc");
		ArrayList<String> arr1 = Permutation.arr;
		Iterator<String> itr = arr1.iterator();
		while(itr.hasNext())
		{
				System.out.println("The element is :"+itr.next());
		}
	}

}
