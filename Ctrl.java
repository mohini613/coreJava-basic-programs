package com.tech;

//CONTROL FLOW
public class Ctrl
{
  static Ctrl e = new Ctrl();
 
  public void M1() 
  {
    System.out.println("M3 Start");
    e.M2();
    System.out.println("M3 End");
  }

 public void M2()
 {
    System.out.println("M2 Start");
    System.out.println("M1 Start");
    System.out.println("M2 End");
  }

 public static void main(String[] args)
   {
     System.out.println("Main Start");
     e.M1();
     System.out.println("Main End");
   }
}