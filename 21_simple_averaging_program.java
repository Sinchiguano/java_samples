/*
 * 21_simple_averaging_program.java
 * Copyright (C) 2017 SINCHIGUANO CESAR <cesarsinchiguano@hotmail.es>
 *
 * Distributed under terms of the MIT license.
 */
 import java.util.Scanner;//for get data from my user


class simple_averaging_program
{
	public static void main(String [] args)
	{
		Scanner temp=new Scanner(System.in);
		int total=0;
		int grade;
		int average;
		int counter=0;
		while(counter<10)
		{
			grade=temp.nextInt();//cin
			total=total+grade;
			counter++;
		}
		average=total/10;
		System.out.println("Your average is:\n"+average);
	}
}
