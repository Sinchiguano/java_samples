/*
 * 08_math_operator.java
 * Copyright (C) 2017 SINCHIGUANO CESAR <cesarsinchiguano@hotmail.es>
 *
 * Distributed under terms of the MIT license.
 */

import java.util.Scanner;



class math_operator
{
	public static void main(String args[])
	{
		Scanner temp=new Scanner(System.in);
		/*
		int girls, boys,people;
		girls=6;
		boys=3;
		people=girls+boys;
		System.out.printf("The total: %d\n",people);
		*/

		/*
		double girls, boys,people;
		girls=6;
		boys=3;
		people=girls/boys;
		System.out.printf("The total: %f\n",people);
		*/
		//Module
		double girls, boys,people;
		girls=11;
		boys=3;
		people=girls%boys;
		System.out.printf("Module: %f\n",people);
		people=girls/boys;
		System.out.printf("Normal division: %f\n",people);

	}
}
