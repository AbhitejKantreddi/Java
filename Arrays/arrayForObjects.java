package Arrays;
import java.util.Arrays;
import java.util.Scanner;
//import java.util.Arrays;

public class arrayForObjects {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Initialize an array of Strings
        String[] str = new String[4];

        // Take input from the user to fill the array
        for (int i = 0; i < str.length; i++) {
            System.out.print("Enter a string: ");
            str[i] = in.next(); // Read the next string
        }

        // Print the array using Arrays.toString
        System.out.println("Array contents: " + Arrays.toString(str));

        // Close the scanner object
        in.close();
    }
}
