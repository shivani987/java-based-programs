public class EmpCheckUC3
 {
   public static void main(String args [])
    {
      int  isPartTime=1;
      int isFullTime=2;
      int empRatePerHr=20;
       final double randomCheck= Math.floor(Math.random() *10) % 2;
       if ( isFullTime == randomCheck )
         {
            int empHrs=isFullTime * 4;
            System.out.println("If employee work for fulltime then empHrs is :" +empHrs);
            final int fullTimesalary = empHrs * empRatePerHr;
            System.out.println("Employee fulltime salary is :" +fullTimesalary);
         }
      else if ( isPartTime == randomCheck )
         {
            int empHrs=isPartTime * 4;
            System.out.println("If employee work for parttime then empHrs is :" +empHrs);
            final int partTimesalary = empHrs * empRatePerHr;
           System.out.println("Employee parttime salary :" +partTimesalary);
         }
      else
         {
            System.out.println("If employee is absent then total empHrs is 0");
         }
    }
 }

