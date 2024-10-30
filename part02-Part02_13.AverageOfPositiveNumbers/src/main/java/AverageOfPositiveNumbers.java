
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = 0;
        int sum = 0;
        double avg = 0.0;
        
        while (true) {
            int input = Integer.valueOf(scan.nextLine());
            
            if (input == 0) {
                break;
            }
            if (input > 0) {
                num += 1;
                sum += input;
                avg = (double) sum / num;
            }
        }
        if (avg <= 0) {
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println(avg);
        }
        

    }
}
