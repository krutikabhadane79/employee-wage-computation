package com.employeewage;

public class EmployeeWageComputation
{
    public static void main( String[] args )
    {
        System.out.println( "Welcome to Employee Wage Computation Program" );
        final int FULL_TIME = 1;
        double empType = Math.floor(Math.random() * 10) % 2;
        if (empType == FULL_TIME)
        {
            System.out.println("Employee is Present");
        }
        else
        {
            System.out.println("Employee is Absent");
        }
    }
}
