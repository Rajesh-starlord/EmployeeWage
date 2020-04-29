/*refactor the code
*employee class with main method:
*/
class EmpWageComputation{
   public static void main(String[] args){
	  //creating employee object
	  Employee emp=new Employee();
    System.out.println("Welcome to Employee wage computation program");
	  emp.printDailyWage();//calling dailyWage computation method
	  emp.empWage();//calling wage computation method
   }//main
}//class