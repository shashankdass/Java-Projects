package com.permutation;

import java.util.ArrayList;

public class Permutation {
	static ArrayList<String> arr = new ArrayList<String>();

	public void getPerm(String begin, String end) {

		if (end.length() <= 1)
			System.out.println(begin + end);
		else {
			for (int i = 0; i < end.length(); i++) {
				//begin = end.substring(0, i);
				String endString = end.substring(0,i)+end.substring(i + 1);
				getPerm(begin+end.charAt(i), endString);
			}
		}
	}
}
