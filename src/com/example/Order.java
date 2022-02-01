package com.example;

import java.util.Scanner;

public class Order extends Menu {

	public static Scanner sc = new Scanner(System.in);
	  public static String again;
	  public static int ch,quantity=1;
	  public static double total=0.0,pay;
	  
	  public static void order(){
		  System.out.println("Press 1 to Pizza , Press 2 to Burger , Press 3 to Sandwitch ,Press 4 to Cancel");
		  System.out.print("Press you want to buy? :");
		  ch = sc.nextInt();
		  //conditions
		  if(ch==1){
		      System.out.println("You choose Pizza");
		      System.out.print("How many Pizza you want to Buy? :");
		      quantity =sc.nextInt();
		      total = total +(quantity*45);
		      
		      System.out.println("You want to buy again? ");
		      System.out.println("Press Y for Yes and N for N : ");
		      again = sc.next();
		      if(again.equalsIgnoreCase("Y")){
		          order();//call the method you to create 
		      }else{
		    	  System.out.println("Total amt:"+total);
		          System.out.println("Enter a payment ");
		          pay = sc.nextDouble();
		          if(pay <=total){
		            System.out.println("Not enough payment");
		          }else{
		         // System.out.println("Total price is " + total);
		          total = pay-total;
		          System.out.println("The change is " + total);
		          }
		      }
		  }else if(ch==2){
		      System.out.println("You choose Burger");
		      System.out.print("How many Burger you want to Buy? :");
		      quantity =sc.nextInt();
		      total = total +(quantity*40);
		      
		      System.out.println("You want to buy again? ");
		      System.out.println("Press Y for Yes and N for N : ");
		      again = sc.next();
		      if(again.equalsIgnoreCase("Y")){
		          order();//call the method you to create 
		      }else{
		    	  System.out.println("Total amt:"+total);
		          System.out.println("Enter a payment ");
		          pay = sc.nextDouble();
		          if(pay <=total){
		            System.out.println("Not enough payment");
		          }else{
		         // System.out.println("Total price is " + total);
		          total = pay-total;
		          System.out.println("The change is " + total);
		      }
		      }
		    }else if(ch==3){
		      System.out.println("You choose Sandwitch");
		      System.out.print("How many Sandwitch you want to Buy? :");
		      quantity =sc.nextInt();
		      total = total +(quantity*30);
		      
		      System.out.println("You want to buy again? ");
		      System.out.println("Press Y for Yes and N for N : ");
		      again = sc.next();
		      if(again.equalsIgnoreCase("Y")){
		          order();//call the method you to create 
		      }else{
		    	  System.out.println("Total amt:"+total);
		          System.out.println("Enter a payment ");
		          pay = sc.nextDouble();
		          if(pay <=total){
		            System.out.println("Not enough payment");
		          }else{
		         // System.out.println("Total price is " + total);
		          total = pay-total;
		          System.out.println("The change is " + total);
		          }
		      }
		  }else if(ch==4){
		      System.exit(0);//close program
		  }else{
		      System.out.println("Choose 1 to 3 only!");
		      order();
		  }
	  }
}
