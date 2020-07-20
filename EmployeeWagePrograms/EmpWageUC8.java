/**
   creating class for camputing
   Employee wages for multiple 
   Companies
   **/
public class EmpWageUC8
 {
   private static final int IS_PART_TIME= 1;
   private static final int IS_FULL_TIME= 2;
   
   public static int computeEmpWage(final Company company)
   {
      //variables
      int empHrs=0, totalEmpHrs=0,totalWorkingDays=0;
      //Computation
      while(totalEmpHrs <= company.getMaxHrsInMonth() && totalWorkingDays < company.getTotalWorkingDays())
       {
          totalWorkingDays++; //incrementation
          final int value=(int) Math.floor(Math.random() * 10) % 3;
          switch(value)
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
         totalEmpHrs= totalEmpHrs + empHrs;
         System.out.println("Day" +totalWorkingDays+"Emp Hrs"+empHrs);
       }
       return totalEmpHrs * company.getEmpRate();
   }
   public static void main(String args[])
    {
      //For Apple
      final Company apple =new Company("Appple",20,20,100);
      final int totalWageApple= computeEmpWage(apple);
      System.out.println("Total Emp wage for "+apple.getName()+":"+totalWageApple);

     // for Samsung
     final Company samsung =new Company("Samsung",30,20,150);
     final int totalWageSamsung= computeEmpWage(samsung);
     System.out.println("Total Emp Wage for "+samsung.getName()+":"+totalWageSamsung);

     // for Oppo
     final Company oppo =new Company("Oppo",30,20,150);
     final int totalWageOppo= computeEmpWage(oppo);
     System.out.println("Total Emp Wage for "+oppo.getName()+":"+totalWageOppo);


    }
 }

// class for setter and getter for computing details of companies
   class Company
     {
       private String name;
       private int empRate;
       private int totalWorkingDays;
       private int maxHrsInMonth;
       public Company(){
       }
       public Company(final String name,final int empRate,final int totalWorkingDays,final int maxHrsInMonth)
         {
            this.name=name;
            this.empRate=empRate;
            this.totalWorkingDays=totalWorkingDays;
            this.maxHrsInMonth=maxHrsInMonth;
         }
      public void setName( final String name)
         {
            this.name=name;
         }
     public String getName()
         {
            return name;
         }
     public void setEmpRate( final int empRate)
         {
            this.empRate=empRate;
         }
     public int getEmpRate()
         {
            return empRate;
         }
      public void setTotalWorkingDays( final int totalWorkingDays)
         {
            this.totalWorkingDays=totalWorkingDays;
         }
     public int getTotalWorkingDays()
         {
            return totalWorkingDays;
         }
      public void setMaxHrsInMonth( final int maxHrsInMonth)
         {
            this.totalWorkingDays=totalWorkingDays;
         }
     public int getMaxHrsInMonth()
         {
            return maxHrsInMonth;
         }


     }



