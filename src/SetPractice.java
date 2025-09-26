import java.util.Set;
import java.util.HashSet;

public class SetPractice {
  public static void main(String[] args) {
    // Create a HashSet of Strings and assign it to a variable of type Set

    // Add 3 elements to the set
    // (It's OK to do it one-by-one)

    // Check whether the Set contains a given String

    // Remove an element from the Set

    // Get the size of the Set

    // Iterate over the elements of the Set, printing each one on a separate line

    /*
     * Warning!
     * 
     * The iteration order over the items in a HashSet is NOT GUARANTEED.
     * 
     * Even running the exact same program multiple times may give different results.
     * Do not use a HashSet if order is important! You can use a TreeSet if you
     * want items in sorted order, or an array or List if you want them in a specified
     * order.
     * 
     * Also remember that sets do NOT have duplicates.
     */

    Set<String> stringSet = new HashSet<>();

    stringSet.add("Ryan");
    stringSet.add("Hannah");
    stringSet.add("Emmy");

    System.out.println(stringSet.contains("Ryan"));

    stringSet.remove("Ryan");

    System.out.println(stringSet.size());

    for (String name : stringSet){
      System.out.println(name);
    }
    
  }
}
