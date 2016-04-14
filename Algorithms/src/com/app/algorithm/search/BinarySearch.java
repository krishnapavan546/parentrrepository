package com.app.algorithm.search;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class BinarySearch
{
	private Collection collection;

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

}
