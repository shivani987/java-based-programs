public class EmpCheckUC5
 {
   public static void main(String args[]) 
    {
     int isPartTime=1;
     int isFullTime=2;
     int totalSalary=0;
     int empRatePerHr=20;
     int numWorkingDays=20;
     int salary=0;
      for( int day=1;day<=numWorkingDays;day++)
        {
           int randomCheck=(int)(Math.random()*(1 + 2 ));
           switch(randomCheck)
            {
               case 1:
                  int partTimeEmpHr= isPartTime * 4;
                  System.out.println("Employee working hours for partTime is :" +partTimeEmpHr);
                  salary=partTimeEmpHr * empRatePerHr;
                  totalSalary= totalSalary + salary;
                  System.out.println("Total salary for partTime job is : " +totalSalary);
                  break;
              case 2:
                  int fullTimeEmpHr= isFullTime * 4;
                  System.out.println("Employee working hours for fulltime is :" +fullTimeEmpHr);
                  salary=fullTimeEmpHr * empRatePerHr;
                  totalSalary= totalSalary + salary;
                  System.out.println("Total salary for fullTime job is : " +totalSalary);
                  break;
             default:
                 System.out.println("Invalid input");
                 break;
           }
        }
    }

 }
