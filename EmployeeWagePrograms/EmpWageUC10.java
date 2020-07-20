//creating class for to manage employeee Wage of multiple companies
public class EmpWageUC10
 {
   private static final int IS_PART_TIME= 1;
   private static final int IS_FULL_TIME= 2;
   private int noOfCompany;
   private Company [] companyArr; 

   public  EmpWageUC10() //creating constructor
     {
     this.companyArr = new Company[5];
     this.noOfCompany=0;   
        
     }

     /*
       Creating method addCompany
       Creating ComputeEmpWage
       Creating computeEmpWage
      */
   private void addCompany(final String name, final int empRate, final int totalWorkingDays, final int maxHrsInMonth)
      { 
        final Company company=new Company(name, empRate, totalWorkingDays, maxHrsInMonth);
        companyArr[noOfCompany] = company;
        noOfCompany++;
      }

   private void ComputeEmpWage()
      {
        for( int i=0; i< noOfCompany; i++)
         {
            Company company= companyArr[i];
            this.computeEmpWage(companyArr[i]);
            System.out.println(companyArr[i]);
         }
      }

   private void computeEmpWage(final Company company)
   {
      //variables
      int empHrs=0, totalEmpHrs=0,totalWorkingDays=0;
     
      while(totalEmpHrs <= company.getMaxHrsInMonth() && totalWorkingDays < company.getTotalWorkingDays())
       {
          totalWorkingDays++;
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
       final int wage = totalEmpHrs * company.getEmpRate();
       company.setTotalEmpWage(wage);
   }


    public static void main(String args[])
    {

      EmpWageUC10 eb = new EmpWageUC10();
        //For Apple
      eb.addCompany("Appple", 20, 20, 100);
        // For Samsung
      eb.addCompany("Samsung",25, 15, 150);
      eb.ComputeEmpWage();
        

    }
 }
   // class for setter and getter for computing details of companies
   class Company
     {
       private String name;
       private int empRate;
       private int totalWorkingDays;
       private int maxHrsInMonth;
       private int totalEmpWage;
       public Company()
       {
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
       public void setTotalEmpWage( final int totalEmpWage)
         {
            this.totalEmpWage=totalEmpWage;
         }

      public int getTotalEmpWage()
         {
            return totalEmpWage;
         }
      @Override  //Using toString method for calculating total Employee Wage for each Company
      public String toString(){
             return "Total Employee Wage for Company :" +name+ " is :" +totalEmpWage;
            }


     }

