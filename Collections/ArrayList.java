import java.util.ArrayList;  
import java.util.Iterator;
class ArrayListTest{  
	public static void main(String args[]){  
		ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
		list.add("Raj");//Adding object in arraylist  
		list.add("Kriss");  
		list.add("Janvi");  
		list.add("Soya");  
		//Traversing list through Iterator  
		Iterator itr=list.iterator();  
		while(itr.hasNext()){  
			System.out.println(itr.next());  
		}  
	}  
}  