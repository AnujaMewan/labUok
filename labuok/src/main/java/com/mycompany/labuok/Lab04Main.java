package com.mycompany.labuok;

public class Lab04Main {
  public static void main(String[] args){
  
  //create object
  Lecturer lec1 = new Lecturer("Kasun","L001","IT",3,50000.00);
  LabAssistant lab1 = new LabAssistant("Nisal","A001","CS",100,500);
  
  lec1.displayLecturerDetails();
  System.out.println("Monthly Payment: " +lec1.calculateMonthlyPayment());
  
  lab1.displayLabAssistantDetails();
  System.out.println("Monthly Payment: " +lab1.calculateMonthlyPayment());
  
  UniversityPolicy.showPolicyHeader();
  System.out.println(UniversityPolicy.UNIVERSITY_NAME);
  
  double bonus = UniversityPolicy.calculatBonus(lec1.calculateMonthlyPayment());
  System.out.println("Lecturer Bonus: " +bonus);
  
  bonus = UniversityPolicy.calculatBonus(lab1.calculateMonthlyPayment());
  System.out.println("Lab Assistant Bonus: " +bonus);
  }    
}
