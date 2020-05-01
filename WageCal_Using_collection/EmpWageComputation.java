import java.util.Scanner;
/*calculate Employee wage
*Using class with ,object,instance and instance variable
*/
class EmpWageComputation{
   public static void main(String[] args){
		System.out.println("Welcome to Employee wage computation program");
		//creating employee objects
		Employee dlf=new Employee("DLF",20,5);
		dlf.calEmpWage();//calling wage computation method
		Employee telcom=new Employee("TELECOM",10,2,110);
		telcom.calEmpWage();
		Employee sun=new Employee("SUNSHINE.GR",15,8,45);
		sun.calEmpWage();
		System.out.println("Enter an option:");
		System.out.println("1.Print All CompanyData:");
		System.out.println("2.Print Selective:");
		Scanner sc = new Scanner(System.in);
		int opt = sc.nextInt();
		
		switch(opt){
			case 1://print all data
					dlf.printData();
					telcom.printData();
					sun.printData();
					break;
			case 2://check which company data to print
					System.out.println("Enter an option:");
					System.out.println("1.DLF   2.TELECOM   3.SUNSHINE.GR");
					opt=sc.nextInt();
					switch(opt){
						case 1:dlf.printData();break;
						case 2:telcom.printData();break;
						case 3:sun.printData();break;
						default :System.out.println("Enter a valid option:");break;
					}
					break;
			default :System.out.println("Enter a valid option:");break;
		}
		

   }//main
}//class
