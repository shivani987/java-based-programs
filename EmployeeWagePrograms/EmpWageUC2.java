public class EmpWageUC2
 {
   private static final int IS_FULL_TIME=1;
   public static void main(String args[])
    {
      // Calling function
       double wage= empCheck();
       System.out.println("Total employee" +wage);
    }
     /** 
        * Check employee is present
        * @return total employee wage.
       */
      public static double empCheck()
       {
         final double ranNumber = Math.floor(Math.random() * 10) % 2;
         if(IS_FULL_TIME == ranNumber)
          {
           System.out.println("Employee is present");
           final double totalWage = 20 * 8;
           return totalWage;
          }
        else
          {
          System.out.println("Employee is absent");
          return 0.0;
          }
       }
 }
