public class EmpCheckUC4
 {
  public static void main(String args[])
   {
     int isPartTime=1;
     int isFullTime=2;
     int empRatePerHr=20;
     int empHrs=0;
     int randomCheck = (int)(Math.random() *10) % 2;
     switch (randomCheck)
      {
         case 1:
             int partTimeEmpHrs = isPartTime * 4;
             System.out.println("Employee hours for partTime :" +partTimeEmpHrs);
             int partTimeSalary= partTimeEmpHrs * empRatePerHr;
             System.out.println("Total salary for partTime employee is :" +partTimeSalary);
             break;
        case 2:
             int fullTimeEmpHrs = isFullTime * 4;
             System.out.println("Employee hours for fullTime :" +fullTimeEmpHrs);
             int fullTimeSalary= fullTimeEmpHrs * empRatePerHr;
             System.out.println("Total salary for fullTime empoyee is :" +fullTimeSalary);
             break;
       default:
            System.out.println("Invalid input");
           break;
      }

   } 
 }

