package com.tech;

class Calculator {
	  public void addition() {
	    int x = 100;
	    int y = 50;
	    int sum=x-y;
	    System.out.println("subtraction:"+ sum);
	    System.out.println(x+y);
	    System.out.println(x*y);
	    System.out.println(x/y);
	    System.out.println(x%y);
	  }

	  public static void main(String args[]) {
	    Calculator c = new Calculator();  
	   c.addition();
	   
	  }
	}

