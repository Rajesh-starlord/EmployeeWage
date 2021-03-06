/*EmpWageComputation
*Using basic_programming constructs(procedure oriented):
*/
class EmpWageComputation{

	public static final int FULL_DAY_HR=8;
	public static final int HALF_DAY_HR=4;

	public static void calEmpWage(String company, int  wage_per_hr, int total_work_day, int total_work_hrs)
		String emp_status="";
		String emp_type="";
		int day_count=1;
		int total_wage=0;
		int daily_wage=0;
		int work_hrs=0;
		System.out.println("============"+company+"============");
		while(day_count<=total_work_day && work_hrs<total_work_hrs){
			double attCheck=Math.random();
			if(attCheck>0.5){
				emp_status="present";
			}else{
				emp_status="absent";
			}
			switch(emp_status){
				case "present":
					double category=Math.random();
					if (category>0.5){
						emp_type="full_time";
					}else{
						emp_type="part_time";
					}
					switch(emp_type){
						case "full_time":
							System.out.println("Employee is present and is a full time");
							daily_wage=(wage_per_hr*FULL_DAY_HR);
							System.out.println("daily_wage="+daily_wage);
							total_wage=(total_wage+daily_wage);
							work_hrs=work_hrs+8;
							day_count++;
							break;
						case "part_time":
							System.out.println("Employee is present and is a part time");
							daily_wage=(wage_per_hr*HALF_DAY_HR);
							System.out.println("daily_wage="+daily_wage);
							total_wage=(total_wage+daily_wage);
							work_hrs=work_hrs+4;
							day_count++;
							break;
					}
				case "absent":
				   System.out.println("Employee is absent");
				   System.out.println("daily_wage="+(wage_per_hr*0));
				   day_count++;
				break;
			 }//switch
		}//while
		System.out.println("========================");
		System.out.println("monthly_wage="+total_wage);
		System.out.println("total_work_hrs="+work_hrs);
	}//function
   public static void main(String[] args)throws Exception{
    	System.out.println("Welcome to Employee wage computation program");
	calEmpWage("INDIAN-OIL",20,5,45);//function call
	calEmpWage("ZENX",12,7,35);
   }//main
}//class
