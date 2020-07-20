// Creating claas for calculating Employee Wage till a condition reach
public class EmpWageUC6
{
   private static final int IS_PART_TIME=1;
   private static final int IS_FULL_TIME=2;
   private static final int EMP_RATE_PER_HR=20;
   private static final int NUM_WORKING_DAYS=20;
   private static final int MAX_HRS_IN_MONTH=100;

   // Creating Function  
   public static int empCheck()
     {
        //variables
       int empHrs=0,totalEmpHrs=0,totalWorkingDays=0,totalEmpWage=0;
       //Computation
       while(totalEmpHrs <= MAX_HRS_IN_MONTH && totalWorkingDays < NUM_WORKING_DAYS)
         {
	         totalWorkingDays++;
            int randomCheck=(int)(Math.random()* 3 ) +1;
            switch(randomCheck)
             {
               case 1:
               empHrs=4;
               break;
               case 2:
               empHrs=8;
               break;
               default:
               empHrs=0;
               break;
             }
            totalEmpHrs=empHrs + totalEmpHrs;
           System.out.println("Day#" + totalWorkingDays + "Emp Hr:" +empHrs);
        }
           totalEmpWage=totalEmpHrs * MAX_HRS_IN_MONTH;
          System.out.println("Total employee wage " +totalEmpWage);
          //return total employee wage
	       return totalEmpWage;
   }
       public static void main(String args[])
        {

         empCheck(); // calling function
        }

 }



