import java.util.*;
class Employee{
	
	public final int wage_per_hr=20;
    public final int full_day_hr=8;
    public final int half_day_hr=4;
	public final int total_work_day=20;
    public final int total_work_hrs=100;
	
	String emp_status="";
    String emp_type="";
    int day_count=1;
    int total_wage=0;
    int daily_wage=0;
    int work_hrs=0;
	String day="";
	//creating a collection:Arraylist to store daily wage
	ArrayList<Data> WageData=new ArrayList<Data>();

	//check employee is present or not
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
	//prints totalwage and work_hrs
	private void print(int totalwage, int workhrs){
		System.out.println("monthly_wage="+totalwage);
        System.out.println("total_work_hrs="+workhrs);
	}
	//adds daily wage to a collection
	private void addWage(String day,int daily_wage){
		//creating data object
		Data d=new Data(day,daily_wage);
		WageData.add(d);
	}
	//prints daily_wage
	public void printDailyWage(){
		Iterator itr=WageData.iterator();
		while(itr.hasNext()){
			Data data=(Data)itr.next();
			System.out.println(data.day+":"+data.daily_wage);
		}
	}
	
	//calculating employee wage
	public void empWage(){
		while(day_count <= total_work_day && work_hrs < total_work_hrs){
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
                        System.out.println("Employee is present on day"+day_count+" and is a full time");
                        daily_wage=(wage_per_hr*full_day_hr);
                        total_wage=(total_wage+daily_wage);
						day="day"+day_count;
						addWage(day,daily_wage);
                        day_count++;
						work_hrs+=8;
                        break;
                     case "part_time":
                        System.out.println("Employee is present on day"+day_count+" and is a part time");
                        daily_wage=(wage_per_hr*half_day_hr);
                        total_wage=(total_wage+daily_wage);
						day="day"+day_count;
						addWage(day,daily_wage);
                        day_count++;
						work_hrs+=4;
                        break;
                  }
            case "absent":
               System.out.println("Employee is absent on day"+day_count);
			   daily_wage=0;
			   day="day"+day_count;
			   addWage(day,daily_wage);
               day_count++;
			   work_hrs+=0;
			   break;
			}//Switch
		}//while
		printDailyWage();
		print(total_wage,work_hrs);//send to Employee and print monthly wage
	}//empWage
}//class