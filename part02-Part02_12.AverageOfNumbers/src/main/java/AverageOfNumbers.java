
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = 0;
        int sum = 0;
        double avg = 0.0;
        
        while (true) {
            System.out.println("Give a number: ");
            int input = Integer.valueOf(scan.nextLine());
            
            if (input == 0) {
                break;
            }
            if (input != 0) {
                num += 1;
                sum += input;
                avg = (double) sum / num;
                
            }
        }
        System.out.println("Average of the numbers: " + avg);

    }
}
