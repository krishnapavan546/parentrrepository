package com.app.algorithm;

import com.app.algorithm.search.BinarySearch;

public class MainRun
{

	public static void main(String[] args)
	{
		BinarySearch binarySearch = new BinarySearch();
		
		int[] array={21,51,36,52,56,62,83};
		int index=binarySearch.binarySearch(array, 0,array.length,56);
		System.out.println("Index found is "+index +" "+ array[index]);

	}

}
