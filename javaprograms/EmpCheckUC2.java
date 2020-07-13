public class EmpCheckUC3
  {
   public static void main(String args [])
    {
      int ispresent=1;
      int empRatePerHr=20;
      int empHrs=8;
       final double randomCheck = Math.floor(Math.random() *10) % 2;
        if ( ispresent == randomCheck )
            {
               final double totalwage = empRatePerHr * empHrs;
               System.out.println("Employee is present " +totalwage);
            }
         else
            {
              System.out.println("Employee is absent ");
              System.out.println("totalWage is 0");
            }
     }
  }


