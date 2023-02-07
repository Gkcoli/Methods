import java.util.ArrayList;
import java.util.Scanner;

public class Nmixx {
  public static void main(String[] args) {
    // Create a Scanner
    Scanner scanner = new Scanner(System.in);

    // Create an ArrayList
    ArrayList<Integer> numbers = new ArrayList<>();

    // Add elements to the ArrayList
    numbers.add(15);
    numbers.add(30);
    numbers.add(25);
    numbers.add(19);
    numbers.add(30);
    numbers.add(40);

    // Continuously ask the user to select an element to delete
    while (!numbers.isEmpty()) {
      // Print the current set of elements
      System.out.println("Current elements: " + numbers);

      // Prompt the user to select an element to delete
      System.out.println("Enter the element to delete:");
      int element = scanner.nextInt();

      // Delete the element from the ArrayList
      numbers.remove(new Integer(element));
    }

    System.out.println("The ArrayList is empty.");
  }
}
