package com.mycompany.labuok;

public class Lecturer extends StaffMember{
    
    //add private attributes
    private int courseCount;
    private double paymentPerCourse;
    
    //create constructor 
    public Lecturer(String fullname,String staffId,String department,int courseCount,double paymentPerCourse){
       super(fullname,staffId,department);
       this.courseCount = courseCount;
       this.paymentPerCourse = paymentPerCourse;
    }
    
    //implement 
    @Override
    public double calculateMonthlyPayment(){
     return courseCount*paymentPerCourse;
    }
    
    //create public method
    public void displayLecturerDetails(){
      displayBasicDetails();  //inherit
      System.out.println("No of Courses: " + courseCount);
      System.out.println("Payment per Course: " + paymentPerCourse);
    }
    
    
}
