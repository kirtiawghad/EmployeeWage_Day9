package com.bl;

public class EmployeeWage {
    public static void main(String[] args) {
       //variables
        int isFullTime = 1;
        int emp_rate_per_hrs = 20;
        int emphrs;
        int empwage;
        //use math random method
        int empcheck = (int)(Math.random()*10%2);
       //check emplyee prsent or not
        if (empcheck == isFullTime){
            emphrs = 8;
        }else {
           emphrs = 0;
        }

        empwage = emphrs * emp_rate_per_hrs;
        System.out.println("emp wage is : "+empwage);
          }
}
