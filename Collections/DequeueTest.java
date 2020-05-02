import java.util.Deque;
import java.util.ArrayDeque;
import java.util.Iterator;
class DequeueTest{  
	public static void main(String[] args) {   
		Deque<String> deq = new ArrayDeque<String>();  
		deq.add("Kalyani");  
		deq.add("Rajesh");  
		deq.add("Aryan");
		deq.add("karan");
		for (String str : deq) {  
			System.out.println(str);  
		} 
		deq.addLast("ankita");//adding element to the last
		deq.addFirst("swastika");//adding at first
		System.out.println("elements after adding at first and last");
		for (String str1 : deq) {  
			System.out.println(str1);  
		} 
	}  
}  