import java.util.*;
class HashTableTest {

   public static void main(String args[]) {
      // Create a hash table
	  Hashtable<String, Double> student = new Hashtable<String, Double>();
	  
	  student.put("Kanhar", 90.0);
	  student.put("sinaz", 80.80);
	  student.put("Ayan", 95.50);
	  student.put("robin",67.87);
	  student.put("raj", 55.0);
	  System.out.println(student);
	}
}