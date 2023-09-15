package com.bl;

public class EmployeeWage {

    int IS_FULL_TIME = 2;
    int IS_PART_TIME = 1;
    int EMP_RATE_PER_HOUR = 20;
    int EMP_WORKING_DAY = 20;
    int EMP_WORKING_HRS= 100;

    public static void main(String[] args) {
        EmployeeWage obj = new EmployeeWage();
        int empHrs = 0;
        int totalEmpHrs = 0;
        int totalEmpDays = 0;

        while (totalEmpHrs <= obj.EMP_WORKING_HRS && totalEmpDays < obj.EMP_WORKING_DAY){

            totalEmpDays++;

            int empCheck = (int) (Math.floor(Math.random() * 10) % 3);

            switch (empCheck) {

                case 1:

                    empHrs = 4;
                    break;

                case 2:

                    empHrs = 8;
                    break;


                default:
                    empHrs = 0;

            }
            totalEmpHrs = empHrs + totalEmpHrs;
            System.out.println("day "+totalEmpDays+ ": " +totalEmpHrs + " Hours");

        }

        int empwage = totalEmpHrs * obj.EMP_RATE_PER_HOUR;
        System.out.println(empwage);

    }

}

