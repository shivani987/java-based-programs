// Creating Class for Calculating Employee Wage using Switch Case
public class EmpWageUC4
 {
  private static final int IS_PART_TIME=1;
  private static final int IS_FULL_TIME=2;
  private static final int EMP_RATE_PER_HR=20;

  public static int empCheck(){
   // variables
   int empHrs=0,totalEmpWage=0,totalEmpHr=0;

   final int randomCheck=(int)(Math.random() * 3) +1;

     // @return total employee wage
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
        totalEmpHr+=empHrs;
        System.out.println("Total employee hours is :" +totalEmpHr);
        totalEmpWage=totalEmpHr * EMP_RATE_PER_HR;
        System.out.println("Total employee wage " +totalEmpWage);
        return totalEmpWage;
 }
 

  public static void main(String args[])
   {
      empCheck();
   }
}

