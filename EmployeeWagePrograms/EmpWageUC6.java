public class EmpWageUC6
 {
   public static void main(String args[])
    {
      int IS_PART_TIME=1;
      int IS_FULL_TIME=2;
      int MAX_HRS_IN_MONTH=10;
      int EMP_RATE_PER_HR=20;
      int NUM_WORKING_DAYS=20;
      int totalEmpHrs=0;
      int totalWorkingDays=0;
      int partTimeTotalEmpHrs=0;
      int fullTimeTotalEmpHrs=0;
       
      while ( totalEmpHrs < MAX_HRS_IN_MONTH && totalWorkingDays < NUM_WORKING_DAYS)
      {
         totalWorkingDays++;
         int randomCheck =(int)(Math.random()* (1 + 2 ));
           switch(randomCheck)
            {
               case 1:
                 int partTimeEmpHrs= IS_PART_TIME * 4;
                 partTimeTotalEmpHrs=totalEmpHrs + partTimeTotalEmpHrs;
                 System.out.println("Total Employee Hours for partTime :" +partTimeTotalEmpHrs);

                 int partTimeTotalSalary=partTimeTotalEmpHrs * EMP_RATE_PER_HR;
                 System.out.println("Total salary for partTime employee :" +partTimeTotalSalary);
               break;
               case 2:
                 int fullTimeEmpHrs= IS_FULL_TIME * 4;
                 fullTimeTotalEmpHrs=totalEmpHrs + fullTimeEmpHrs;
                 System.out.println("Total Employee Hours for fullTime :" +fullTimeTotalEmpHrs);
                 
                 int fullTimeTotalSalary=fullTimeTotalEmpHrs * EMP_RATE_PER_HR;
                 System.out.println("Total salary for fullTime employee :" +fullTimeTotalSalary);
               break;
               default:
                  System.out.println("Invalid input");
               break;
             }
       }
    }
 }
