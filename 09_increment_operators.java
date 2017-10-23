/*
 * 09_increment_operators.java
 * Copyright (C) 2017 SINCHIGUANO CESAR <cesarsinchiguano@hotmail.es>
 *
 * Distributed under terms of the MIT license.
 */
import java.util.Scanner;


class increment_operators
{
	public static void main(String args[])
	{
		Scanner temp=new Scanner(System.in);
		int tuna=5;
		int bass=18;
		++tuna;
		System.out.println(tuna);
		System.out.println(tuna++);
		System.out.println(tuna);
		System.out.println(--bass);
		System.out.println(tuna+=8);

	}
}