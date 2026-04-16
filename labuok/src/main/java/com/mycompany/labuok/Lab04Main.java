package com.mycompany.labuok;

public class Lab04Main {
  public static void main(String[] args){
 
  StaffMember.showSystemName();
  UniversityPolicy.showPolicyHeader();
  
  Lecturer lec1 = new Lecturer("Kasun","L001","IT",3,50000.00);
  Lecturer lec2 = new Lecturer("Dasun","L002","Physics",2,65000.00);
  LabAssistant lab1 = new LabAssistant("Nisal","A001","CS",100,500);
  
  lec2.changeDepartment("IT");
  
  lec1.displayLecturerDetails();
  System.out.println("Monthly Payment: " +lec1.calculateMonthlyPayment());
  
  lec2.displayLecturerDetails();
  System.out.println("Monthly Payment: " +lec2.calculateMonthlyPayment());
  
  lab1.displayLabAssistantDetails();
  System.out.println("Monthly Payment: " +lab1.calculateMonthlyPayment());
  
  double total = 0;

        total += lec1.calculateMonthlyPayment();
        total += lec2.calculateMonthlyPayment();
        total += lab1.calculateMonthlyPayment();

        System.out.println("\nTotal Monthly Payment: " + total);

        System.out.println("Total Staff: " + StaffMember.getStaffCount());

        // common notice
        lec1.showCommonNotice();
        lec2.showCommonNotice();
        lab1.showCommonNotice();
  
  

 /*Comment(q5)-Because staffCount is shared among all objects.
It tracks total number of staff, not individual.
 Comment (q6): changeDepartment() allows controlled updates and modification data .       
        */

  } 
}
