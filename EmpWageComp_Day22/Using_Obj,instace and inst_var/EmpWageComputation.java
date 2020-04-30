/*calculate Employee wage
*Using class with ,object,instance and instance variable
*/
class EmpWageComputation{
   public static void main(String[] args){
		System.out.println("Welcome to Employee wage computation program");
		//creating employee object
		Employee dlf=new Employee("DLF",20,5);
		dlf.calEmpWage();//calling wage computation method
		Employee telcom=new Employee("Telcom",10,2,110);
		telcom.calEmpWage();
		Employee sun=new Employee("SUNSHINE.GR",15,8,45);
		sun.calEmpWage();
   }//main
}//class
