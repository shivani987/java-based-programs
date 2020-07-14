/**
  * check employee wage of employee
  **/
public class EmpWageUC3
  {
   private static final int IS_PART_TIME=1;
   private static final int IS_FULL_TIME=2;
   private static final int EMP_RATE_PER_HOUR=20;

    public static void main(String args[])
       {
          int Salary=empCheck();
          int TotalSalary= Salary * EMP_RATE_PER_HOUR;
          System.out.println("Total Salary fo employee : " +TotalSalary);
       }
   public static final int empCheck()
    {
       // variables
          int empHrs=0;
        final int ranNumber = (int)(Math.random() * 10) % 2;
 
        if( IS_FULL_TIME == ranNumber)
          {
            empHrs=8; //if employee is fulltime employee
          }
        else if(IS_PART_TIME == ranNumber)
          {
            empHrs=4; //if employee is partTime employee
          }
        else
          {
           empHrs=0;
          }
          return empHrs;
    }
  }
