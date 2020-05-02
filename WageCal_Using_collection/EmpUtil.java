import java.util.*;
/*Employee class
*all utilities of employee defined here
*/

class Employee implements WageCal{
	//class variables
	private static final int FULL_DAY_HR=8;
	private static final int HALF_DAY_HR=4;
	private static int wagePerHr=20;
	private static int totalWorkHrs=50;
	private static int totalWorkDays=20;

	private String emp_status="";
	private String emp_type="";
	private int day_count=1;
	private int total_wage=0;
	private int daily_wage=0;
	private int work_hrs=0;
	private String day="";
	private String Company;
	private int count=0;

	//constructors..
	Employee(){
		//default
	}
	Employee (String Company, int wage_per_hr, int total_work_day){
		this.Company=Company;
		this.wagePerHr=wage_per_hr;
		this.totalWorkDays=total_work_day;
	}
	//constructor chaining
	Employee (String Company, int wage_per_hr, int total_work_day, int total_work_hrs){
		this(Company, wage_per_hr, total_work_day);
		this.totalWorkHrs=total_work_hrs;
	}

	//creating a collection:Arraylist to store daily wage
	ArrayList<DailyData> WageData=new ArrayList<DailyData>();
	//creating a collection:Arraylist to store All Company data
	ArrayList<CompanyData> cmpData=new ArrayList<CompanyData>();

	private String isPresent(){
		double attCheck=Math.random();
		if(attCheck>0.5){
		   return "present";
		}else{
		   return "absent";
		}
	}
	//checks the type(full/part) of employee
	private String empType(){
		double category=Math.random();
		if (category>0.5){
			return "full_time";
	    }else{
		 	return "part_time";
      	}
	}
	private void print(int totalwage, int workhrs){
		System.out.println("monthly_wage="+totalwage);
      	System.out.println("total_work_hrs="+workhrs);
	}
	//adds daily wage to a collection
	private void addWage(String day,int daily_wage){
		//creating data object
		DailyData d=new DailyData(day,daily_wage);
		WageData.add(d);
	}
	public void printData(){
		Iterator itr=cmpData.iterator();
		while(itr.hasNext()){
			CompanyData Data=(CompanyData)itr.next();
			Data.printData();
		}
	}
	/*
	@Override calEmpWage method
	*/
	public void calEmpWage(){
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
								daily_wage=(wagePerHr*FULL_DAY_HR);
								total_wage+=daily_wage;
								work_hrs=work_hrs+8;
								day="Day"+day_count;
								addWage(day,daily_wage);
								day_count++;
							}else{
								daily_wage=(wagePerHr*(totalWorkHrs-work_hrs));
								total_wage+=daily_wage;
								work_hrs=(work_hrs+(totalWorkHrs-work_hrs));
								day="Day"+day_count;
								addWage(day,daily_wage);
								day_count++;
							}
							break;
						case "part_time":
							if (work_hrs <= (totalWorkHrs-4) ){
								daily_wage=(wagePerHr*HALF_DAY_HR);
								total_wage+=daily_wage;
								work_hrs=work_hrs+4;
								day="Day"+day_count;
								addWage(day,daily_wage);
								day_count++;
							}else{
								daily_wage=(wagePerHr*(totalWorkHrs-work_hrs));
								total_wage+=daily_wage;
								day="Day"+day_count;
								work_hrs=(work_hrs+(totalWorkHrs-work_hrs));
								addWage(day,daily_wage);
								day_count++;
							}
							break;
					}
				case "absent":
				   day="Day"+day_count;
				   daily_wage=0;
				   addWage(day,daily_wage);
				   day_count++;
				   break;
			}//switch
		}//while
		//creating an object to store company data:
		CompanyData cmp=new CompanyData(Company,WageData,total_wage,totalWorkDays,totalWorkHrs,work_hrs,wagePerHr);
		cmpData.add(cmp);
	}//empWage
}//class
