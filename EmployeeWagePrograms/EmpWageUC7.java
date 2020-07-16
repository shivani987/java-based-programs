// class for calculate total Employee Wage
public class EmpWageUC7
 {
   private static final int IS_PART_TIME=1;
   private static final int IS_FULL_TIME=2;
   private static final int EMP_RATE_PER_HRS=20;
   private static final int NUM_OF_WORKING_DAYS=20;
   private static final int MAX_HRS_IN_MONTH=100;

   public static int computeEmpWage(){
   //variables
   int empHrs =0, totalEmpHrs =0, totalWorkingDays =0;
   
   while(totalEmpHrs <= MAX_HRS_IN_MONTH && totalWorkingDays < NUM_OF_WORKING_DAYS)
    {
      totalWorkingDays++;
      final int value = (int) Math.floor(Math.random() * 10) % 3;
      switch(value)
       {
          case 1:
            empHrs=4;
            break;
         case 2:
            empHrs =8;
            break;
         default:
           empHrs=0;
            break;
       }
      totalEmpHrs=totalEmpHrs + empHrs;
       System.out.println("Day# :" +totalWorkingDays +" Emp Hrs" +empHrs);
    }
    int totalEmpWage = totalEmpHrs * EMP_RATE_PER_HRS;
    System.out.println("Total Emp wage :" +totalEmpWage);
    return totalEmpWage;
}
   public static void main(String args[]) 
    {
              computeEmpWage(); // calling function 
    }
 }
