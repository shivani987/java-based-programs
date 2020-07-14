/**
  * check employee wage of employee
  **/
public class EmpWageUC3
  {
   private static final int IS_PART_TIME=1;
   private static final int IS_FULL_TIME=2;

    public static void main(String args[])
       {
          // Calling function
          final boolean isPresent=empCheck();
          if(isPresent)
           {
           final double wage=calculateWage(20,8);
           System.out.println("Employee is present");
           System.out.println("Total Employee wage is :" +wage);
            }
           else
            {
             System.out.println("Total Employee wage is 0.0");
            }
      }
  /**
    * check employee 
    * @return true if employee present otherwise false.
    */
      public static boolean empCheck()
        {
            return IS_PART_TIME == Math.floor(Math.random() * 10 ) % 2;
        }
 /**
   * Calculate employee wage based on params.
   * @param ratePerHrs the employee rate per hours.
   * @param totalHrs total employee hours.
   * @return total employee wage.
   */
     public static double calculateWage(final int ratePerHrs, final int totalHr)
      {
        return ratePerHrs * totalHr;
      }
  }
  
