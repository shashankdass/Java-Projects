package com.palindrome;

public class Palindrome {

	int getMinimum(String x, int ocost, int xcost) {
		int min = 0;

		for (int i = 0, j = x.length()- i- 1; i<j; i++,j--)
			 {
				if (x.charAt(i) == x.charAt(j))
					{
					if (x.charAt(i) == '?' && x.charAt(j) == '?')
						min = min + 2 * Math.min(ocost, xcost);
					}
				else {
					if (x.charAt(i) == '?' || x.charAt(j) == '?') {
						
						if (x.charAt(i) == '?') {
							if (x.charAt(j) == 'x')
								min += xcost;
							if (x.charAt(j) == 'o')
								min += ocost;
						}
						if (x.charAt(j) == '?') {
							if (x.charAt(i) == 'x')
								min += xcost;
							if (x.charAt(i) == 'o')
								min += ocost;
						}
					}
					else
					{
						min =-1;
						break;
					}

				}
			}

		return min;
	}
}
