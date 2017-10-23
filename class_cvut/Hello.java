//10-October-2017
//Java Programming
//By: Sinchiguano Cesar

//how to make comment or remark


/*
This is a good way to comment
*/


/**
kjshfg
fdsgdsh
dsfgdhdf
dfgsd
*/
//package hello;//Everything that follows this part is part of my package called Hello


public class Hello
{
  public void mine_age()
  {
    int age=0;
    age=age+7;
    System.out.println("My age is: " + age);
  }
  //This function is my starting program, other words it is my main loop
  public static void main(String[] args)
  {


    System.out.println("Hello world");
    System.out.println("Here u are");
    //I am calling my function mine-age()
    //But first i have to declare some object and initialize as a function.
    
    Hello lookup_object=new Hello();
    lookup_object.mine_age();




  }
}
