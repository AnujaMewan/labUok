package com.mycompany.labuok;

public class Lab04Main {
  public static void main(String[] args){
  
  //create object
  Lecturer lec1 = new Lecturer("Kasun","L001","IT",3,50000.00);
  Lecturer lec2 = new Lecturer("Dasun","L002","Physics",2,65000.00);
  LabAssistant lab1 = new LabAssistant("Nisal","A001","CS",100,500);
  
  StaffMember.showSystemName();
  
  lec1.displayLecturerDetails();
  System.out.println("Monthly Payment: " +lec1.calculateMonthlyPayment());
  
  lec2.displayLecturerDetails();
  System.out.println("Monthly Payment: " +lec2.calculateMonthlyPayment());
  
  lab1.displayLabAssistantDetails();
  System.out.println("Monthly Payment: " +lab1.calculateMonthlyPayment());
  
  UniversityPolicy.showPolicyHeader();
  System.out.println(UniversityPolicy.UNIVERSITY_NAME);
  
  double bonus = UniversityPolicy.calculatBonus(lec1.calculateMonthlyPayment());
  System.out.println("Lecturer 1 Bonus: " +bonus);
  
  bonus = UniversityPolicy.calculatBonus(lec2.calculateMonthlyPayment());
  System.out.println("Lecturer 2 Bonus: " +bonus);
  
  bonus = UniversityPolicy.calculatBonus(lab1.calculateMonthlyPayment());
  System.out.println("Lab Assistant Bonus: " +bonus);
  } 
  
  
  

 //Comment(q5)-Because staffCount is shared among all objects.It tracks total number of staff, not individual.

  
}
