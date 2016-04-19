package com.app.algorithm.search.test;

import com.app.algorithm.search.BinarySearch;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BinarySearchTest
{
	BinarySearch binarySearch = new BinarySearch();

	@Before
	public void setUp() throws Exception
	{
	}

	@After
	public void tearDown() throws Exception
	{
	}

	@Test
	public void testBinarySearch()
	{
		int[] array = { 21, 51, 36, 52, 56, 62, 83 };
		int index=binarySearch.binarySearch(array, 0, array.length, 56);
		assertNotNull(index);
	}
	
	@Test
	public void testBinaryNegativeSearch()
	{
		int[] array = { 21, 51, 36, 52, 56, 62 };
		int index=binarySearch.binarySearch(array, 100, array.length, 56);
		assertNotNull(index);
	}
	
	@Test
	public void testStringBinarySearch()
	{
		String[] array = {"Pavan","kumar","jil","Kodi"};
		List<String> arrayList = Arrays.asList(array);
		String StringReceived=binarySearch.stringBinarySearch(arrayList, 0, array.length, "jil");
		assertNotNull(StringReceived);
	}
	
}
