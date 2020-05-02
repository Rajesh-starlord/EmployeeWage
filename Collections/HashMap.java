// Import the HashMap class
import java.util.HashMap;
class HashMapTest{
  public static void main(String[] args) {
    // Create a HashMap object called capitalCities
    HashMap<String,String> Cities = new HashMap<String,String>();
    // Add keys and values (Country, City)
    Cities.put("England", "London");
    Cities.put("Germany", "Berlin");
    Cities.put("Norway", "Oslo");
    Cities.put("USA", "Washington DC");
    System.out.println(Cities);
  }
}