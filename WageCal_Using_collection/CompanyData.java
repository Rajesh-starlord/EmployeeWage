import java.util.*;
//data class to store daily wages
class CompanyData{
	private String company;
	private int daily_wage;
	private int totalWage;
	private int totalWorkHr;
	private int empWorkHr;
	private int totalWorkDays;
	private int wagePerHr;
	ArrayList<DailyData> WageData=new ArrayList<DailyData>();
	CompanyData(String company, ArrayList<DailyData> daily_wage, int totalWage, int totalWorkDays, int totalWorkHr, int empWorkHr, int wagePerHr){
		this.company = company;
		this.WageData=daily_wage;
		this.totalWage = totalWage;
		this.totalWorkHr = totalWorkHr;
		this.empWorkHr = empWorkHr; 
		this.totalWorkDays = totalWorkDays;
		this.wagePerHr = wagePerHr;
	}
	public void printDailyWage(){
		Iterator itr=WageData.iterator();
		int count=0;
		while(itr.hasNext()){
			count+=1;
			DailyData data=(DailyData)itr.next();
			if(count > 9 ){
				System.out.println(data.day+" :  "+data.daily_wage);
			}else{
				System.out.println(data.day+"  :  "+data.daily_wage);
			}
		}
	}
	public void printData(){
		System.out.println("---------"+company+"--------");
		System.out.println("-----------------------");
		System.out.println("DAY"+"   :  "+"DAILYWAGE");
		System.out.println("-----------------------");
		printDailyWage();//calling printDaily wage method
		System.out.println("=======================");
      	System.out.println("Max_work_hrs="+totalWorkHr+"hrs");
		System.out.println("Employee worked="+empWorkHr+"hrs");
		System.out.println("Wage per hr for an Employee="+wagePerHr);
		System.out.println("monthly_wage="+totalWage);
		System.out.println("=======================");
	}
	
}
