
import java.util.Scanner;

public class NumberOfStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            } // end of if loop
            count++;
        } // end of while loop
        System.out.println(count);
    }
}
