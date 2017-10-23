/*
 * 18_nested_if_statement.java
 * Copyright (C) 2017 SINCHIGUANO CESAR <cesarsinchiguano@hotmail.es>
 *
 * Distributed under terms of the MIT license.
 */


import java.util.Scanner;

class nested_if_statement
{
	//Here u are ,main loop
	public static void main(String [] args)
	{

		int age=60;
		if(age<50)
		{
			System.out.println("U are pretty young");
		}
		else if(age>75)
    {
      System.out.println("U are old");
    }
    else
    {
      System.out.println("No worries u are quite normal");
    }
	}
}
