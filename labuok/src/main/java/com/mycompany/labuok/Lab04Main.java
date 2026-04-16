package com.mycompany.labuok;

public class Lab04Main {
  public static void main(String[] args){
  
  //create lecturer object
  Lecturer lec1 = new Lecturer("Kasun","L001","IT",3,50000.00);
  
  lec1.displayLecturerDetails();
  System.out.println("Monthly Payment: " +lec1.calculateMonthlyPayment());
  
  
  }    
}
