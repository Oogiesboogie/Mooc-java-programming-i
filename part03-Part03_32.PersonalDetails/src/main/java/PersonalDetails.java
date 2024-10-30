
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;
        int year = 0;
        int temp = 0;
        int length;
        String name = null;
        
        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            } // end of if
            
            String[] parts = input.split(",");
            sum += Integer.valueOf(parts[1]);
            count++;
            length = parts[0].length();
            
            if (length > temp) {
                temp = length;
                name = parts[0];
            }
        } // end of while loop
        System.out.println("Longest name: " + name);
        if (count > 0) {
            System.out.println("Average of the birth years: " + ((double) sum / count));
        }
    }
}
