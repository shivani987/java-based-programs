/**
*The employee check class
*/

public class EmpWageUC1
 {
  //variables
  private static final int IS_FULL_TIME=1;
  public static void main(String args[])
    {
      empCheck(); // calling function
    }
  public static void empCheck()
    {
       double ranNumber = Math.floor(Math.random() * 10) % 2;
        //  class returns present if employee is full time
        if(IS_FULL_TIME == ranNumber) // using if condition to find employee is present or absent
         {
            System.out.println("Employee is present");
         }
        else
         {
           System.out.println("Employee is absent");
         }
    }
 }
