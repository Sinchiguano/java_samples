/*
 * 16_many_methods_instances.java
 * Copyright (C) 2017 SINCHIGUANO CESAR <cesarsinchiguano@hotmail.es>
 *
 * Distributed under terms of the MIT license.
 */
import java.util.Scanner;


class many_methods_instances
{
  public static void main(String[] args)
  {
    Scanner aux_TEXT=new Scanner(System.in);
    //I start to create a object to get access to my class girlfriend
    //which has many methods(functions)
    girlfriend look_OBJECT=new girlfriend();

    System.out.println("Enter the name of your first girlfriend...");
    String temp=aux_TEXT.nextLine();

    look_OBJECT.setName(temp);
    look_OBJECT.saying();
  }
}
