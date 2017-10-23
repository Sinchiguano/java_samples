/*
 * girlfriend.java
 * Copyright (C) 2017 SINCHIGUANO CESAR <cesarsinchiguano@hotmail.es>
 *
 * Distributed under terms of the MIT license.
 */

 public class girlfriend
 {
   private String girlName;

   public void setName(String name)
   {
     girlName=name;
   }
   public String getName()
   {
     return girlName;
   }
   public void saying()
   {
     System.out.printf("Your first girlfriend was %s\n",getName());
    }
  }
