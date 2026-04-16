package com.mycompany.labuok;


public abstract class StaffMember {
    
    //add attributes
    private String fullname;
    private final String staffId;
    protected String department;
    private static int staffCount = 0;
    
    //craete a public constructor
    public StaffMember(String fullname,String staffId,String department){
     this.fullname=fullname;
     this.staffId=staffId;
     this.department=department;
     staffCount++;
    }
    
    //create getter methods
    public String getFullName(){
     return fullname;
    }
    public String getStaffId(){
     return staffId;
    }
    public String getDepartment(){
     return department;
    }
    
    public static void showSystemName(){
      System.out.println("University Staff Payment System");
    }
    
    public static int getStaffCount(){
     return staffCount;
    }
    
    public void changeDepartment(String newDepartment){
      if(newDepartment != null && !newDepartment.isEmpty()){
       this.department = newDepartment;
      }
    }
    
    public final void showCommonNotice(){
      System.out.println("Staff Members must follow university policies.");
    }
    
    //create final method
    public final void displayBasicDetails(){
     System.out.println("\nName: " +fullname+ "\nStaffID: " +staffId+ "\nDepartment: " +department);
    }
    
    //create abstract method
    public abstract double calculateMonthlyPayment();
    
    
}
