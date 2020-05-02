import java.util.PriorityQueue;
import java.util.Iterator;
public class QueueTest{  
	public static void main(String args[]){  
		PriorityQueue<String> queue=new PriorityQueue<String>();  
		queue.add("Rajesh");  
		queue.add("Raj");  
		queue.add("Rakesh");  
		queue.add("ankita");  
		System.out.println("head:"+queue.peek());  //print first element
		System.out.println("printing all elements:");  
		Iterator itr=queue.iterator();  
		while(itr.hasNext()){  
			System.out.println(itr.next()); 
		}
	}  
}