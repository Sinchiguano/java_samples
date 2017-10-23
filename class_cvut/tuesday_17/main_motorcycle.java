/*
 * main_motorcycle.java
 * Copyright (C) 2017 SINCHIGUANO CESAR <cesarsinchiguano@hotmail.es>
 *
 * Distributed under terms of the MIT license.
 */

class main_motorcycle
{
	public static void main(String [] args)
	{
		motorcycle auxOBJ=new motorcycle();//I created a new object into to my motorcycle class

		double temp_1=1.5;//liters>>>Filling
		auxOBJ.fill_gas(temp_1);



		double temp_2;//consumption
		temp_2=25.0;//km >>>in percentage
		auxOBJ.go_distance(temp_2);
		//Remainder of my gas///
		//auxOBJ.gas_remainder(temp_2,temp_1);
	}	
	

}
