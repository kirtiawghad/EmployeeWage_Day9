package com.bl;

public class EmployeeWage {
    public static void main(String[] args) {
       //variables
        int isFullTime = 1;
        //use math random method
        int empcheck = (int)(Math.random()*10%2);
       //check emplyee prsent or not
        if (empcheck == isFullTime){
            System.out.println("employee is present");
        }else {
            System.out.println("employee not present");
        }
          }
}
