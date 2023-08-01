package com.bl;

public class EmployeeWage {

   public static final int isFullTime = 2;
   public static final int isPartTime = 1;
   public static final int emp_rate_per_hrs = 20;
    public static void main(String[] args) {
       //variables


         int emphrs =0;
         int empwage =0;
        //use math random method
        int empcheck = (int)(Math.random()*10%3);
       //check emplyee prsent or not

        switch (empcheck){
            case isFullTime:
                emphrs = 8;
                break;
            case isPartTime:
                emphrs = 4;
                break;
            default:
                System.out.println("not avalable");
        }

        empwage = emphrs * emp_rate_per_hrs;
        System.out.println("emp wage is : "+empwage);
          }
}
