import java.util.Vector;  
import java.util.Iterator;  
class VectorTest{  
	public static void main(String args[]){  
		Vector<Integer> v=new Vector<Integer>();  
		v.add(5);  
		v.add(6);  
		v.add(1);  
		v.add(8);  
		Iterator<Integer> itr=v.iterator();  
		while(itr.hasNext()){  
			System.out.println(itr.next());  
		}  
	}  
}  