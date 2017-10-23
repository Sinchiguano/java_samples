/*
 * 15_use_method_with_parameters.java
 * Copyright (C) 2017 SINCHIGUANO CESAR <cesarsinchiguano@hotmail.es>
 *
 * Distributed under terms of the MIT license.
 */
import java.util.Scanner;


class use_method_with_parameters
{
	public static void main(String[] args)
	{
		Scanner temp=new Scanner(System.in);
		
		tuna auxOBJ=new tuna();//The name of my main class

		System.out.println("Enter you name");
		String name=temp.nextLine();
		auxOBJ.simpleMessage(name);
	}
}
