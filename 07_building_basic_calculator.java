/*
 * 07_building_basic_calculator.java
 * Copyright (C) 2017 SINCHIGUANO CESAR <cesarsinchiguano@hotmail.es>
 *
 * Distributed under terms of the MIT license.
 */

import java.util.Scanner;


class building_basic_calculator
{
	public static void main(String args[])
	{
		Scanner aux=new Scanner(System.in);

		double fnum,snum,answer;
		
		System.out.println("Enter the first num: ");
		fnum=aux.nextDouble();
		System.out.println("Enter second num:");
		snum=aux.nextDouble();
		answer=fnum+snum;
		System.out.println("My anwer:"+answer);
	}
}

