import java.util.*;
//UC-6 Calculate monthly_wage till 100hrs

//data class to store daily wages
class Data{
	String day;
	int daily_wage;
	Data(String day,int daily_wage){
		this.day=day;
		this.daily_wage=daily_wage;
	}
}

//employee class with main method:
class Employee{
	//creating a collection:Arraylist to store daily wage
	ArrayList<Data> WageData=new ArrayList<Data>();

	void addWage(String day,int daily_wage){
		Data d=new Data(day,daily_wage);
		WageData.add(d);
	}
	void printDailyWage(){
		Iterator itr=WageData.iterator();
		while(itr.hasNext()){
			Data data=(Data)itr.next();
			System.out.println(data.day+":"+data.daily_wage);
		}
	}

   public static void main(String[] args){
    int wage_per_hr=20;
    int full_day_hr=8;
    int half_day_hr=4;
    String emp_status="";
    String emp_type="";
    int day_count=1;
    int total_work_day=20;
    int total_wage=0;
    int daily_wage=0;
    int work_hrs=0;
    int total_work_hrs=100;
    String day="";
    //creating employee object
    Employee emp=new Employee();
    System.out.println("Welcome to Employee wage computation program");
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
                        System.out.println("daily_wage="+daily_wage);
                        total_wage=(total_wage+daily_wage);
			day="day"+day_count;
			emp.addWage(day,daily_wage);
                        day_count++;
			work_hrs+=8;
                        break;
                     case "part_time":
                        System.out.println("Employee is present on day"+day_count+" and is a part time");
                        daily_wage=(wage_per_hr*half_day_hr);
                        System.out.println("daily_wage="+daily_wage);
                        total_wage=(total_wage+daily_wage);
			day="day"+day_count;
			emp.addWage(day,daily_wage);
                        day_count++;
			work_hrs+=4;
                        break;
                  }
            case "absent":
               System.out.println("Employee is absent on day"+day_count);
               System.out.println("daily_wage="+(wage_per_hr*0));
	       daily_wage=0;
	       day="day"+day_count;
	       emp.addWage(day,daily_wage);
               day_count++;
	       work_hrs+=0;
            break;
        }//switch
      }//while
      emp.printDailyWage();
      System.out.println("monthly_wage="+total_wage);
      System.out.println("work_hrs="+work_hrs);	  
   }//main
}//class
