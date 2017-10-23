/*
 * constructor.java
 * Copyright (C) 2017 SINCHIGUANO CESAR <cesarsinchiguano@hotmail.es>
 *
 * Distributed under terms of the MIT license.
 */

class constructor
{
	private
		String girlName;
	
	//MY CONSTRUCTOR
	public constructor(String name) 
	{
		girlName=name;
	}
	//MY FIRST METHOD
	public void saying()
	{
		System.out.printf("Ur first girlfriend was %s\n", getName());
	}
	public String getName()
	{
		return girlName;
	}
}	

