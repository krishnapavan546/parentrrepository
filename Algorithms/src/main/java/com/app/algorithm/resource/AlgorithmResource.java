package com.app.algorithm.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import org.apache.log4j.Logger;

import com.app.algorithm.search.BinarySearch;

@Path(value = "/algorithm")
public class AlgorithmResource
{
	Logger log=Logger.getLogger(AlgorithmResource.class);
	
	@Path(value = "/binarySearch")
	@GET
	public int indexSearch(@QueryParam(value = "array") int[] array)
	{
		BinarySearch binarySearch = new BinarySearch();
		int index = binarySearch.binarySearch(array, 0, array.length, 56);
		log.info("Index found is " + index + " " + array[index]);
		return index;
	}
}
