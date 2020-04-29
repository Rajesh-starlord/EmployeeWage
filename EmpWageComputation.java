//UC-4 using switch case
//UC-4 solve using switch case

class EmpWageComputationUc3{
   public static void main(String[] args)throws Exception{
      int wage_per_hr=20;
      int full_day_hr=8;
      int half_day_hr=4;
      String emp_status="";
      String emp_type="";
      System.out.println("Welcome to Employee wage computation program");
      double attCheck=Math.random();//check employee is present or not
      if(attCheck>0.5){
         emp_status="present";
      }else{
         emp_status="absent";
      }
      switch(emp_status){
         case "present"://check emp is part time or full time
               double category=Math.random();
               if (category>0.5){
                  emp_type="full_time";
               }else{
                  emp_type="part_time";
               }
               switch(emp_type){
                  case "full_time":
                     System.out.println("Employee is present and is a full time");
                     System.out.println("daily_wage="+(wage_per_hr*full_day_hr));
                     break;
                  case "part_time":
                     System.out.println("Employee is present and is a part time");
                     System.out.println("daily_wage="+(wage_per_hr*half_day_hr));
                     break;
               }
         case "absent":
            System.out.println("Employee is absent");
            System.out.println("daily_wage="+(wage_per_hr*0));
         break;
      }//switch
   }//main
}//class
