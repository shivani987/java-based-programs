
// class for calculating total wage of employee
public class EmpWageUC5
 {
   private static final int IS_PART_TIME=1;
   private static final int IS_FULL_TIME=2;
   private static final int EMP_RATE_PER_HR=20;
   private static final int NUM_WORKING_DAYS=20;
   public static int empCheck()
   {
      int empHrs=0,totalEmpWage=0,empWage=0;

        for( int day=1;day<NUM_WORKING_DAYS;day++)
        {
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
            empWage=empHrs * EMP_RATE_PER_HR;
            totalEmpWage+=empWage;
        System.out.println("Total employee hours is : " +empWage);


      // totalEmpWage=totalEmpHr * EMP_RATE_PER_HR;

       }
        System.out.println("Total employee wage " +totalEmpWage);


        return totalEmpWage; //return total employee wage
   }
   public static void main(String args[]) 
    {

      empCheck(); // calling function
    }

 }
