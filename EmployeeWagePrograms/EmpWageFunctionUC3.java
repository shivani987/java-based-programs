
//Creating class for calculating employee wage depend on partTime or fullTime 
public class EmpWageFunctionUC3
 {
  private static final int IS_PART_TIME=1;
  private static final int IS_FULL_TIME=2;
  private static final int EMP_RATE_PER_HR=20;

  public static int empCheck(){
   // variables
   int empHrs=0,totalEmpWage=0,totalEmpHr=0;

   final int randomCheck=(int)(Math.random() * 3) + 1;
   if(IS_PART_TIME == randomCheck)
    {
      empHrs=4; // empHrs for partTime
    }
    else if(IS_FULL_TIME == randomCheck)
     {
       empHrs=8; // empHrs for fullTime
     }
    else
     {
       empHrs=0;
     }
        totalEmpHr+=empHrs;
        System.out.println("Total employee hours is :" +totalEmpHr);
        totalEmpWage=totalEmpHr * EMP_RATE_PER_HR;
        System.out.println("Total employee wage " +totalEmpWage);
        return totalEmpWage;
 }


    // Calling function
  public static void main(String args[])
   {
      empCheck();
   }
}

