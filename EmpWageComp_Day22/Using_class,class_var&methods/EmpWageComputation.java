/*EmpWageComputation
*Using class, class variable and method:
*/
class EmployeeWage{
	
	//class variables
    private static final int fullDayHr=8;
    private static final int halfDayHr=4;
	private static int wagePerHr=20;
	private static int totalWorkHrs=10;
	private static int totalWorkDays=20;
	
	String emp_status="";
	String emp_type="";
	String Company="unknown";
	int day_count=1;
	int total_wage=0;
	int daily_wage=0;
	int work_hrs=0;
	
	//constructors..
	EmployeeWage(){
		//default
		System.out.println("==========="+Company+"===============");
	}
	EmployeeWage(String Company, int wage_per_hr, int total_work_day){
		this();
		this.Company=Company;
		this.wagePerHr=wage_per_hr;
		this.totalWorkDays=total_work_day; 
	}
	//constructor chaining
	EmployeeWage(String Company, int wage_per_hr, int total_work_day, int total_work_hrs){
		this(Company, wage_per_hr, total_work_day);
		this.totalWorkHrs=total_work_hrs;
	}

	//function to calculate Wage of a month:
	private final void calEmpWage(){
		while(day_count<=totalWorkDays && work_hrs<totalWorkHrs){
			double attCheck=Math.random();
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
							if (work_hrs <= (totalWorkHrs-8) ){
								System.out.println("Employee is present and is a full time on day"+day_count);
								daily_wage=(wagePerHr*fullDayHr);
								System.out.println("daily_wage="+daily_wage);
								total_wage+=daily_wage;
								work_hrs=work_hrs+8;
								day_count++;
							}else{
								System.out.println("Employee is present and hrs limited to"+(totalWorkHrs-work_hrs)+" only");
								daily_wage=(wagePerHr*(totalWorkHrs-work_hrs));
                                total_wage+=daily_wage;
                                work_hrs=(work_hrs+(totalWorkHrs-work_hrs));
								day_count++;
							}
							break;
						case "part_time":
							if (work_hrs <= (totalWorkHrs-4) ){
								System.out.println("Employee is present and is a part time on day"+day_count);
								daily_wage=(wagePerHr*halfDayHr);
								System.out.println("daily_wage="+daily_wage);
								total_wage+=daily_wage;
								work_hrs=work_hrs+8;
								day_count++;
							}else{
								System.out.println("Employee is present and hrs limited to"+(totalWorkHrs-work_hrs)+" only");
								daily_wage=(wagePerHr*(totalWorkHrs-work_hrs));
                                total_wage+=daily_wage;
                                work_hrs=(work_hrs+(totalWorkHrs-work_hrs));
								day_count++;
							}
							break;
					}
				case "absent":
				   System.out.println("Employee is absent");
				   System.out.println("daily_wage="+0);
				   day_count++;
				break;
			}//switch
		}//while
		System.out.println("=======================================");
		System.out.println("monthly_wage="+total_wage);
		System.out.println("total_work_hrs="+work_hrs);
		System.out.println("========================================");
	}//function
	
	//main method
    public static void main(String[] args)throws Exception{
		//welcome message:
		System.out.println("Welcome to Employee wage computation program");
		//creating object of EmployeeWage:
		EmployeeWage dlf=new EmployeeWage("DLF",100,10);
		dlf.calEmpWage();//calling class method
		EmployeeWage syn=new EmployeeWage("SYNEGY",100,20,10);
		syn.calEmpWage();//calling class method
   }//main
}//class