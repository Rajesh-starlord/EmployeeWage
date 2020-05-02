import java.util.TreeSet;
import java.util.SortedSet;
import java.util.Iterator;  
class SortedSetTest{  
	public static void main(String args[]){    
		SortedSet<Integer> set=new TreeSet<Integer>();  
		set.add(5);  
		set.add(18);  
		set.add(10);  
		set.add(20);    
		Iterator<Integer> itr=set.iterator();  
		while(itr.hasNext()){  
			System.out.println(itr.next());  
		}  
	}  
}  