package com.mycompany.labuok;


public abstract class StaffMember {
    
    //add attributes
    private String fullname;
    private final String staffId;
    protected String department;
    
    //craete a public constructor
    public StaffMember(String fullname,String staffId,String department){
     this.fullname=fullname;
     this.staffId=staffId;
     this.department=department;
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
    
    //create final method
    public final void displayBasicDetails(){
     System.out.println("\nName: " +fullname+ "\nStaffID: " +staffId+ "\nDepartment: " +department);
    }
    
    //create abstract method
    public abstract double calculateMonthlyPayment();
    
    
}
