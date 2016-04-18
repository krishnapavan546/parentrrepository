package com.app.algorithm.search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.log4j.Logger;

public class BinarySearch
{
	
	Logger logger=Logger.getLogger("log4j.properties");
	

	int start = 0;
	

	public int binarySearch(int[] array, int start, int end, int searchValue)
	{
		Arrays.sort(array);
		
		if (start < end)
		{
			int mid = start + (end - start) / 2;
			if (searchValue < array[mid])
			{
				return binarySearch(array, start, mid, searchValue);

			}
			else if (searchValue > array[mid])
			{
				return binarySearch(array, mid + 1, end, searchValue);

			}
			else
			{
				return mid;
			}
		}
		else
		{
			return -(start + 1);
		}

	}
	public String stringBinarySearch(List<String> stringArray, int start, int end, String searchString)
	{
		String foundString=null;
		for (String string : stringArray)
		{
			if(string.contains(searchString))
			{
				logger.info("Found String in ArrayList"+searchString);
				foundString = searchString;
				
			}
			else
			{
				logger.info("Not Found String in ArrayList"+searchString);
				foundString="";
			}
		}
		return foundString;
				

	}
	

}
