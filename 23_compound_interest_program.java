/*
 * 23_compound_interest_program.java
 * Copyright (C) 2017 Sinchiguano Cesar <cesarsinchiguano@hotmail.es>
 *
 * Distributed under terms of the Phone:+420775098530 license.
 */

class compound_interest_program
{
	public static void main(String [] args)
	{
		System.out.printf("Hi, it is me again...\n");
		double amount;
		double principal=10000;
		double rate=.01;


		for(int day=1;day<20;day++)
		{
			amount=principal*Math.pow(1+rate,day);
			System.out.println(day+"  "+amount);

		}


	}
}
