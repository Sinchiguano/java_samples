/*
 * 26_random_number.java
 * Copyright (C) 2017 Sinchiguano Cesar <cesarsinchiguano@hotmail.es>
 *
<<<<<<< HEAD
 * Distributed under terms of the Desired license.
 */


 import java.util.Random;
=======
 * Distributed under terms of the public license.
 */

import java.util.Random;

>>>>>>> 3ccfd5e20ff334a4dd0b4e0dd3fde048fb5a4a7c


class random_number
{
	public static void main(String [] args)
	{
<<<<<<< HEAD
		System.out.printf("");
		Random temp=new Random();
		int number;

		for(int i=0;i<10;i++)
		{

			number=temp.nextInt(6);
			System.out.printf("%d\n",number);
		}
		System.out.println("_______________");
		for(int i=0;i<10;i++)
		{

			number=1+temp.nextInt(6);
			System.out.printf("%d\n",number);
		}




	}
}
=======
		Random dice=new Random();

		int number;


		for(int counter=1;counter<10;counter++)
		{
			number=dice.nextInt(6);
			System.out.printf(number+" \n");			
		}

		System.out.printf("____________________________\n");

		
		for(int counter=1;counter<10;counter++)
		{

			number=1+dice.nextInt(6);
			System.out.printf(number+" \n");
				
		}

	}
}

>>>>>>> 3ccfd5e20ff334a4dd0b4e0dd3fde048fb5a4a7c
