import java.util.LinkedHashSet;
import java.util.Iterator;  
 class SetTest{  
		public static void main(String args[]){  
		LinkedHashSet<String> set=new LinkedHashSet<String>();  
		set.add("Raj");  
		set.add("Kanhar");  
		set.add("Sawraj");  
		set.add("Kanhar");//duplicate element will not be allowed  
		Iterator<String> itr=set.iterator();  
		while(itr.hasNext()){  
			System.out.println(itr.next());  
		}  
	}  
}  