
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = 0;
        int sum = 0;
        
        while (true) {
            System.out.println("Give a number: ");
            int input = Integer.valueOf(scan.nextLine());
            
            if (input == 0) {
                break;
            }
            if (input != 0) {
                count += 1;
                sum += input;
            }
        }
        System.out.println("Number of numbers: " + count);
        System.out.println("Sum of the numbers: " + sum);

    }
}
