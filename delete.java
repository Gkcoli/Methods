import java.util.Scanner;

public class DeleteElements {
  public static void main(String[] args) {
    // Initialize an array of elements
    int[] elements = {15, 30, 25, 19, 30, 40};

    // Create a Scanner to read user input
    Scanner scanner = new Scanner(System.in);

    while (elements.length > 0) {
      // Print the current set of elements
      System.out.print("Current elements: ");
      for (int i = 0; i < elements.length; i++) {
        System.out.print(elements[i] + " ");
      }
      System.out.println();

      // Ask the user to select an element to delete
      System.out.print("Select an element to delete (1-" + elements.length + "): ");
      int selectedIndex = scanner.nextInt();

      // Delete the selected element from the array
      int[] newElements = new int[elements.length - 1];
      for (int i = 0; i < selectedIndex - 1; i++) {
        newElements[i] = elements[i];
      }
      for (int i = selectedIndex; i < elements.length; i++) {
        newElements[i - 1] = elements[i];
      }
      elements = newElements;
    }

    // Print a message when the array is empty
    System.out.println("All elements have been deleted.");
  }
}
