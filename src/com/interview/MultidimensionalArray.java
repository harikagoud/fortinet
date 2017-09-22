package com.interview;

import java.util.ArrayList;

public class MultidimensionalArray {
	static Long value = 0L;

	public static void main(String[] agrs){
		int one[] = new int[1];
		int two[] = new int[2];
		int three[] = new int[3];
		one[0] = 10;
		two[0] = 3;
		two[1] = 2;
		three[0] = 3;
		three[1] = 2;
		three[2] = 4;
		sum(new MultidimensionalArray(), one);
		sum(new MultidimensionalArray(), two);
		sum(new MultidimensionalArray(), three);
	}
	// This is a provided function, Assume it works
	public static Long getValue(int... indexOfDimension) {
		//... 
		return value;
	}
	// lengthOfDeminsion: each dimension's length, assume it is valid: lengthOfDeminsion[i]>0.
	public static Long sum(MultidimensionalArray mArray, int[] lengthOfDeminsion) {
		long prod = 1;
		for(int i = 0 ; i < lengthOfDeminsion.length; i++){
			prod = prod * lengthOfDeminsion[i];
		}
		long sum = 0;
		for(int i = 0 ; i < prod; i++){
			ArrayList<Integer> indexs = getIndexs(i, lengthOfDeminsion);
			int finalIndexs[] = new int[indexs.size()];
			for(int j = 0 ; j < finalIndexs.length; j++){
				finalIndexs[j] = indexs.get(j);
			}
			sum += getValue(finalIndexs);
		}
		return sum;
	}
	
	public static ArrayList<Integer> getIndexs(int k, int[] dims){
		int prod = 1;
		for(int i = 1; i < dims.length; i++){
			prod = prod * dims[i];
		}
		ArrayList<Integer> result = new ArrayList<Integer>();
		for(int i = 0; i < dims.length-1; i++){
			int val = k/prod;
			k = k % prod;
			prod = prod / dims[i+1];
			result.add(val);
		}
		result.add(k);
		return result;
	}


}