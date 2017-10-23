/*
 * motorcycle.java
 * Copyright (C) 2017 SINCHIGUANO CESAR <cesarsinchiguano@hotmail.es>
 *
 * Distributed under terms of the MIT license.
 */

public class motorcycle
{
	double gas_in_tank;
	double consumption;
	double aux1;
	double total;

	public double fill_gas( double temp)
	{
		gas_in_tank=temp;
		System.out.printf("U have filled your tank upto %f\n",gas_in_tank);
		return 0;

	}
	
	public double go_distance(double temp)
	{
		System.out.printf("U want to go a distance of: %.3fkm\n",temp);
		System.out.printf("U can only travel a distance of 25km/liter\n");
		 return 0;
	}
	
	public double gas_remainder(double temp1, double temp2) 
	{
		double total=(temp2*temp1)/25.0;
		System.out.printf("U have right now in your tank: %.f\n",total);
		return 0;

	}
	
}



