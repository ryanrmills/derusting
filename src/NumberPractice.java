public class NumberPractice {
  public static void main(String args[]) {
    // Create a float with a negative value and assign it to a variable

    // Create an int with a positive value and assign it to a variable

    // Use the modulo % operator to find the remainder when the int is divided by 3

    // Use the modulo % operator to determine whether the number is even
    // (A number is even if it has a remainder of zero when divided by 2)
    // Use an if-else to print "Even" if the number is even and "Odd"
    // if the number is odd.

    // Divide the number by another number using integer division

    /*
     * Reminder!
     * 
     * When dividing ints, the result is rounded down.
     * Example: 
     * 7 / 3 = 2 when performing int division
     */
    float negValue = -1;
    int posValue = 1;
    int remainder = posValue % 3;

    // boolean isEven = posValue % 2 == 0 ? true : false;
    String isEven = null;
    if (posValue % 2 == 0){
      isEven = "even";
    } else {
      isEven = "odd";
    }

    int divisionResult = posValue / remainder;
  }
}
