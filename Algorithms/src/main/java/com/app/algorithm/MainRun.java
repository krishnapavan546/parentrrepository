package com.app.algorithm;

import com.app.algorithm.resource.AlgorithmResource;
import com.app.algorithm.search.BinarySearch;
import com.sun.research.ws.wadl.Resource;

import io.dropwizard.Application;
import io.dropwizard.Configuration;
import io.dropwizard.jackson.Jackson;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import sun.applet.Main;

public class MainRun extends Application<Configuration>
{

	
	
	public static void main(String[] args) throws Exception
	{
		Configuration configuration = null;
		new MainRun().run(configuration, null);
		

	}

	@Override
	public void initialize(Bootstrap<Configuration> bootstrap)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void run(Configuration configuration, Environment environment) throws Exception
	{
		environment.jersey().register(new AlgorithmResource());
	}

}
