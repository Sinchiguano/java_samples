/*
 * 11_logical_operators.java
 * Copyright (C) 2017 SINCHIGUANO CESAR <cesarsinchiguano@hotmail.es>
 *
 * Distributed under terms of the MIT license.
 */
///home/casch/java_code/11_logical_operators.java
import java.util.Scanner;


class logical_operators
{
	public static void main(String[] args)
	{
		int boys,girls;
		boys=18;
		girls=68;
		if(boys>10 && girls <60)
		{
			System.out.printf("You can enter!\n ");
		}
		else
		{
			System.out.printf("You cannnot enter!\n");
		}

		if(boys>10 || girls <60)
		{
			System.out.printf("You can enter!\n ");
		}
		else
		{
			System.out.printf("You cannnot enter!\n");
		}
	}
}
