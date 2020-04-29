//UC-3 add part time

class EmpWageComputationUc3{
   public static void main(String[] args)throws Exception{
      int wage_per_hr=20;
      int full_day_hr=8;
      int half_day_hr=4;
      System.out.println("Welcome to Employee wage computation program");
      double attCheck=Math.random();
      if(attCheck>0.5){
         double category=Math.random();
         if (category>0.5){
            System.out.println("Employee is present and is a full time");
            System.out.println("daily_wage="+(wage_per_hr*full_day_hr));
         }else{
            System.out.println("Employee is present and is a part time");
            System.out.println("daily_wage="+(wage_per_hr*half_day_hr));
         }
      }else{
         System.out.println("Employee is absent");
         System.out.println("daily_wage="+(wage_per_hr*0));
      }
   }
}
