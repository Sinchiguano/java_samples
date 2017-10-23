/*
 * 02_variable.java
 * Copyright (C) 2017 SINCHIGUANO CESAR <cesarsinchiguano@hotmail.es>
 *
 * Distributed under terms of the MIT license.
 */

class variables_var
{
  String my_name;

  //This function is my starting program, other words it is my main loop
  public static void main(String[] args)
  {
  	int a=22;
  	int b=7;
  	b =a/b;
  	float c=(float)a/(float)b;

  	//System.out.printf("%.7f \n",c);

  	System.out.printf("%d",b);
    System.out.printf("%.7f \n",c);


    String myname="Sinchiguano Cesar";
    System.out.println("....."+myname);
    System.out.println("Hello world");
    System.out.println("Here u are");
    //We can use c
    System.out.printf("____Another way to print like C___\n");
    System.out.printf("My name is %s and I have %d years old....\n",myname,15);

  }
}
