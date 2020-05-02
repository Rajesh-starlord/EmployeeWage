import java.util.Stack;  
import java.util.Iterator;
class StackTest{  
	public static void main(String args[]){  
		Stack<String> stack = new Stack<String>();  
		stack.push("one"); //adding an element 
		stack.push("two");  
		stack.push("three");  
		stack.push("four");  
		stack.push("five");  
		//printing all elements
		Iterator<String> itr=stack.iterator();  
		while(itr.hasNext()){  
			System.out.println(itr.next());  
		}  
		stack.pop();  //deleting an element
	  	System.out.println("after deletion");
		Iterator<String> itr1=stack.iterator();  
		while(itr1.hasNext()){  
			System.out.println(itr1.next());  
		}  
	}
}  