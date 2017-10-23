/*
 * Car_1.java
 * Copyright (C) 2017 SINCHIGUANO CESAR <cesarsinchiguano@hotmail.es>
 *
 * Distributed under terms of the MIT license.
 */

//import java.util.Scanner;

class Car_1
{
	public static void main(String[] args)
	{
		//Start of creating a new object
		Car audi=new Car();
		// End
		audi.gas=55.5;
		System.out.println(audi.getspeed());

		audi.setspeed(70);
		System.out.println(audi.getspeed());

		audi.stop();
		System.out.println(audi.getspeed());


		//Another object
		Car renault=new Car();
		// End
		renault.gas=55.5;
		System.out.println(renault.getspeed());
		
	}
}
//_________Homework_________________
//Create a new class motorcycle
//attributes:
//gas in tank;
//consumption;
//functions:
//fillgas
//gosdistance
//>>> Try to use this motorcycle class
//_____________________________________
