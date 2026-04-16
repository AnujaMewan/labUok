package com.mycompany.labuok;

 class LabAssistant extends StaffMember{
    
    //add attributes
    private int hoursWorked;
    private double hourlyRate;
    
    //create constructor
    public LabAssistant(String fullname, String staffId, String department, int hoursWorked, double hourlyRate){
      super(fullname,staffId,department);
      this.hoursWorked = hoursWorked;
      this.hourlyRate = hourlyRate;
    }
    
    //implement
    @Override
    public double calculateMonthlyPayment(){
     return hoursWorked*hourlyRate;
    }
    
    public void displayLabAssistantDetails(){
     displayBasicDetails();
     System.out.println("No of Hours Worked: " +hoursWorked);
     System.out.println("Hourly Rate: " +hourlyRate);
    }
    

}

 
