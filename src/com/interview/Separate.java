package com.interview;

import java.util.List;

public class Separate {
	public boolean separate(List<Integer> list, int k) {
		int sumtotal = 0;
		int sumsubset = 0;
		if(list.size() < k)
		return false;
		for (int i : list)
		sumtotal = sumtotal + i;
		 if (sumtotal%k != 0)
	        return false;
		sumsubset = sumtotal / k;
		if (sumsubset == 0)
			return true;
		if (k == 0 && sumsubset != 0)
			return false;

		return true;
	
	}
	
	
}