package com.mycompany.labuok;

final class UniversityPolicy {
    
    public static final String UNIVERSITY_NAME = "\nUniversity Of Kelaniya";
    public static final double BONUS_RATE = 0.10;
    
    public static void showPolicyHeader(){
     System.out.println("\n-- University Payment Policy --");
    }
    
    public static double calculatBonus(double monthlyPayment){
     return monthlyPayment*BONUS_RATE;
    }
            
    
    
}
