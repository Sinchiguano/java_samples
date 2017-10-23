/*
 * Car.java
 * Copyright (C) 2017 SINCHIGUANO CESAR <cesarsinchiguano@hotmail.es>
 *
 * Distributed under terms of the MIT license.
 */



//public 
public class Car
{
	final double POWER=110.0;
	final double MAX_POWER=220.0;
	
	double speed =0.0;
	double gas=0.0;



	public void stop()
	{
		speed=0;
		System.out.println("I have stopped");
	}
	public double setspeed(double aSpeed)
	{
		speed=aSpeed;
		return speed;
	}
	public double getspeed()
	{
		return speed;

	}

}

