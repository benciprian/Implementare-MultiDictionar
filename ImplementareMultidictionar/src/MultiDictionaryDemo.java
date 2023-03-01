import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MultiDictionaryDemo {
    public static void main(String[] args) {
        MultiDictionary<String, String> dict = new MultiDictionary<String, String>();

        dict.put("fruit", "apple");
        dict.put("fruit", "banana");
        dict.put("fruit", "orange");

        dict.put("color", "red");
        dict.put("color", "green");
        dict.put("color", "blue");

        ArrayList<String> fruits = dict.get("fruit");
        ArrayList<String> colors = dict.get("color");

        System.out.println("Fruits: " + fruits);
        System.out.println("Colors: " + colors);
    }
}
/*A multidictionary is a data structure that allows you to map multiple values to a single key.
In Java, you can implement a multidictionary using the java.util.Map interface and a collection class for the values.
One such collection class is java.util.ArrayList.
This code defines a MultiDictionary class that uses a HashMap to store the mappings between keys and collections of values.
 The put method adds a new value to the collection associated with a key, or creates a new collection if the key doesn't already exist.
  The get method retrieves the collection of values associated with a key.
  This code creates a MultiDictionary object and adds some key-value mappings using the put method.
  It then retrieves the collections of values associated with the "fruit" and "color" keys using the get method, and prints those collections.
  The output of the program should be:
  As you can see, the MultiDictionary class allows you to map multiple values to a single key,
   and provides methods for adding and retrieving those mappings.

makefile

 */
