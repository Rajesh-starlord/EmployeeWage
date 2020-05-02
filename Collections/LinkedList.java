import java.util.LinkedList;  
import java.util.Iterator;
import java.util.List;
class LinkedListEx{  
	public static void main(String args[]){  
		LinkedList<String> ll=new LinkedList<String>();  
		ll.add("Ravi");  
		ll.add("Vijay");  
		l1.add("Ravi");  
		ll.add("Ajay");
		Iterator<String> itr=ll.iterator();  
		while(itr.hasNext()){  
			System.out.println(itr.next());  
		}  
	}  
}  