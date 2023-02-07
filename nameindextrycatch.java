import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // Declare an array of 10 first names
        String[] names = {"Coli", "Blix", "Franze", "Allen", "Cristian",
                          "Iber", "Gelo", "Dhan", "Aldrin", "Andrew one/two" , 
                          "Nicko"};

        Scanner scanner = new Scanner(System.in);

        // Prompt the user for an index
        System.out.print("Enter an index: ");
        int index = scanner.nextInt();

        try {
            // Try to display the name at the requested index
            System.out.println("Name: " + names[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Catch the ArrayIndexOutOfBoundsException and display an error message
            System.out.println("Error: The index you entered is out of range!");
        }
    }
}
