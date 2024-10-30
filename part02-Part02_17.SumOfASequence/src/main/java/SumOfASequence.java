
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Last number? ");
        int end = Integer.valueOf(scan.nextLine());
        int sum = 0;
        for (int i = 1; i <= end; i = i + 1) {
            sum = sum + i;
        }
        System.out.println("The sum is " + sum);

    }
}
